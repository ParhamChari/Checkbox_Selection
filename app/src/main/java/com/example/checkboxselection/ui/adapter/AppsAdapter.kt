package com.example.checkboxselection.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.checkboxselection.data.model.AppModel
import com.example.checkboxselection.databinding.AppItemBinding

class AppsAdapter(val models: ArrayList<AppModel>) : Adapter<AppsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppsViewHolder =
        AppsViewHolder(AppItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))


    override fun onBindViewHolder(holder: AppsViewHolder, position: Int) {
        holder.bindViews(models[position])
    }

    override fun getItemCount(): Int = models.size

}