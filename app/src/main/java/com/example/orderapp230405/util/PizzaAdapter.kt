package com.example.orderapp230405.util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.orderapp230405.databinding.PizzaLayoutBinding
import com.example.orderapp230405.model.Pizza

class PizzaAdapter(val pizzen: Array<Pizza>) : RecyclerView.Adapter<PizzaAdapter.ViewHolder> (){
    class ViewHolder(val binding: PizzaLayoutBinding) : RecyclerView.ViewHolder(binding.root){

    }

    interface Listener{
        fun onItemClick(position: Int)
    }

    private var listener: Listener? = null

    fun setListener(listener: Listener){
        this.listener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val cardView = PizzaLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(cardView)
    }

    override fun getItemCount()= pizzen.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val cardView = holder.binding
        cardView.tvPizzaName.text = pizzen[position].name
        cardView.tvPizzaPreis.text = pizzen[position].price.toString()
        val imageView = cardView.imgPizza
        val image = ContextCompat.getDrawable(imageView.context,pizzen[position].imageResource)
        imageView.setImageDrawable(image)
        cardView.root.setOnClickListener {
            listener?.onItemClick(position)
        }
    }
}