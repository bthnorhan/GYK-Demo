package tr.bthnorhan.gyk_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
        Bazı öntanımlamalar private, protected public şeklindedir.
        private - tanımlanan değişkenin sadece o classta kullanılmasını sağlar.
        protected - tanımlanan değişken o class ve alt classlarında kullanılmasını sağlar.
        public - tanımlanan değişken o proje içinde kullanılmasını sağlar.
     */
    private Intent activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buton_Tiklama(View view)
    {
        /*
            Butonlar farklı iilevlere sahip fakat aynı onClick metodunda oldukları için
            butonun idsine göre işlevlerini yaptırıcaz.
            View.getId() - metodu ile tıklanan butonun sahip olduğu id değişkenini aldık.
         */
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
            case R.id.btn_listView:
                activity = new Intent(this,ListViewUlkeler.class);
                break;
            case R.id.btn_customListView:
                activity = new Intent(this,CustomListView.class);
                break;
            default:
                Toast.makeText(this,"Buton idsi bulunamadı.",Toast.LENGTH_LONG).show();
        }

        //activity nesnemiz null değil ise diğer activity'e geçiş yapıyoruz.
        if (activity != null)
        {
            startActivity(activity);
        }
    }
}
