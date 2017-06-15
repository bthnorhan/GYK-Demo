package tr.bthnorhan.gyk_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomListView extends AppCompatActivity {

    EditText et_name;
    CheckBox cb_isWoman;
    Button btn_addList;
    ListView lv_customListView;
    boolean isInited = false;
    CustomLVAdapter customLVAdapter;

    List<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        et_name = (EditText) findViewById(R.id.et_name);
        cb_isWoman = (CheckBox) findViewById(R.id.cb_isWoman);
        btn_addList = (Button) findViewById(R.id.btn_addList);
        lv_customListView = (ListView) findViewById(R.id.lv_customListView);

        btn_addList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_name.getText().toString().length() > 0)
                {
                    personList.add(new Person(et_name.getText().toString(),cb_isWoman.isChecked()));
                    if (!isInited)
                    {
                        customLVAdapter = new CustomLVAdapter(CustomListView.this,personList);
                        lv_customListView.setAdapter(customLVAdapter);
                        isInited = true;
                    }
                    else if (!personList.isEmpty() && isInited)
                    {
                        customLVAdapter.notifyDataSetChanged();
                    }
                }
            }
        });
    }
}
