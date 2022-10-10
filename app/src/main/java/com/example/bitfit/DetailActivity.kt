package com.example.bitfit

import android.content.ClipData
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

//private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity(){
    lateinit var mItem: List<ClipData.Item>
    lateinit var healths: ArrayList<Health>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val recordBtn = findViewById<Button>(R.id.recordButton)

        healths = ArrayList()

        recordBtn.setOnClickListener {
            val hourSleep = findViewById<EditText>(R.id.enterSleep).text.toString()
            val date = findViewById<EditText>(R.id.enterDate).text.toString()

            healths.add(Health(hourSleep, date))


            // TODO Save this event to the database
            lifecycleScope.launch(IO){
                (application as MyApplication).db.healthDao().insert(
                    Health(hourSleep, date)
                )

            }

            //finish()
        }

        val sleepingList = findViewById<RecyclerView>(R.id.sleep)

        val adapter = SleepAdapter(healths)

        sleepingList.adapter = adapter
        sleepingList.layoutManager = LinearLayoutManager(this)
    }
}

