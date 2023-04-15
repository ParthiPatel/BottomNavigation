package com.example.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.databinding.FragmentFirstBinding
import com.example.bottomnavigation.databinding.FragmentSecondBinding


class secondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentSecondBinding.inflate(layoutInflater)
        binding.txt2.setOnClickListener {
            findNavController().navigate(
                R.id.action_secondFragment_to_thirdFragment, null
            )
        }
        return binding.root
    }


}