package com.company;
import MainFormApperance.MainFormApperance;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Главная форма");
        MainFormApperance demo = new MainFormApperance();
        frame.setContentPane(demo.createContentPane()); // передаем как параметр в коструктор
        // задаём операцию, которая выполниться при закрытии
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // задаём размер окна
        frame.setVisible(true);
    }
}
