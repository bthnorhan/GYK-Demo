package tr.bthnorhan.gyk_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MAINACTIVITY";
    private Intent activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buton_Tiklama(View view)
    {
        Log.d(TAG, String.valueOf(view.getId()));
        switch (view.getId())
        {
            case R.id.btn_linearLayoutV:
                activity = new Intent(this,LinearLayoutV.class);
                break;
            case R.id.btn_linearLayoutH:
                activity = new Intent(this,LinearLayoutH.class);
                break;
            case R.id.btn_login:
                activity = new Intent(this,KullaniciGirisArayuzu.class);
                break;
            default:
                Toast.makeText(this,"Buton idsi bulunamadı.",Toast.LENGTH_LONG).show();
        }
        if (activity != null)
        {
            startActivity(activity);
        }
    }
}
