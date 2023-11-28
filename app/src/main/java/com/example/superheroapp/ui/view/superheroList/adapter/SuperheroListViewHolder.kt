package com.example.superheroapp.ui.view.superheroList.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.superheroapp.data.network.response.Superhero
import com.example.superheroapp.databinding.ItemSuperheroBinding

class SuperheroListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(itemView)

    fun render(superheroList: Superhero) {

        binding.tvNameSuperhero.text = superheroList.name
        Glide.with(binding.ivSuperhero).load(superheroList.image.url).into(binding.ivSuperhero)
    }
}