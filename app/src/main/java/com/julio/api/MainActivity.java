package com.julio.api;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.julio.api.model.Users;
import com.julio.api.network.APIClient;
import com.julio.api.network.EndPoint;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private TextView tvNama, tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = findViewById(R.id.text_nama);
        tvEmail = findViewById(R.id.text_email);

        Retrofit retrofit = APIClient.getClient();
        EndPoint endPoint = retrofit.create(EndPoint.class);
        Call<Users> responseCall = endPoint.getUsers();
        responseCall.enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {
                tvNama.setText("Nama: " +
                        response.body().data.get(0).firstName + " " +
                        response.body().data.get(0).lastName);
                tvEmail.setText("Email: " +
                        response.body().data.get(0).email);
            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {
                Log.d("Eudeka!", "onFailure: " + t.getMessage());
            }
        });
    }
}
