package oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 李红玲 on 2018/7/15.
 */
public class MyFrame extends JFrame {
    public MyFrame() {
        this.setSize(300, 400);
        this.setTitle("My frame...");
        FlowLayout flowLayout = new FlowLayout();
        GridLayout gridLayout = new GridLayout(3, 2);
        this.setLayout(gridLayout);

        JButton btnNorth = new JButton("北方");
        JButton btnSouth = new JButton("南方");
        JButton btnEast = new JButton("东方");
        JButton btnWest = new JButton("西方");
        final JButton btnCenter = new JButton("中间");

        btnNorth.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                button.setBackground(Color.BLUE);
            }
        });
        btnSouth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                button.setBackground(Color.GREEN);
            }
        });

        btnEast.setActionCommand("east");
        btnWest.setActionCommand("west");
        btnCenter.setActionCommand("center");
        this.add(btnNorth);
        this.add(btnSouth);
        this.add(btnEast);
        this.add(btnWest);
        this.add(btnCenter);

        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static  void main(String [] args){
        MyFrame myFrame = new MyFrame();
    }
}
