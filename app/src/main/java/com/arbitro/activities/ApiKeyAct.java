package com.arbitro.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.arbitro.R;
import com.arbitro.network.Network;

public class ApiKeyAct extends AppCompatActivity {
   EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api_key);

        e1=findViewById(R.id.apikey);

    }

    public void signIn(View view){
       openLink(Network.signIn);
    }
    public void create(View view){
        openLink(Network.createAccountUrl);

    }
    public void next(View view){

        Network.apiKey=e1.getText().toString();
        Toast.makeText(this, "Api key added", Toast.LENGTH_SHORT).show();

    }

public void openLink(String link){

    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
    startActivity(browserIntent);
}

}
