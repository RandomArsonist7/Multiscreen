package com.example.multiscreen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.multiscreen1.databinding.FragmentPinguBinding


class Pingu : Fragment() {


    private lateinit var binding: FragmentPinguBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pingu, container,false)
        binding.Penguin.isClickable = false

        binding.penguinBear.setOnClickListener {
            findNavController().navigate(R.id.action_pingu_to_bearz2)
        }

        binding.penguinOtter.setOnClickListener {
            findNavController().navigate(R.id.action_pingu_to_otterz2)
        }

        binding.penguinSeal.setOnClickListener {
            findNavController().navigate(R.id.action_pingu_to_sealz2)
        }
        return binding.root
    }
}