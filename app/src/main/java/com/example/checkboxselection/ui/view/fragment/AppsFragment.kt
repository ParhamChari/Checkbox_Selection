package com.example.checkboxselection.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.checkboxselection.databinding.AppItemBinding
import com.example.checkboxselection.databinding.FragmentAppsBinding
import com.example.checkboxselection.ui.adapter.AppsAdapter
import com.example.checkboxselection.utils.FakeData
import com.google.android.material.checkbox.MaterialCheckBox

class AppsFragment : Fragment() {
    private lateinit var binding: FragmentAppsBinding
    private lateinit var appAdapter: AppsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentAppsBinding.inflate(inflater, container, false)

        bindViews()

        return binding.root
    }


    private fun bindViews() {
        appAdapter = AppsAdapter(FakeData.appData)

        binding.appRecyclerview.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            adapter = appAdapter
        }
    }

}