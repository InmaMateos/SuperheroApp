package com.example.superheroapp.ui.view.superheroList.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.R
import com.example.superheroapp.data.network.response.Superhero


class SuperheroListAdapter(
    private var superheroList :List<Superhero> = emptyList()
):RecyclerView.Adapter<SuperheroListViewHolder>() {

    fun updateList(superheroList: List<Superhero>) {
        this.superheroList = superheroList
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroListViewHolder {
        return SuperheroListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_superhero, parent, false)
        )
    }

    override fun getItemCount(): Int = superheroList.size

    override fun onBindViewHolder(holder: SuperheroListViewHolder, position: Int) {
        holder.render(superheroList[position])
    }
}