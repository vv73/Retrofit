package com.example.vv.test;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl("https://www.malishevkir.fvds.ru")
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();
        TestApi testApi = retrofit.create(TestApi.class);
        testApi.getData().enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example example = response.body();
                Toast.makeText(MainActivity.this, example.getQq().get(0).getQuestion(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something wrong", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Toast toast = Toast.makeText(MainActivity.this, R.string.text, Toast.LENGTH_SHORT);
        toast.show();
    }

}




