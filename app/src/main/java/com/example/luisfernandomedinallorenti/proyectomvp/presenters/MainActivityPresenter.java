package com.example.luisfernandomedinallorenti.proyectomvp.presenters;

import com.example.luisfernandomedinallorenti.proyectomvp.MainActivity;
import com.example.luisfernandomedinallorenti.proyectomvp.models.MainActivityModel;

public class MainActivityPresenter implements MainActivity.Presenter {
    private MainActivity.View view;
    private MainActivity.Model model;
    //Constructor
    public MainActivityPresenter(MainActivity.View view){
        this.view=view;
        model= MainActivityModel(this);
    }
    @Override
    public void showResult(String s) {

    }

    @Override
    public void addName(String s) {

    }
}
