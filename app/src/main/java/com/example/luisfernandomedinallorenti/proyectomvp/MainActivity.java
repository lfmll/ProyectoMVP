package com.example.luisfernandomedinallorenti.proyectomvp;

public interface MainActivity {

    interface View{
        void showResult(String s);
    }
    interface Presenter{
        void showResult(String s);
        void addName(String s);
    }
    interface Model{
        void addName(String s);

    }
}
