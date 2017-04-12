package demo.material_design.yhongm.com.materialdesigndemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;

/**
 * Created by yuhongmiao on 2017/4/12.
 */

public class TestActivity extends Activity {
    RecyclerView recyclerView;
    CardView cardView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
//        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        cardView= (CardView) findViewById(R.id.card_view);
        cardView.setRadius(5);
        cardView.setBackgroundColor(Color.GREEN);
        Palette.generate().getDarkMutedColor()
    }
}
