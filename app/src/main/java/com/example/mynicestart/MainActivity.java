package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);

       /* Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity
                        .this, MainActivity2.class);
                startActivity(intent);
            }
        });*/


        ImageView fondo = findViewById(R.id.img_guiri);
        Glide.with(this)
                .load(R.drawable.img_guiri)
                .centerCrop()
                .circleCrop()
                .into(fondo);
        ImageView mycontext = findViewById(R.id.img_guiri);
        registerForContextMenu(mycontext);
    }

    public void openMain2(View view) {
        Intent intent = new Intent(MainActivity
                .this, MainActivity2.class);
        startActivity(intent);
    }

    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {

        @Override

        public void onRefresh() {

            final ConstraintLayout mLayout = (ConstraintLayout) findViewById(R.id.activity_main_context);

            Snackbar snackbar = Snackbar

                    .make(mLayout, "fancy a Snack while you refresh?", Snackbar.LENGTH_LONG)

                    .setAction("UNDO", new View.OnClickListener() {

                        @Override

                        public void onClick(View view) {

                            Snackbar snackbar1 = Snackbar.make(mLayout, "Action is restored!", Snackbar.LENGTH_SHORT);

                            snackbar1.show();
                        }
                    });
            snackbar.show();
            swipeLayout.setRefreshing(false);
        }

    };


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.edit:
                Toast toast = Toast.makeText(this, "going CONTEXT CAMERA", Toast.LENGTH_LONG);
                toast.show();

                break;
            case R.id.delete:
                Toast toast2 = Toast.makeText(this, "going CONTEXT SETTINGS", Toast.LENGTH_LONG);
                toast2.show();

                break;
        }
        return super.onContextItemSelected(item);
    }

}