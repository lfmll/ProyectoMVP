package com.example.luisfernandomedinallorenti.proyectomvp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.luisfernandomedinallorenti.proyectomvp.MainActivity;
import com.example.luisfernandomedinallorenti.proyectomvp.R;
import com.example.luisfernandomedinallorenti.proyectomvp.presenters.MainActivityPresenter;

public class MainActivityView extends AppCompatActivity implements MainActivity.View{
    TextView textView;
    EditText editText;
    private MainActivity.Presenter presenter;   //Interface del Presenter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textview);
        editText=(EditText) findViewById(R.id.edittex);
        presenter=new MainActivityPresenter(this);   //Clase Presenter
    }

    public void sendData(View view){
        presenter.addName(editText.getText().toString());
    }

    @Override
    public void showResult(String s) {
        textView.setText(s);
    }
}
