package io.chthonic.erd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val themeProgrammat = theme
        themeProgrammat.applyStyle(R.style.ripple_programmatic, true)
        this.view_programmatic.background = ResourcesCompat.getDrawable(resources, R.drawable.easy_ripple, themeProgrammat)
    }
}
