package com.example.multiscreen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.multiscreen1.databinding.FragmentBearzBinding


class Bearz : Fragment() {


    private lateinit var binding: FragmentBearzBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bearz, container,false)

        binding.Bear.isClickable = false

        binding.bearOtter.setOnClickListener {
            findNavController().navigate(R.id.action_bearz2_to_otterz)
        }

        binding.bearPenguin.setOnClickListener {
            findNavController().navigate(R.id.action_bearz2_to_pingu)
        }

        binding.bearSeal.setOnClickListener {
            findNavController().navigate(R.id.action_bearz2_to_sealz)
        }

        return binding.root
    }


}