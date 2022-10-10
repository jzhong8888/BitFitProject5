package com.example.bitfit


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SleepAdapter (private val mItems: List<Health>) : RecyclerView.Adapter<SleepAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val hourTextView: TextView
        val dateTextView: TextView

        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            hourTextView = itemView.findViewById(R.id.sleepHours)
            dateTextView = itemView.findViewById(R.id.date)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.item_sleep, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val sleeping = mItems.get(position)
        // Set item views based on views and data model
        holder.hourTextView.text = sleeping.hoursOfSleep
        holder.dateTextView.text = sleeping.date

    }

    override fun getItemCount(): Int {
        return mItems.size

    }

}