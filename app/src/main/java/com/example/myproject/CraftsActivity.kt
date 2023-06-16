package com.example.myproject

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myproject.databinding.ActivityCraftsBinding
import com.example.myproject.databinding.ActivitySignupBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class CraftsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCraftsBinding
    private lateinit var firebaseAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCraftsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        firebaseAuth = FirebaseAuth.getInstance()

       // binding.Re.setOnClickListener {
        // val email = binding.emailEt.text.toString()
        //val pass = binding.passET.text.toString()
        // val confirmPass = binding.confirmPassEt.text.toString()

        //if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()){
        // if (pass == confirmPass){

        //firebaseAuth.createUserWithEmailAndPassword(email , pass).addOnCompleteListener {
        // if(it.isSuccessful){
        //val intent = Intent(this , QueryActivity::class.java)
                            startActivity(intent)
        // }else{
        // Toast.makeText(this, it.exception.toString() , Toast.LENGTH_SHORT).show()
                        }
                    }
//  }else{
//    Toast.makeText(this, "Password is not matching" , Toast.LENGTH_SHORT).show()
//    }
// }else{
//// Toast.makeText(this , "Fill In All The Fields!" , Toast.LENGTH_SHORT).show()
//  }
//   }
// }

// override fun onCreateOptionsMenu(menu: Menu): Boolean {
//menuInflater.inflate(R.menu.menu_crafts, menu)
//return true
// }

//override fun onOptionsItemSelected(item: MenuItem): Boolean {
//return when (item.itemId) {
// R.id.action_s1 -> {
//Toast.makeText(this, "Light Mode", Toast.LENGTH_LONG).show()
// true
// }
// R.id.action_s2 -> {
//  Toast.makeText(this, "SignOut", Toast.LENGTH_LONG).show()
// true
// }
// R.id.action_s3 -> {
// Toast.makeText(this, "Dark Mode", Toast.LENGTH_LONG).show()
// true
// }
// else -> super.onOptionsItemSelected(item)
// }
// }
//}
