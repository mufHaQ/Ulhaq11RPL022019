package com.mufhaq.ulhaq11rpl022019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

public class DetailMovie extends AppCompatActivity {

    Bundle extras;
    String title;
    String date;
    String description;
    String path;

    TextView tvjudul;
    ImageView ivposter;
    TextView tvdesc;
    Button btnbookmark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        extras = getIntent().getExtras();

        tvjudul = (TextView) findViewById(R.id.tvjudul);
        ivposter = (ImageView) findViewById(R.id.ivposter);
        tvdesc = (TextView) findViewById(R.id.tvdesc);
        btnbookmark = (Button) findViewById(R.id.btnbookmark);

        if (extras != null){
            title = extras.getString("judul");
            date = extras.getString("date");
            description = extras.getString("description");
            path = extras.getString("path");
            tvjudul.setText(title);
            tvdesc.setText(description);
            Glide.with(DetailMovie.this)
                    .load(path)
                    .override(Target.SIZE_ORIGINAL)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(ivposter);
            // and get whatever type user account id is
        }

    }
}