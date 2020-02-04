package com.example.himanshu_test.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.himanshu_test.R
import kotlinx.android.synthetic.main.row_common_adapter.view.*

class RecyclerDataAdapter(
    private val context: Context,
    var list: ArrayList<String>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.row_common_adapter, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.tv_player_name.text = list[position]
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //Nothing
    }
}