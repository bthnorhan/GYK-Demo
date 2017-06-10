package tr.bthnorhan.gyk_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KullaniciGirisArayuzu extends AppCompatActivity {

    /*
        Buton, edittextler ve string değişkenler tanımlandı.
     */

    EditText et_username,et_password;
    Button login;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_giris_arayuzu);

        /*
            Üst kısımda tanımlanan değişkenler, layouttaki karşılıkları ile tanımlandı.
         */

        login = (Button) findViewById(R.id.btn_login);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);

        /*
            Login butonuna listener tanımlandı. Butona tıklandığı zaman kullanıcı adı verisi
            diğer activitye gönderildi.
        */
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = et_username.getText().toString().trim();
                password = et_password.getText().toString().trim();
                /*
                    Butonların boş olup olmadıkları kontrol edildi. Boş değilse diğer activity'e yönlendirildi.
                    intentin içine kullanıcı adı eklendi.
                    eğer boş ise seterror fonksiyonu ile edittextlerin hata mesajı vermesini sağladık.
                 */
                if (!username.isEmpty() && !password.isEmpty())
                {
                    Intent intent = new Intent(KullaniciGirisArayuzu.this, Kullanici.class);
                    intent.putExtra("kullanici",username);
                    startActivity(intent);
                }
                else
                {
                    et_username.setError("Boş bırakmayınız.");
                    et_password.setError("Boş bırakmayınız.");
                }
            }
        });
    }
}
