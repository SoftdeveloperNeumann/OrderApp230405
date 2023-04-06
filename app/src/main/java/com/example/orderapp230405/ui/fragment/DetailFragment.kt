package com.example.orderapp230405.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.orderapp230405.R
import com.example.orderapp230405.databinding.FragmentDetailBinding
import com.example.orderapp230405.model.Item


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = arguments?.getBundle("item")
        val item = bundle?.getParcelable<Item>("item")

        with(binding){
            tvName.text = item?.name
            tvDesc.text = "Ein kleiner Text zur Beschreibung"
            tvPrice.text = "%.2f %s".format(item?.price, "€")
            imageView.setImageDrawable(requireContext().getDrawable(item!!.imageResource))
        }
    }


}