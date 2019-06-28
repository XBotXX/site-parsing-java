package MainFormApperance;

import TestActionListener.TestActionListener;
import com.company.CsvListener;
import com.company.ParceListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFormApperance {
    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        // сначала создаётся "панель", на которой и размещаюся
        // остальные компоненты
        JPanel totalGUI = new JPanel(); // создаём "поверхность"
        totalGUI.setLayout(null);

        // Создадим ярлык (надпись) синего цвета
        JLabel blueLabel = new JLabel("Welcome");
        blueLabel.setLocation(10, 10); /* надпись синего цвета*/
        blueLabel.setSize(300, 100); // размер области надписи
        blueLabel.setHorizontalAlignment(0);
        blueLabel.setForeground(Color.blue); // задаём цвет
        totalGUI.add(blueLabel); // добавляем текстовую метку на поверхность

        // Создаём кнопку---------------
        JButton redButton = new JButton("Bonprix");
        redButton.setLocation(120, 200); // расположение кнопки
        redButton.setSize(150,30 ); // размер кнопки
        // создаём объект-обработчик события
        ActionListener actionListener = new TestActionListener(); // создаём создаём действие
        // назначаем этот обработчик кнопке
        redButton.addActionListener(actionListener);// прикрепляем действие к кнопке (срабоет по нажатии на неё)
        totalGUI.add(redButton); // добавляем кнопку на поверхность

        // Создадим ещё одну кнопку-------------------------
        JButton ParceButton = new JButton("Avito");
        ParceButton.setLocation(120, 100); // расположение кнопки
        ParceButton.setSize(150, 30 ); // размер кнопки
        ActionListener actionListener_1 = new CsvListener(); // создаём создаём действие
        ParceButton.addActionListener(actionListener_1);   // прикрепляем действие к кнопке
        totalGUI.add(ParceButton); // добавляем на поверхность

        // 3-я кнопка---------------------------------------
        JButton Button3 = new JButton("Aliexpress");
        Button3.setLocation(120, 150); // местоположение
        Button3.setSize(150, 30); // размер
        ActionListener actionListener_2 = new ParceListener();  // создаём создаём действие типа CsvListener
        Button3.addActionListener( actionListener_2);   // прикрепляем действие к кнопке типа CsvListener к кнопке 3
        totalGUI.add(Button3);



        totalGUI.setOpaque(true);
        return totalGUI; // возвращаем внешний вид
    }
}
