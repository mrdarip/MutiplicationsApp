package com.mrdarip.multiplications

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mrdarip.multiplications.databinding.MultiplicationBinding

class MultiplicationsAdapter(val t:Int):RecyclerView.Adapter<MultiplicationHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MultiplicationHolder {
        val binding =
            MultiplicationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MultiplicationHolder(binding)
    }

    override fun getItemCount() = 100

    override fun onBindViewHolder(holder: MultiplicationHolder, position: Int) {
        holder.conseguirMultiplicacion(position, t)
    }
}