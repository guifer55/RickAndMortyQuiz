package com.example.rickandmorty.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.example.rickandmorty.R
import com.example.rickandmorty.databinding.FragmentAboutBinding

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    lateinit var navController: NavController
    lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_about, container, false
        )

        return binding.root
    }

}