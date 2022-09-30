package com.example.jobit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity_Home_Applicant : AppCompatActivity() {

    var jobs = ArrayList<Job>()
    var jobAdapter = JobAdapter(jobs)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_applicant)
        loadJobs()
        initView()
    }

    private fun loadJobs(){
        jobs.add(Job("Hola","Nose",R.drawable.claro_logo,"20/12/2000","S/ 1500"))
        jobs.add(Job("2222","aaaa",R.drawable.claro_logo,"20/12/2000","S/ 2500"))
    }

    private fun initView() {
        val rvJob = findViewById<RecyclerView>(R.id.rvJobs)
        rvJob.layoutManager = LinearLayoutManager(this)
        rvJob.adapter = jobAdapter
    }

}