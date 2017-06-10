package tr.bthnorhan.gyk_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewUlkeler extends AppCompatActivity {

    ListView lv_ulkeler;
    String[] ulkeler = {"Türkiye", "Almanya", "Avusturya", "Amerika","İngiltere",
            "Macaristan", "Yunanistan", "Rusya", "Suriye", "İran", "Irak",
            "Şili", "Brezilya", "Japonya", "Portekiz", "İspanya",
            "Makedonya", "Ukrayna", "İsviçre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_ulkeler);

        lv_ulkeler = (ListView) findViewById(R.id.lv_ulkeler);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler);
        lv_ulkeler.setAdapter(arrayAdapter);
    }
}
