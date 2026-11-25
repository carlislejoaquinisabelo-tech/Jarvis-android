
package com.astrion.jarvis

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    private val bg = Color.rgb(9, 11, 15)
    private val amber = Color.rgb(224, 155, 76)
    private val white = Color.rgb(230, 232, 235)
    private val muted = Color.rgb(130, 137, 147)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = bg
        window.navigationBarColor = bg

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(24, 35, 24, 24)
            setBackgroundColor(bg)
        }

        fun text(
            value: String,
            size: Float,
            color: Int,
            bold: Boolean = false
        ): TextView {
            return TextView(this).apply {
                text = value
                textSize = size
                setTextColor(color)
                gravity = Gravity.CENTER
                if (bold) setTypeface(null, Typeface.BOLD)
            }
        }

        root.addView(
            text("J.A.R.V.I.S.", 27f, white, true)
        )

        root.addView(
            text("PERSONAL INTELLIGENCE SYSTEM", 10f, amber)
        )

        val space = View(this)
        root.addView(space, LinearLayout.LayoutParams(1, 55))

        val core = text("J", 72f, amber, true).apply {
            setBackgroundColor(Color.rgb(24, 27, 32))
            setPadding(45, 35, 45, 35)
        }

        root.addView(core)

        root.addView(
            text("SYSTEM ONLINE", 13f, amber, true)
        )

        root.addView(
            text("Awaiting your command", 14f, muted)
        )

        val spacer = View(this)
        root.addView(
            spacer,
            LinearLayout.LayoutParams(
                1, 0, 1f
            )
        )

        root.addView(
            text("AI CORE  •  READY", 12f, amber)
        )

        root.addView(
            text("VOICE MODULE  •  NOT CONNECTED", 11f, muted)
        )

        root.addView(
            text("ANDROID CONTROL  •  NOT CONNECTED", 11f, muted)
        )

        root.addView(
            text("JARVIS  /  VERSION 1.0", 10f, muted)
        )

        setContentView(root)
    }
}
