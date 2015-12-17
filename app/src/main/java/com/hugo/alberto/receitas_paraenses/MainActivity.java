package com.hugo.alberto.receitas_paraenses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        getActionBar().setLogo(R.mipmap.ic_launcher);
        getActionBar().setDisplayShowHomeEnabled(true);
        getActionBar().setDisplayUseLogoEnabled(true);

        ImageView image = (ImageView) findViewById(R.id.imageView);

        image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), TacacaActivity.class);
                startActivity(i);
                //   finish();
            }

        });

        ImageView image2 = (ImageView) findViewById(R.id.imageView2);

        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), ManicobaActivity.class);
                startActivity(i);
                //   finish();
            }

        });

        ImageView image3 = (ImageView) findViewById(R.id.imageView3);

        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), PatoNoTucupiActivity.class);
                startActivity(i);
                //   finish();
            }

        });

        ImageView image4 = (ImageView) findViewById(R.id.imageView4);

        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), VatapaActivity.class);
                startActivity(i);
                //   finish();
            }

        });

        ImageView image5 = (ImageView) findViewById(R.id.imageView5);

        image5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), CaruruActivity.class);
                startActivity(i);
                //   finish();
            }

        });

        ImageView image6 = (ImageView) findViewById(R.id.imageView6);

        image6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), ArrozParaenseActivity.class);
                startActivity(i);
                //   finish();
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_new) {
            Intent i = new Intent(getApplicationContext(), NovaReceita.class);
            startActivity(i);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
