package com.example.multiscreen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.multiscreen1.databinding.FragmentMejnBinding


class Mejn : Fragment() {


    private lateinit var binding: FragmentMejnBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_mejn, container, false)

        binding.mainBear.setOnClickListener {
            findNavController().navigate(R.id.action_main_to_bear)
        }

        binding.mainOtter.setOnClickListener {
            findNavController().navigate(R.id.action_main_to_otter)
        }

        binding.mainPenguin.setOnClickListener {
            findNavController().navigate(R.id.action_main_to_pingu)
        }

        binding.mainSeal.setOnClickListener {
            findNavController().navigate(R.id.action_main_to_seal)
        }



        return binding.root


    }
}