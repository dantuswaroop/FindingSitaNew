package com.dantu.findingsita.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dantu.findingsita.MainActivity
import com.dantu.findingsita.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        manage_players.setOnClickListener {
            //launch manage players fragment
            fragmentManager?.beginTransaction()?.replace(R.id.container, PlayersFragment())?.
                addToBackStack(PlayersFragment::class.qualifiedName)
                ?.commit();
        }

    }

    override fun onResume() {
        super.onResume()
        updateActionBar()
    }

    private fun updateActionBar() {
        val supportActionBar = (activity as MainActivity).supportActionBar

        supportActionBar?.title = "Findind Sita"
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }

}
