package tr.bthnorhan.gyk_demo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by bthnorhan on 13.06.2017.
 */

public class CustomLVAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    List<Person> personList;

    public CustomLVAdapter(Activity activity, List<Person> personList) {
        this.layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.personList = personList;
    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = layoutInflater.inflate(R.layout.custom_row_layout , null);
        TextView tv_name = (TextView) view.findViewById(R.id.tv_name);
        TextView tv_gender = (TextView) view.findViewById(R.id.tv_gender);
        ImageView iv_image = (ImageView) view.findViewById(R.id.iv_image);

        tv_name.setText(personList.get(position).getName());
        if (personList.get(position).isWoman())
        {
            tv_gender.setText("Kadın");
            iv_image.setImageResource(R.mipmap.ic_woman);
        }
        else
        {
            tv_gender.setText("Erkek");
            iv_image.setImageResource(R.mipmap.ic_man);
        }

        return view;
    }
}
