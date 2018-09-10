package com.github.gmetal.data.moviedbapi

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.github.gmetal.domain.model.MediaInfo

class MovieListAdapter(val inflater: LayoutInflater) : RecyclerView.Adapter<MovieListAdapter.MovieListViewHolder>() {

    var data: MutableList<MediaInfo> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder =
            MovieListViewHolder(inflater.inflate(R.layout.list_movie_item, parent, false))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        holder.movieTitle.text = data[position].name
    }

    class MovieListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieTitle: TextView = itemView.findViewById(R.id.movie_title)
    }
}