package com.example.luisfernandomedinallorenti.proyectomvp.presenters;

import com.example.luisfernandomedinallorenti.proyectomvp.MainActivity;
import com.example.luisfernandomedinallorenti.proyectomvp.models.MainActivityModel;

public class MainActivityPresenter implements MainActivity.Presenter {
    private MainActivity.View view;
    private MainActivity.Model model;
    //Constructor
    public MainActivityPresenter(MainActivity.View view){
        this.view=view;
        model= new MainActivityModel(this);
    }
    @Override
    public void showResult(String s) {
        if (view!=null){
            view.showResult(s);
        }
    }

    @Override
    public void addName(String s) {
        if (view!=null){
            model.addName(s);
        }
    }
}
