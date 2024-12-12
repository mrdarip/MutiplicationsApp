package com.mrdarip.multiplications

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.mrdarip.multiplications.databinding.FragmentResultadoBinding

class ResultadoFragment : Fragment() {
    lateinit var binding: FragmentResultadoBinding
    lateinit var viewModel: InicioViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initializeBinding()
        initializeViewModel()
        initializeRecyclerView()

        return binding.root
    }

    private fun initializeBinding() {
        binding = FragmentResultadoBinding.inflate(layoutInflater)
    }

    private fun initializeRecyclerView() {
        val tabla = ResultadoFragmentArgs.fromBundle(requireArguments()).number
        binding.recView.adapter = MultiplicationsAdapter(tabla)
    }

    private fun initializeViewModel(){
        viewModel = ViewModelProvider(this).get(InicioViewModel::class.java)
    }
}