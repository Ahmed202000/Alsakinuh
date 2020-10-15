package com.hegazy.alsakinuh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    ArrayList<Alsakinuhitem> list;
    AlsakinuhAdapter adapter;

    MainActivity activity;
    AdView madView;
    @BindView(R.id.home2_gv_authors_list)
    RecyclerView home2GvAuthorsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        addAuthors();


        madView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        madView.loadAd(adRequest);

    }

    private void addAuthors() {
        home2GvAuthorsList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        list = new ArrayList<>();
        list.add(new Alsakinuhitem( "الشيخ عبد الباسط","سوره الجاثية", "https://server7.mp3quran.net/basit/Almusshaf-Al-Mojawwad/045.mp3"));
        list.add(new Alsakinuhitem( "الشيخ عبد الباسط","سوره الاحقاف", "https://server7.mp3quran.net/basit/Almusshaf-Al-Mojawwad/046.mp3"));
        list.add(new Alsakinuhitem( "الشيخ عبد الباسط","سوره الحاقه", "https://server7.mp3quran.net/basit/Almusshaf-Al-Mojawwad/069.mp3"));

        adapter = new AlsakinuhAdapter(list, MainActivity.this,activity );
        home2GvAuthorsList.setAdapter(adapter);


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}