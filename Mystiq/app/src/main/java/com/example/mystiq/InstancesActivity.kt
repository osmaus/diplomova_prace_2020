package com.example.mystiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_instances.*



class InstancesActivity : AppCompatActivity() {

    private lateinit var instanceAdapter: InstanceRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instances)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet (){
        val data = DataSource.createDataSet()
        instanceAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(this@InstancesActivity)
            instanceAdapter = InstanceRecyclerAdapter()
            adapter = instanceAdapter
        }
    }

}


