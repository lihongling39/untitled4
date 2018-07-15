package oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 李红玲 on 2018/7/15.
 */
public class SxMyFrame extends JFrame {
    public SxMyFrame() {
        this.setSize(500, 600);
        GridLayout gridLayout = new GridLayout(5, 2);
        this.setLayout(gridLayout);
        JLabel label0 = new JLabel("姓名");
        JTextField TxName= new JTextField();
        JLabel label1= new JLabel("学号");
        JTextField TXID= new JTextField();
        JLabel label2 = new JLabel("班级");
        JTextField TXClass= new JTextField();
        JLabel label3 = new JLabel("出生日期");
        JTextField TXBirthday= new JTextField();
        JButton btone = new JButton("查询");
        this.add(label0);
        this.add(TxName);
        this.add(label1);
        this.add(TXID);
        this.add(label2);
        this.add(TXClass);
        this.add(label3);
        this.add(TXBirthday);
        this.add(btone);;
        btone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,""+TxName.getText()+","+TXID.getText()+","+TXClass.getText()+","+TXBirthday.getText());
            }
        });
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SxMyFrame sxMyFrame = new SxMyFrame();
    }


}

