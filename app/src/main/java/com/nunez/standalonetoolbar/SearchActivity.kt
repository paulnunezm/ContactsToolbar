package com.nunez.standalonetoolbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Fade
import android.transition.Slide
import android.view.Gravity
import kotlinx.android.synthetic.main.activity_search.*


class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        toolbar.inflateMenu(R.menu.menu_search)
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black)

        toolbar.setNavigationOnClickListener { onBackPressed() }


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            val transition = Slide(Gravity.BOTTOM)
            transition.excludeTarget(android.R.id.statusBarBackground, true)
            transition.excludeTarget(android.R.id.navigationBarBackground, true)
            transition.excludeTarget(R.id.appBarLayout, true)
            window.enterTransition = transition
            window.exitTransition = Fade()
        }

    }
}
