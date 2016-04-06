package com.example.lolipop.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import eu.fiskur.simpleviewpager.SimpleViewPager;

public class MainActivity extends AppCompatActivity {




    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SimpleViewPager simpleViewPager = (SimpleViewPager) findViewById(R.id.simple_view_pager);

       Drawable[] drawables = new Drawable[]{
                ContextCompat.getDrawable(this, R.drawable.a_b),
                ContextCompat.getDrawable(this, R.drawable.a_b),
                ContextCompat.getDrawable(this, R.drawable.a_b),
                ContextCompat.getDrawable(this, R.drawable.a_b),
                ContextCompat.getDrawable(this, R.drawable.a_b)
        };

        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;

        int indicatorColor = Color.parseColor("#ffffff");
        int selectedIndicatorColor = Color.parseColor("#fff000");

        simpleViewPager.setup(drawables, scaleType, indicatorColor, selectedIndicatorColor);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
