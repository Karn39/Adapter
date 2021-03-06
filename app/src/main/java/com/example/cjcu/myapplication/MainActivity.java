package com.example.cjcu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[][] data = {
                {"1","北北基"},
                {"2","台北南昌店"},
                {"2","台北中山北店"},
                {"2","台北忠孝東店"},
                {"2","台北內湖店"},
                {"1","桃竹苗"},
                {"2","竹北光明店"},
                {"2","中壢延平店"},
                {"2","桃園中山東店"},
                {"1","中彰投"},
                {"2","台中大隆店"},
                {"2","台中文心店"},
                {"1","雲嘉南"},
                {"2","台南公園南店"},
                {"2","台南永華店"},
                {"1","高雄"},
                {"2","高雄五福店"}
        };

        ListView lv=(ListView)findViewById(R.id.lv_citylist);

        CityAdapter ca = new CityAdapter(data,this.getLayoutInflater());

        lv.setAdapter(ca);
    }
}
