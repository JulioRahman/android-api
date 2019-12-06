package com.julio.api

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.julio.api.model.Users
import com.julio.api.network.APIClient
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiClient = APIClient

        apiClient.services.users().enqueue(object : Callback<Users> {
            override fun onResponse(call: Call<Users>, response: Response<Users>) {
                text_nama.text = "Nama: ${response.body()!!.data!![0].firstName} ${response.body()!!.data!![0].lastName}"
                text_email.text = "Email: ${response.body()!!.data!![0].email}"
            }

            override fun onFailure(call: Call<Users>, t: Throwable) {
                Log.d("Eudeka!", "onFailure: " + t.message)
            }
        })
    }
}