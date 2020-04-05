package com.example.mystiq

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardv.setOnClickListener{
            startActivity(Intent(this, TotalActivity::class.java))
        }

        cardTimeResults.setOnClickListener {
            startActivity(Intent(this,TimeResultsActivity::class.java))
        }

        cardAnswerResults.setOnClickListener {
            startActivity(Intent(this, AnswerResultsActivity::class.java))
        }

        cardInstances.setOnClickListener {
            startActivity(Intent(this,InstancesActivity::class.java))
        }

        cardAttachments.setOnClickListener {
            startActivity(Intent(this, AttachmentActivity::class.java))
        }

        cardAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        cardFeedback.setOnClickListener{
            val emailIntent = Intent(Intent.ACTION_VIEW)
            val data : Uri = Uri.parse("mailto:?subject=" + "Feedback" + "&to=" + "michal.osmik@ipsos.com")
            emailIntent.data = data
            startActivity(emailIntent)
        }

    }
}
