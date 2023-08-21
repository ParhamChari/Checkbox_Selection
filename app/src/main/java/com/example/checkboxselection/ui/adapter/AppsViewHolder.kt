package com.example.checkboxselection.ui.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.checkboxselection.data.model.AppModel
import com.example.checkboxselection.databinding.AppItemBinding
import com.example.checkboxselection.ui.view.fragment.AppsFragment


class AppsViewHolder(private val binding: AppItemBinding) : ViewHolder(binding.root) {

    fun bindViews(model: AppModel) {

        binding.apply {
            appImage.setImageResource(model.appImage)
            appName.text = model.appName
        }

    }
}