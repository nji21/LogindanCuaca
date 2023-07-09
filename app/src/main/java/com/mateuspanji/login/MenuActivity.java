package com.mateuspanji.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity
{
    private Button _tampilCuacaButton;

    private Intent _tampilCuacaIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initTampilCuacaButton();
    }
    private void initTampilCuacaButton()
    {
        _tampilCuacaButton = findViewById(R.id.tampilCuacaButton);

        _tampilCuacaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilCuacaIntent = new Intent(getApplicationContext(), CuacaMainActivity.class);
                startActivity(_tampilCuacaIntent);
            }
        });
    }
}