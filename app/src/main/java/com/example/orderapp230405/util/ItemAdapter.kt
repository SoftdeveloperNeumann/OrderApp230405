package com.example.orderapp230405.util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.orderapp230405.databinding.ItemLayoutBinding
import com.example.orderapp230405.model.Item

class ItemAdapter(val items: Array<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder> (){
    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){

    }

    interface Listener{
        fun onItemClick(position: Int)
    }

    private var listener: Listener? = null

    fun setListener(listener: Listener){
        this.listener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val cardView = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(cardView)
    }

    override fun getItemCount()= items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val cardView = holder.binding
        cardView.tvItemName.text = items[position].name
        cardView.tvItemPreis.text = items[position].price.toString()
        val imageView = cardView.imgItem
        val image = ContextCompat.getDrawable(imageView.context,items[position].imageResource)
        imageView.setImageDrawable(image)
        cardView.root.setOnClickListener {
            listener?.onItemClick(position)
        }
    }
}