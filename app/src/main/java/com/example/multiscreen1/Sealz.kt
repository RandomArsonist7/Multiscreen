package com.example.multiscreen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.multiscreen1.databinding.FragmentSealzBinding


class Sealz : Fragment() {


    private lateinit var binding: FragmentSealzBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sealz, container,false)
        binding.Seal.isClickable = false

        binding.sealBear.setOnClickListener {
            findNavController().navigate(R.id.action_sealz_to_bearz2)
        }

        binding.sealPenguin.setOnClickListener {
            findNavController().navigate(R.id.action_sealz_to_pingu2)
        }

        binding.sealOtter.setOnClickListener {
            findNavController().navigate(R.id.action_sealz_to_otterz2)
        }
        return binding.root
    }


}