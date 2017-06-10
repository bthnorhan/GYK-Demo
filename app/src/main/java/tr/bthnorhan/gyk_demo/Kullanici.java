package tr.bthnorhan.gyk_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Kullanici extends AppCompatActivity {

    /*
        textviewimiz tanımlandı.
     */
    TextView tv_hosgeldin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici);

        //textviewimiz layouttaki karşılığı ile tanımlandı.
        tv_hosgeldin = (TextView) findViewById(R.id.tv_hosgeldin);

        /*
            GÖnderilen veri getIntent().getExtras() şeklinde alındı.
            boş olup olmadığı kontrol edildi.
            boş değilse kullanici anahtarındaki veri textviewe yazdırıldı.
         */
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            tv_hosgeldin.setText("Hoşgeldin " + bundle.getString("kullanici").toString());
        }
    }
}
