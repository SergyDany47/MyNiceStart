package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.alespero.expandablecardview.ExpandableCardView;
import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ExpandableCardView card = findViewById(R.id.profile);
        card.setOnExpandedListener(new ExpandableCardView.OnExpandedListener() {
            @Override
            public void onExpandChanged(View v, boolean isExpanded) {
                Toast.makeText(MainActivity2.this, isExpanded ? "Expanded!" :
                        "Collapsed!", Toast.LENGTH_SHORT).show();
                                               }
                                           });

        BottomAppBar bottomAppBar = findViewById(R.id.bottom_app_bar);
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottom_app_bar_menu_bookmark:
                        Toast.makeText(MainActivity2.this, "Bookmark clicked.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bottom_app_bar_menu_search:
                        Toast.makeText(MainActivity2.this, "Search clicked.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bottom_app_bar_menu_share:
                        Toast.makeText(MainActivity2.this, "Share clicked.", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Menu clicked!", Toast.LENGTH_SHORT).show();
//                sheetBehavior = BottomSheetBehavior.from(sheet);
            }


        });

    }


    public void openMain2(View view) {
    }

}