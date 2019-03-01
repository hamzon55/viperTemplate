package com.example.hamzajerbi.vipertemplate.Main.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.hamzajerbi.vipertemplate.R

class MainAdapter(val newsList: ArrayList<MainAdapterModel>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val v = LayoutInflater.from(p0?.context).inflate(R.layout.main_item_list, p0, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return newsList.count()
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.txtName?.text = newsList[p1].title
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById<TextView>(R.id.txt)
    }
}