package com.tchirktema.mybt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Declaration de variable
    private var progressBarStatus = 0
    var dummy:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //task to run thread
        Thread(Runnable {
            //boucle pour la progression du thread
            while (progressBarStatus < 100){
                try {
                    dummy = dummy + 25
                    Thread.sleep(1000)
                } catch (e: InterruptedException){
                    e.printStackTrace()
                }
                // tracking du thread
                progressBarStatus = dummy
                //mise a jour de la bar de progresssion
                progressBar.progress = progressBarStatus
            }
        }).start()
    }
}
