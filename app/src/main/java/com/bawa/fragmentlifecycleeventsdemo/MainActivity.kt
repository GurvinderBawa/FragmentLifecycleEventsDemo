package com.bawa.fragmentlifecycleeventsdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {


    val TAG = "D1MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: ")

        val addButton =  findViewById<Button>(R.id.addButton)
        val replaceButton =  findViewById<Button>(R.id.replaceButton)


        addButton.setOnClickListener {
            addFragment(NewsFragment())
        }

        replaceButton.setOnClickListener {
            replaceFragment(NewsDetailsFragment())
        }

    }

    fun addFragment(fragment : Fragment){

        supportFragmentManager.beginTransaction()
            .add(R.id.container ,fragment)
            //.addToBackStack("news")
            .commit()

        Log.d(TAG, "addFragment:  ${supportFragmentManager.backStackEntryCount}")
    }

    fun replaceFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container ,fragment)
            //.addToBackStack("newsDetails")
            .commit()
    }

    /*override fun onBackPressed() {

        val fragment = supportFragmentManager.findFragmentById(R.id.container)

        if(fragment!=null){
            fragment?.let {
                supportFragmentManager.beginTransaction().remove(fragment).commit()
            }
        }else{
            super.onBackPressed()
        }

    }*/



















    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }


    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }




    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
























}