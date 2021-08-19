package com.neppplus.profileedit

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_department.*
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditDepartmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_department)

        departmentOkBtn.setOnClickListener {

            val inputDepartment = departmentEdt.text.toString()

            val resultDepartmentIntent = Intent()
            resultDepartmentIntent.putExtra("newDepartment", inputDepartment)

            setResult(Activity.RESULT_OK, resultDepartmentIntent)

            finish()

        }

    }
}