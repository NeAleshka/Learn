package com.example.learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    lateinit var launch:ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        launch=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result:ActivityResult->{

        }
        }
        var user=User("Alex", "123", 13)
        var user2=User("Andrey", "11", 22)
        user.addAge(10)
        user2.addAge(-2)
        user.log()
        user2.log()


    }
}