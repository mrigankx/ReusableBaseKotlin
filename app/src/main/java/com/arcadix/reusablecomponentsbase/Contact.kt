package com.arcadix.reusablecomponentsbase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Contact : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_activity)
    }
}