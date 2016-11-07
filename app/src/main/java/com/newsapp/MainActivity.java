package com.newsapp;

import android.content.ClipData;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.newsapp.model.NewsFeed;
import com.newsapp.rest.ApiClientXml;
import com.newsapp.rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.newsapp.R.id.drop;

public class MainActivity extends AppCompatActivity {

    private String Tag="MainActivity";
    private Button drag;
    LinearLayout drop;
    private TextView text;
    private TextView sucess;
    int total , failure = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drag = (Button)findViewById(R.id.one);
        drop = (LinearLayout)findViewById(R.id.bottomlinear_bottom);
        text = (TextView)findViewById(R.id.Total);
        sucess = (TextView)findViewById(R.id.Sucess);

        drop.setOnDragListener(new View.OnDragListener() {

            @Override
            public boolean onDrag(View v, DragEvent event) {
                // TODO Auto-generated method stub
                final int action = event.getAction();
                switch(action) {

                    case DragEvent.ACTION_DRAG_STARTED:
                        break;

                    case DragEvent.ACTION_DRAG_EXITED:
                        break;

                    case DragEvent.ACTION_DRAG_ENTERED:
                        break;

                    case DragEvent.ACTION_DROP:{
                        failure = failure+1;
                        return(true);
                    }

                    case DragEvent.ACTION_DRAG_ENDED:{
                        total = total +1;
                        int suc = total - failure;
                        sucess.setText("Sucessful Drops :"+suc);
                        text.setText("Total Drops: "+total);
                        return(true);

                    }

                    default:
                        break;
                }
                return true;
            }});
        drag.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent arg1) {
                // TODO Auto-generated method stub
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadow = new View.DragShadowBuilder(drag);
                v.startDrag(data, shadow, null, 0);
                return false;
            }
        });

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
