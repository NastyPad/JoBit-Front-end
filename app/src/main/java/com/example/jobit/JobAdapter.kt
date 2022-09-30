package com.example.jobit

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.prototype_jobs.view.*

class JobAdapter(var jobs: ArrayList<Job>): RecyclerView.Adapter<JobsPrototype>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobsPrototype {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.prototype_jobs, parent, false)

        return JobsPrototype(view)
    }

    override fun onBindViewHolder(holder: JobsPrototype, position: Int) {
        holder.bind(jobs.get(position))
    }

    override fun getItemCount(): Int {
        return jobs.size
    }


}

class JobsPrototype(itemView: View): RecyclerView.ViewHolder(itemView) {
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTittle)
    val tvDesctiption = itemView.findViewById<TextView>(R.id.tvDescription)
    val tvMoney = itemView.findViewById<TextView>(R.id.tvMoney)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    val ivLogo = itemView.findViewById<ImageView>(R.id.ivLogo)
    val tvEdit = itemView.findViewById<TextView>(R.id.tvEdit)
    val tvDelete = itemView.findViewById<TextView>(R.id.tvDelete)



    fun bind(job: Job){
        tvTitle.text = job.title
        tvDesctiption.text = job.desciption
        tvMoney.text = job.money
        tvDate.text = job.date
        ivLogo.setImageResource(job.logo)
    }

}
