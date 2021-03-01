package com.example.rickandmorty.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.rickandmorty.R
import com.example.rickandmorty.databinding.FragmentGameBinding


class GameFragment : Fragment() {

    lateinit var navController: NavController
    lateinit var binding: FragmentGameBinding

    private lateinit var viewModel: GameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game, container, false
        )

        viewModel = ViewModelProvider(this).get(GameViewModel::class.java)

        binding.gameViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = view.findNavController()

    }

    override fun onStart() {
        super.onStart()

    }

    private fun gameFinished() {
        val action = GameFragmentDirections.actionGameFragmentToGameOverFragment(viewModel.score.value)
        NavHostFragment.findNavController(this).navigate(action)

        viewModel.onGameFinishComplete()
    }


}