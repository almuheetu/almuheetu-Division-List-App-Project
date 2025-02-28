package com.example.myapplication

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.myapplication.placeholder.PlaceholderContent.PlaceholderItem
import com.example.myapplication.databinding.AdapterThanaBinding

class ThanaAdapter(
    private val thanaList: ArrayList<Thana>
) : RecyclerView.Adapter<ThanaAdapter.ViewHolder>() {
    class ViewHolder(val binding: AdapterThanaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterThanaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val thana = thanaList[position]
        viewHolder.binding.tvThanaName.text = thana.thanaName
        viewHolder.itemView.setOnClickListener {

        }

    }

    override fun getItemCount(): Int {
        return thanaList.size

    }

}