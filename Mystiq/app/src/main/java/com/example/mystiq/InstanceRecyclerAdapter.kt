package com.example.mystiq

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.instace_row.view.*

class InstanceRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Instances> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return InstanceViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.instace_row, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is InstanceViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }

    fun submitList(instanceList: List<Instances>){
        items = instanceList
    }

    class InstanceViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val location = itemView.location
        val date = itemView.date
        val time = itemView.time
        val score = itemView.score

        fun bind(instance: Instances){
            location.setText(instance.location)
            date.setText(instance.date)
            time.setText(instance.time)
            score.setText(instance.score)

        }
    }

}