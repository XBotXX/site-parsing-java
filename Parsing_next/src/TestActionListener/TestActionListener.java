package TestActionListener;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.IOException;

public class TestActionListener implements ActionListener {
    /*@Override
    public void actionPerformed(ActionEvent e) {
            // выведем сообщение из нескольких строк
            // одну из них в кавычках
            JOptionPane.showMessageDialog(new JFrame(), message, "",
                    JOptionPane.ERROR_MESSAGE);
        }*/
    public static void main(String znach) throws Exception{

       if(znach.equals("bonprix")){
           TestActionListener.Universal("product-name","price-tag","grid-col12 first-grid-col background-box m-b-60");
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
        JOptionPane.showMessageDialog(f,"Название товара : "+pConcatenated);
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
        TestActionListener.showMessage(null,pConcatenated);
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
        String znach="bonprix";
        try {
            TestActionListener.main(znach);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
