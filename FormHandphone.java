package com.example.databaseapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;
import com.smartneasy.hargahponline.model.Handphone;
import com.smartneasy.hargahponline.server.AsyncInvokeURLTask;
import org.apache.http.NameValuePair;
import org.apache.http.messege.BasicNameValuePair;
import java.net.URLEncoder;
import java.util.ArrayList;

public class FormHandphone<ActivtionBarActivity> extends ActivtionBarActivity {
    private EditText textName, textHarga;
    private Handphone handphone;
    public static final String urlSubmit="submit_phone.php";
@Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_form_handphone);
    initView();
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    handphone = new handphone();
    if(getIntent().hasExtra("id")) {
        String id = getIntent().getStringExtra("id");
        String nama = getIntent().getStringExtra("nama");
        String harga = getIntent().getStringExtra("harga");
        textNama.setText(nama);
        textHarga.setText(harga);
        handphone.setId(integer.valueof(id));
    }else{
        handphone.setId(0);
    }
}

}
