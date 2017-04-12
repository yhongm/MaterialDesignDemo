package demo.material_design.yhongm.com.materialdesigndemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        findViewById(R.id.tv).setOnClickListener(v -> startActivity(new Intent(MainActivity.this,TestActivity.class), ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle()));
    }
}
