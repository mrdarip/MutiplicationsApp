package com.mrdarip.multiplications

import androidx.recyclerview.widget.RecyclerView
import com.mrdarip.multiplications.databinding.MultiplicationBinding

class MultiplicationHolder(val binding: MultiplicationBinding) : RecyclerView.ViewHolder(binding.root) {
    fun conseguirMultiplicacion(n: Int, tabla: Int){
        binding.x.text = "$n";
        binding.y.text ="$tabla"
        binding.z.text = "${n * tabla}"

    }
}