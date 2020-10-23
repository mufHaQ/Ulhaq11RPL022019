package com.mufhaq.ulhaq11rpl022019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class DetailFavourite extends AppCompatActivity {

    Bundle extras;
    String title;
    String date;
    String description;
    String path;
    String id;

    TextView tvjudul;
    ImageView ivposter;
    TextView tvdesk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_favourite);
        extras = getIntent().getExtras();
        tvjudul = (TextView)findViewById(R.id.tvjudulfavourite);
        tvdesk = (TextView)findViewById(R.id.tvdeskfavourite);
        ivposter = (ImageView) findViewById(R.id.ivposterfavourite);

        if (extras != null) {
            title = extras.getString("judul");
            id = extras.getString("id");
            date = extras.getString("date");
            description = extras.getString("deskripsi");
            path = extras.getString("path");
            tvjudul.setText(title);
            tvdesk.setText(description);
            Glide.with(DetailFavourite.this)
                    .load(path)
                    .override(Target.SIZE_ORIGINAL)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(ivposter);
            // and get whatever type user account id is
        }
    }
}