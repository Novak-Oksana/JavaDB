package com.work;

import javax.swing.*;

/**
 * Created by Ksu on 11.09.2017.
 */
public class Form {
    private JTable table;
    private JPanel panel;



    public static void main(String[] arg){
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new Form().panel);
        jFrame.setVisible(true);
    }
}
