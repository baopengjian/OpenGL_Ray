package bpj.com.opengl_ray;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPermission();
        setContentView(R.layout.activity_main);
    }

    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.CAMERA
    };
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private void getPermission() {
        ActivityCompat.requestPermissions(this,
                PERMISSIONS_STORAGE, REQUEST_EXTERNAL_STORAGE);
    }
}
