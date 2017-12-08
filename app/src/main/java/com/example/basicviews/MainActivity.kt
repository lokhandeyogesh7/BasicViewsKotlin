package com.example.basicviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize views from layouts
        initViews()
    }

    private fun initViews() {

        btnDemo.setOnClickListener(this)
        cbDemo.setOnCheckedChangeListener(this)
        rbDemo.setOnCheckedChangeListener(this)

        setSupportActionBar(toolbar as Toolbar?)
    }

    override fun onClick(p0: View?) {
        //show toast
        showToast("Button Clicked")
    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        when (p0!!.id) {
            cbDemo.id -> {
                if (p1)
                    showToast("Checked")
                else
                    showToast("Unchecked")
            }

            rbDemo.id -> {
                if (p1)
                    showToast("Selected")
                else
                    showToast("Unselected")
            }
        }

    }

    private fun showToast(msg: String) {
        Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
    }
}
