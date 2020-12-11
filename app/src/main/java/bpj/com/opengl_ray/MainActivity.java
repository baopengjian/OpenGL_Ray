package bpj.com.opengl_ray;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bpj.com.opengl_ray.first.FirstActivity;
import bpj.com.opengl_ray.second.SecondActivity;
import bpj.com.opengl_ray.third.ThirdActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPermission();
        setContentView(R.layout.activity_main);
    }

    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };
    private static final int REQUEST_EXTERNAL_STORAGE = 1;

    private void getPermission() {
        ActivityCompat.requestPermissions(this,
                PERMISSIONS_STORAGE, REQUEST_EXTERNAL_STORAGE);
    }

    public void first(View view) {
        startActivity(new Intent(MainActivity.this, FirstActivity.class));
    }

    public void second(View view) {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
    }

    public void third(View view) {
        startActivity(new Intent(MainActivity.this, ThirdActivity.class));
    }
}
