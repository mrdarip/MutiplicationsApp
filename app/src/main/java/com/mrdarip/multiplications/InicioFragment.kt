package com.mrdarip.multiplications

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.mrdarip.multiplications.databinding.FragmentInicioBinding

class InicioFragment : Fragment() {
   lateinit var binding: FragmentInicioBinding
   lateinit var viewModel: InicioViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        initializeBinding()
        initializeViewModel()

        binding.button.setOnClickListener(){
            if(binding.textView.text.isNotEmpty()) {
                val action = InicioFragmentDirections.actionInicioFragmentToResultadoFragment(
                    binding.editTextNumber.text.toString().toInt()
                )
                findNavController().navigate(action)
            }
        }

        return binding.root
    }

    private fun initializeBinding() {
        binding = FragmentInicioBinding.inflate(layoutInflater)
    }

    private fun initializeViewModel() {
        viewModel = ViewModelProvider(this).get(InicioViewModel::class.java)
    }


}