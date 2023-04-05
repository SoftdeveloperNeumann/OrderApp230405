package com.example.orderapp230405.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.orderapp230405.R
import com.example.orderapp230405.databinding.FragmentPizzaBinding
import com.example.orderapp230405.model.Pizza
import com.example.orderapp230405.util.PizzaAdapter


class PizzaFragment : Fragment() {

    private lateinit var binding: FragmentPizzaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPizzaBinding.inflate(inflater,container,false)

        binding.pizzaList.adapter = PizzaAdapter(Pizza.pizzen)
        binding.pizzaList.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }


}