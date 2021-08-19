package com.neppplus.profileedit

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_call.*
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditCallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_call)

        callOkBtn.setOnClickListener {

            val inputCall = callEdt.text.toString()

            val resultCallIntent = Intent()
            resultCallIntent.putExtra("newCall", inputCall)

            setResult(Activity.RESULT_OK, resultCallIntent)

            finish()
        }

    }
}