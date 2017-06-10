package tr.bthnorhan.gyk_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KullaniciGirisArayuzu extends AppCompatActivity {

    EditText et_username,et_password;
    Button login;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_giris_arayuzu);

        login = (Button) findViewById(R.id.btn_login);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = et_username.getText().toString().trim();
                password = et_password.getText().toString().trim();
                if (!username.isEmpty() && !password.isEmpty())
                {
                    Toast.makeText(KullaniciGirisArayuzu.this,"Başarıyla giriş yapıldı.",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
