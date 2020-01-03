package com.dantu.findingsita.ui.main

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.dantu.findingsita.MainActivity
import com.dantu.findingsita.R
import com.dantu.findingsita.repository.database.Player
import kotlinx.android.synthetic.main.manage_players.*


class PlayersFragment : Fragment() {

    private lateinit var playerViewModel: PlayersViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.manage_players, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        playerViewModel = ViewModelProviders.of(this).get(PlayersViewModel::class.java)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        add_new_player.setOnClickListener {
            //launch add player fragment
            fragmentManager?.beginTransaction()?.replace(R.id.container, AddOrEditPlayerFragment())?.
                addToBackStack(AddOrEditPlayerFragment::class.qualifiedName)
                ?.commit();
        }

        val players = playerViewModel.getPlayers()
        if (players.value?.size == 0) {
            no_player_guide.visibility = View.VISIBLE
        } else {
            no_player_guide.visibility = View.GONE
        }
        players.observe(this, Observer {
            if (it.size == 0) {
                no_player_guide.visibility = View.VISIBLE
            } else {
                no_player_guide.visibility = View.GONE
            }
            updatePlayers(it)
        })

        val linearLayoutManager = GridLayoutManager(activity, 2)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        players_recyclerview.layoutManager = linearLayoutManager
        players_recyclerview.adapter = PlayersAdapter(activity!!)


        val itemTouchHelperCallback: SimpleCallback =
            object : SimpleCallback(0, ItemTouchHelper.LEFT) {
                override fun onMove(
                    recyclerView: RecyclerView,
                    viewHolder: ViewHolder,
                    target: ViewHolder
                ): Boolean {
                    return false
                }

                override fun onSwiped(
                    viewHolder: ViewHolder,
                    direction: Int
                ) { // Row is swiped from recycler view
// remove it from adapter
                    Log.d("", "")
                    val tag : Int = (viewHolder as PlayersAdapter.PlayerViewHolder).playerName.tag as Int
                    val player = playerViewModel.getPlayerById(playerId = tag)
                    playerViewModel.deletePlayer(player)
                }

                /*fun onChildDraw(
                    c: Canvas?,
                    recyclerView: RecyclerView?,
                    viewHolder: ViewHolder?,
                    dX: Float,
                    dY: Float,
                    actionState: Int,
                    isCurrentlyActive: Boolean
                ) { // view the background view
                }*/
            }

// attaching the touch helper to recycler view
        // attaching the touch helper to recycler view
        ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(players_recyclerview)

    }

    override fun onResume() {
        super.onResume()
        updateActionBar()
//        updatePlayers();
    }

    private fun updatePlayers(it: List<Player>) {
        (players_recyclerview.adapter as PlayersAdapter).setData(it)
    }

    private fun updateActionBar() {
        val supportActionBar = (activity as MainActivity).supportActionBar

        supportActionBar?.title = "Players"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}

class PlayersAdapter(var context : FragmentActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var players: List<Player> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PlayerViewHolder(LayoutInflater.from(context).inflate(R.layout.player_row, parent, false))
    }

    class PlayerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val playerName : TextView
        val playerImage : ImageView
        val viewParent : View
        init {
            viewParent = view;
            playerName = view.findViewById(R.id.player_name)
            playerImage = view.findViewById(R.id.player_image)
        }
    }

    fun setData(players : List<Player>) {
        this.players = players;
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return players.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val player = players.get(position)
        val playerViewHolder = holder as PlayerViewHolder
        playerViewHolder.playerName.text = player.playerName
        playerViewHolder.playerName.tag = player.playerId

        if (player.image != null) {
            playerViewHolder.playerImage.setImageBitmap(
                BitmapFactory.decodeByteArray(
                    player.image, 0,
                    player.image!!.size
                )
            );
        }

        playerViewHolder.viewParent.setOnClickListener {
            val addOrEditPlayerFragment = AddOrEditPlayerFragment()
            val bundle = Bundle()
            bundle.putInt(AddOrEditPlayerFragment.Companion.EXTRA_PLAYER_ID, player.playerId)
            addOrEditPlayerFragment.arguments = bundle
            context.supportFragmentManager?.beginTransaction()?.replace(R.id.container,
                addOrEditPlayerFragment
            )?.
                addToBackStack(AddOrEditPlayerFragment::class.qualifiedName)
                ?.commit();
        }
    }

}
