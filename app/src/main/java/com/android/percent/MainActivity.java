package com.android.percent;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.text);
        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.mipmap.ic_launcher_round);
        ab.setDisplayHomeAsUpEnabled(true);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView)findViewById(R.id.nav_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    item.setChecked(true);
                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            Toast.makeText(MainActivity.this,"Home Menu clicked",Toast.LENGTH_LONG).show();
                            break;
                        case R.id.nav_friends:
                            Toast.makeText(MainActivity.this,"Friends Menu clicked",Toast.LENGTH_LONG).show();
                            break;
                        case R.id.nav_message:
                            Toast.makeText(MainActivity.this,"Message Menu clicked",Toast.LENGTH_LONG).show();
                            break;
                        case R.id.nav_discussion:
                            Toast.makeText(MainActivity.this,"Discussion Menu clicked",Toast.LENGTH_LONG).show();
                            break;
                        case R.id.sub_menu1:
                            Toast.makeText(MainActivity.this,"sub_menu1 clicked",Toast.LENGTH_LONG).show();
                            break;
                        case R.id.sub_menu2:
                            Toast.makeText(MainActivity.this,"sub_menu2 clicked",Toast.LENGTH_LONG).show();
                            break;
                    }
                    mDrawerLayout.closeDrawers();
                    return true;
                }
            });
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
