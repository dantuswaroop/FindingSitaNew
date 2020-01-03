package com.dantu.findingsita.ui.main

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.provider.MediaStore
import android.text.TextUtils
import android.view.*
import android.widget.Toast
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.dantu.findingsita.MainActivity
import com.dantu.findingsita.R
import com.dantu.findingsita.repository.database.Player
import kotlinx.android.synthetic.main.add_player.*
import java.io.ByteArrayOutputStream


class AddOrEditPlayerFragment : Fragment() {
    private var player: Player? = null
    private var byteArray: ByteArray? = null
    private val CAMERA_REQUEST = 1888
    private val MY_CAMERA_PERMISSION_CODE = 100
    object Companion {
        val EXTRA_PLAYER_ID = "EXTRA_PLAYER_ID"
    }

    private var playerId: Int? = null
    var editMode : Boolean = false
    lateinit var playersViewModel : PlayersViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        playersViewModel = ViewModelProviders.of(this).get(PlayersViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_player, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        editMode = false;
        if (arguments != null) {
            playerId = arguments?.getInt(Companion.EXTRA_PLAYER_ID)
            if (playerId != null) {
                player = playersViewModel.getPlayerById(playerId!!)
                if (player != null) {
                    editMode = true
                    player_name.setText(player!!.playerName)
                    editTextNumberPassword.setText(player!!.password as String)
                    if (player!!.image != null) {
                        val bitmap =
                            BitmapFactory.decodeByteArray(player!!.image, 0, player!!.image!!.size);
                        imageView.setImageBitmap(bitmap)
                    }
                }
            }
        }

        save_player.setOnClickListener {
            if (TextUtils.isEmpty(player_name.text)) {
                playername_input.error = "Player name cannot be empty"
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(editTextNumberPassword.text)) {
                return@setOnClickListener
            }

            if(player == null) {
                player = Player(playerName = player_name.text.toString(),
                    password = editTextNumberPassword.text.toString())
            } else {
                player!!.playerName = player_name.text.toString()
                player!!.password = editTextNumberPassword.text.toString()
            }

            if (byteArray != null) {
                player!!.image = byteArray
            }
//            PlayerRepository(context!!).insertPlayer(player)
            if(editMode) {
                playersViewModel.updatePlayer(player!!)
            } else {
                playersViewModel.insertPlayer(player!!)
            }
            fragmentManager?.popBackStack();
        }

        imageView.setOnClickListener {
            //start capture image
            if (checkSelfPermission(activity!!, Manifest.permission.CAMERA) !== PackageManager.PERMISSION_GRANTED) {
                requestPermissions(
                    arrayOf(Manifest.permission.CAMERA),
                    MY_CAMERA_PERMISSION_CODE
                )
            } else {
                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(cameraIntent, CAMERA_REQUEST)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onResume() {
        super.onResume()
        updateActionBar()
    }

    private fun updateActionBar() {
        val supportActionBar = (activity as MainActivity).supportActionBar

        if (!editMode) {
            supportActionBar?.title = "Add Player"
        } else {
            supportActionBar?.title = "Edit Player"
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == MY_CAMERA_PERMISSION_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(cameraIntent, CAMERA_REQUEST)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            val photo = data?.extras!!["data"] as Bitmap?
            imageView.setImageBitmap(photo)
            val stream = ByteArrayOutputStream();
            photo?.compress(Bitmap.CompressFormat.PNG, 100, stream);
            byteArray = stream.toByteArray();
        }
    }
}