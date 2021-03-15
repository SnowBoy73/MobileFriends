package com.example.friends.GUI

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.friends.R
//import kotlinx.android.synthetic.main.friend_details.*

class DetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.friend_details)

        Toast.makeText(
            this,
            "SUCCESS",
            Toast.LENGTH_LONG
        ).show()
    }

}