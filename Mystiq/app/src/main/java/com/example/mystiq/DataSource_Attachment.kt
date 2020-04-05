package com.example.mystiq

import java.util.ArrayList

class DataSource_Attachment {
    companion object{
        fun createDataSet(): ArrayList<Attachment> {
            val list = ArrayList<Attachment>()
            list.add(Attachment("Návštěva 2.1.2020 Kolín", "https://lh3.googleusercontent.com/proxy/0b70lYHnp3lyixjOwZ_t7K2vy6lE3H9YLjZ8HlLo6kEeWCp_-plHTAO28RJURBKgoUtYd_7v614AhYuRn4lK0VMbY0Vs_Mem8xMlRA"))

            return list
        }
    }
}