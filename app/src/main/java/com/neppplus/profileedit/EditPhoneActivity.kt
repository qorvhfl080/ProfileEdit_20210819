package com.neppplus.profileedit

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_department.*
import kotlinx.android.synthetic.main.activity_edit_phone.*

class EditPhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_phone)

        phoneOkBtn.setOnClickListener {

            val inputPhone = phoneEdt.text.toString()

            val resultPhoneIntent = Intent()
            resultPhoneIntent.putExtra("newPhone", inputPhone)

            setResult(Activity.RESULT_OK, resultPhoneIntent)

            finish()

        }

    }
}