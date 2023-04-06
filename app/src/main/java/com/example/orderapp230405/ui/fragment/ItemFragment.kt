package com.example.orderapp230405.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.orderapp230405.databinding.FragmentItemBinding
import com.example.orderapp230405.model.Drink
import com.example.orderapp230405.model.Item
import com.example.orderapp230405.model.Pasta
import com.example.orderapp230405.model.Pizza
import com.example.orderapp230405.util.ItemAdapter


class ItemFragment : Fragment() {

    private lateinit var binding:FragmentItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItemBinding.inflate(inflater,container,false)

        val itemType = requireArguments().getInt("item")

        val adapter = when(itemType){
            1 -> ItemAdapter(Pizza.items)
            2 -> ItemAdapter(Pasta.items)
            3 -> ItemAdapter(Drink.items)
            else -> null
        }


        binding.itemList.adapter = adapter
//        binding.pizzaList.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,false)
        binding.itemList.layoutManager = GridLayoutManager(activity,2)
//        binding.pizzaList.layoutManager = StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)

        adapter?.setListener(object : ItemAdapter.Listener {
            override fun onItemClick(position: Int) {
                val item = adapter.items[position]
                Toast.makeText(activity, "Es wurde ${when (itemType){
                    1 -> "eine Pizza" ; 2 -> "das Nudelgericht" ; 3 -> "das Getränk"; else -> ""
                }} ${item.name} ausgewählt", Toast.LENGTH_SHORT).show()
            }
        })
        
        return binding.root
    }


}