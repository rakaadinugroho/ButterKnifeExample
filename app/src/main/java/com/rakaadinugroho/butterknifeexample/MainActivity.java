package com.rakaadinugroho.butterknifeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textview)
    TextView textView;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.listview)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        listView.setAdapter(new ListViewAdapter((LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE)));
    }
    @OnClick(R.id.button)
    public void showMessages(){
        Toast.makeText(this, "Messages With Butterknife", Toast.LENGTH_SHORT).show();
    }
}
