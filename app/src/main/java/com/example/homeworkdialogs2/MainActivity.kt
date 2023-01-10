package com.example.homeworkdialogs2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialButton>(R.id.bntcongrats).setOnClickListener { showCongrats() }
        findViewById<MaterialButton>(R.id.bntLose).setOnClickListener { showLose() }
        findViewById<MaterialButton>(R.id.bntWin).setOnClickListener { showWin() }

    }

    private fun showWin(){
        val layoutInflater3= LayoutInflater.from(this)
        val mydialog3 = layoutInflater3.inflate(R.layout.win_dialog, null)
        val btnOk2: MaterialButton = mydialog3.findViewById(R.id.btnOk2)
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.apply {
            setView(mydialog3)
            btnOk2.setOnClickListener {
                alertDialog.dismiss()
            }
        }.show()
    }

    private fun showLose(){
        val layoutInflater2= LayoutInflater.from(this)
        val mydialog2 = layoutInflater2.inflate(R.layout.lose_dialog, null)
        val btnOk: MaterialButton = mydialog2.findViewById(R.id.btnOk)
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.apply {
            setView(mydialog2)
            btnOk.setOnClickListener {
                alertDialog.dismiss()
            }
        }.show()
    }

    private fun showCongrats() {
        val layoutInflater = LayoutInflater.from(this)
        val mydialog = layoutInflater.inflate(R.layout.congrats_dialog, null)
        val btnDone: MaterialButton = mydialog.findViewById(R.id.btndone)
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.apply {
            setView(mydialog)

            btnDone.setOnClickListener {
                alertDialog.dismiss()
            }
        }.show()
    }
}