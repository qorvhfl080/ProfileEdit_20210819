package com.neppplus.profileedit

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NAME = 100
    val REQ_FOR_CALL = 101
    val REQ_FOR_DEPARTMENT = 102
    val REQ_FOR_PHONE = 103

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditBtn.setOnClickListener {

            val nameEditIntent = Intent(this, EditNameActivity::class.java)
            startActivityForResult(nameEditIntent, REQ_FOR_NAME)

        }

        callEditBtn.setOnClickListener {

            val callEditIntent = Intent(this, EditCallActivity::class.java)
            startActivityForResult(callEditIntent, REQ_FOR_CALL)

        }

        departmentEditBtn.setOnClickListener {

            val departmentEditIntent = Intent(this, EditDepartmentActivity::class.java)
            startActivityForResult(departmentEditIntent, REQ_FOR_DEPARTMENT)

        }

        phoneEditBtn.setOnClickListener {

            val phoneEditIntent = Intent(this, EditPhoneActivity::class.java)
            startActivityForResult(phoneEditIntent, REQ_FOR_PHONE)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NAME && resultCode == Activity.RESULT_OK) {

            val newName = data?.getStringExtra("newName")
            nameTxt.text = newName

        } else if (requestCode == REQ_FOR_CALL && resultCode == Activity.RESULT_OK) {

            val newCall = data?.getStringExtra("newCall")
            callTxt.text = newCall

        } else if (requestCode == REQ_FOR_DEPARTMENT && resultCode == Activity.RESULT_OK) {

            val newDepartment = data?.getStringExtra("newDepartment")
            departmentTxt.text = newDepartment

        } else if (requestCode == REQ_FOR_PHONE && resultCode == Activity.RESULT_OK) {

            val newPhone = data?.getStringExtra("newPhone")
            phoneTxt.text = newPhone

        } else {
            Toast.makeText(this, "변경 사항 없음", Toast.LENGTH_SHORT).show()
        }

    }

}