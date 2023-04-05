package com.example.orderapp230405

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.orderapp230405.databinding.ActivityMainBinding
import com.example.orderapp230405.ui.fragment.MainFragment
import com.example.orderapp230405.ui.fragment.PizzaFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var tabArray: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        tabArray = resources.getStringArray(R.array.tab_names)

        binding.pager.adapter = object : FragmentStateAdapter(supportFragmentManager,lifecycle){
            override fun getItemCount()= tabArray.size


            override fun createFragment(position: Int): Fragment {
               return when(position){
                   0 -> MainFragment()
                   1 -> PizzaFragment()
                   else -> Fragment()
               }
            }
        }
        TabLayoutMediator(binding.tabs,binding.pager){tab,position->
            tab.text = tabArray[position]
        }.attach()
    }
}