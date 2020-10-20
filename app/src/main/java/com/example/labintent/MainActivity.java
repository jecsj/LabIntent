package com.example.labintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static String emailAccount = "mi_cuenta";
    private static String emailPassword ="mi_clave";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onSendMessage(View view) {
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

     //   Intent intent = new Intent(this, ReceiveMessageActivity.class);
        EditText mensaje=(EditText)findViewById(R.id.message);
        String value = mensaje.getText().toString();
        intent.putExtra(Intent.EXTRA_SUBJECT ,value);
        startActivity(intent);
    }

    public void onMaps(View view) {
        EditText latitud=(EditText)findViewById(R.id.latitud);
        String value = latitud.getText().toString();
        EditText longitud=(EditText)findViewById(R.id.longitud);
        String value2 = longitud.getText().toString();

        Uri gmmIntentUri = Uri.parse("google.navigation:q="+value+","+value2);
   //     Uri gmmIntentUri = Uri.parse("google.streetview:cbll=4.6255903,-74.1628307");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}