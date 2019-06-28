package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class CsvListener implements ActionListener  {

    public static void main(String znach) throws Exception{

        if(znach.equals("Avito")){
            CsvListener.Universal("title-info-title-text","js-item-price","item-view-block");
        }
    }
    private static void Universal(String a,String b,String c) throws IOException {
        String way;
        JFrame f;
        f=new JFrame();
        way=JOptionPane.showInputDialog("Введите путь к сайту");
        String pConcatenated="";
        Document document= Jsoup.connect(way).get();
        JOptionPane.showMessageDialog(f,document.title());
        Elements content = document.getElementsByClass(a);
        for (Element element : content){
            pConcatenated+=element.text();
        }
        JOptionPane.showMessageDialog(f,"Название товара: "+pConcatenated);
        pConcatenated="";
        Elements cena = document.getElementsByClass(b);
        for (Element element : cena){
            pConcatenated=element.text();
        }
        JOptionPane.showMessageDialog(f,"Цена: "+pConcatenated);
        pConcatenated="";
        Elements opis= document.getElementsByClass(c);
        for (Element element : opis){
            pConcatenated+=element.text();
        }
        CsvListener.showMessage(null,pConcatenated);
    }
    private static void showMessage(Component comp, String message) {
        JTextArea ta = new JTextArea(message, 20, 40);
        ta.setWrapStyleWord(true);
        ta.setLineWrap(true);
        ta.setOpaque(false);
        ta.setBorder(null);
        ta.setEditable(false);
        ta.setFocusable(false);
        JOptionPane.showMessageDialog(comp, ta);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // задаём текст для сообщения
        String znach="Avito";
        try {
            CsvListener.main(znach);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
