package com.hllbr.fragmentkotlindifferent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //this app is not problem for fragments complexity
    }
    fun fragment1click(view: View) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fr1 = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout,fr1).commit()
    }
    fun fragment2click(view: View) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fr2 = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,fr2).commit()

    }
}