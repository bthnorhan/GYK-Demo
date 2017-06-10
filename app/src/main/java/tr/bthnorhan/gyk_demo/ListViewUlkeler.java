package tr.bthnorhan.gyk_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewUlkeler extends AppCompatActivity {

    /*
        Listview ve ulkeler dizimiz tanımlandı.
     */

    ListView lv_ulkeler;
    String[] ulkeler = {"Türkiye", "Almanya", "Avusturya", "Amerika","İngiltere",
            "Macaristan", "Yunanistan", "Rusya", "Suriye", "İran", "Irak",
            "Şili", "Brezilya", "Japonya", "Portekiz", "İspanya",
            "Makedonya", "Ukrayna", "İsviçre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_ulkeler);

        /*
            listviewimiz layouttaki karşılığı ile tanımlandı.
            string değişkeninde arrayadapter oluşturuldu ve dizimiz adapterimize eklendi.
            listviewimiinn adapteri yeni oluşturduğumuz adapter şeklinde ayarlandı.
         */

        lv_ulkeler = (ListView) findViewById(R.id.lv_ulkeler);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler);
        lv_ulkeler.setAdapter(arrayAdapter);

        /*
            Listviewimizdeki itemlere tıklamaları yakalayacağımız için
            setOnItemClickListener listenerını kulandık.
            listviewde tıklanan iteme göre ekrana toast mesajı verildi.Tıklanılan itemin verisi ve idsi
            toast mesajında yazıldı.
         */
        lv_ulkeler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewUlkeler.this,"Id : " + id + " Veri : " + ulkeler[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
