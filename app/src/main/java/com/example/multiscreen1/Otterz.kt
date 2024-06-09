package com.example.multiscreen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.multiscreen1.databinding.FragmentOtterzBinding


class Otterz : Fragment() {


    private lateinit var binding: FragmentOtterzBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_otterz, container,false)
        binding.Otter.isClickable = false

        binding.otterBear.setOnClickListener {
            findNavController().navigate(R.id.action_otterz_to_bearz2)
        }

        binding.otterPenguin.setOnClickListener {
            findNavController().navigate(R.id.action_otterz_to_pingu2)
        }

        binding.otterSeal.setOnClickListener {
            findNavController().navigate(R.id.action_otterz_to_sealz2)
        }

        return binding.root
    }
}