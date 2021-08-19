package com.neppplus.profileedit

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_name)

        nameOkBtn.setOnClickListener {

            val inputName = nameEdt.text.toString()

            val resultNameIntent = Intent()
            resultNameIntent.putExtra("newName", inputName)

            setResult(Activity.RESULT_OK, resultNameIntent)

            finish()
        }

    }
}