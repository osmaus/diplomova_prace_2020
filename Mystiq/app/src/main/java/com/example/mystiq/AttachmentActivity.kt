package com.example.mystiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_attachment.*

class AttachmentActivity : AppCompatActivity() {

    private lateinit var attachmentAdapter: AttachmentRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attachment)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource_Attachment.createDataSet()
        attachmentAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@AttachmentActivity)
            attachmentAdapter = AttachmentRecyclerAdapter()
            adapter = attachmentAdapter
        }
    }
}
