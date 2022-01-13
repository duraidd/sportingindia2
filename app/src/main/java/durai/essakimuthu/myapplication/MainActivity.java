package durai.essakimuthu.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<modal>  dataholder;
    private ArrayList<modal1>  dataholder1;
    private RecyclerView recyclerView,recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//  set status text dark

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.white));// set status background white
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView1 = findViewById(R.id.recyclerview1);



        dataholder = new ArrayList<>();
        dataholder1 = new ArrayList<>();

        setallcontent();
         setAdapter();

        setallcontent1();
        setAdapter1();


    }

    private void setAdapter() {
        FirstAdapter adapter = new FirstAdapter(dataholder);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setallcontent() {

        dataholder.add(new modal(R.drawable.ic_course,"Trending Courses","Lorem ipsum dolor sit amet Sed nec molestie justo Lorem ipsum dolor sit amet Sed nec molestie justo"));
        dataholder.add(new modal(R.drawable.ic_book,"Books and Library","Lorem ipsum dolor sit amet Sed nec molestie justo Lorem ipsum dolor sit amet Sed nec molestie justo"));
        dataholder.add(new modal(R.drawable.ic_teachers,"Certified Teacher","Lorem ipsum dolor sit amet Sed nec molestie justo Lorem ipsum dolor sit amet Sed nec molestie justo"));
        dataholder.add(new modal(R.drawable.ic_cert,"Certification","Lorem ipsum dolor sit amet Sed nec molestie justo Lorem ipsum dolor sit amet Sed nec molestie justo"));

    }


    private void setAdapter1() {
        SecondAdapter adapter1 = new SecondAdapter(dataholder1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView1.setLayoutManager(layoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setAdapter(adapter1);
    }

    private void setallcontent1() {

        dataholder1.add(new modal1("Athletics","1 COURSES"));
        dataholder1.add(new modal1("Tennis","2 COURSES"));
        dataholder1.add(new modal1("Swimming","4 COURSES"));

    }
}