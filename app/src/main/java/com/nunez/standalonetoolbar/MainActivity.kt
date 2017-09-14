package com.nunez.standalonetoolbar

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.setNavigationIcon(R.drawable.ic_search_black)
        toolbar.setTitle("Search contact")

        setSupportActionBar(toolbar)

        toolbar.setOnClickListener {
            goToSearchActivity()
            Toast.makeText(this, "Toolbar clicked", Toast.LENGTH_SHORT).show()
        }

        toolbar.setNavigationOnClickListener {
            goToSearchActivity()
            Toast.makeText(this, "Toolbar clicked nav", Toast.LENGTH_SHORT).show()
        }
    }

    fun goToSearchActivity(){
        val intent = Intent(this, SearchActivity::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, toolbar, "toolbar")
        startActivity(intent, options.toBundle())
    }
}
