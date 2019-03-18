package com.example.luisfernandomedinallorenti.proyectomvp.models;

import com.example.luisfernandomedinallorenti.proyectomvp.MainActivity;

public class MainActivityModel implements MainActivity.Model {
    private MainActivity.Presenter presenter;
    private String data;
    //Constructor
    public MainActivityModel(MainActivity.Presenter presenter){
        this.presenter=presenter;
    }
    @Override
    public void addName(String s) {
        data=s+"hola mundo";
        presenter.showResult(data);
    }
}
