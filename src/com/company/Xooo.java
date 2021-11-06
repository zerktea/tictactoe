package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Xooo implements ActionListener {

    int drawcounter=0;
    JFrame frame = new JFrame();
    JPanel panel=new JPanel();
    JButton[] buttons = new JButton[9];
    boolean checked = false;
    boolean turn=true;
    Xooo(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("X - O");
        panel.setLayout(new GridLayout(3,3));
        frame.add(panel);
        for(int i =0 ; i<9 ; i++){
            buttons[i]= new JButton(""+i);
            panel.add(buttons[i]);
        }
        for (int i = 0 ; i<9 ; i++){
            JButton b = buttons[i];

            b.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == b){
                        if(turn==true) {
                            if (b.getText() != "X"&& b.getText()!="O"){

                            b.setForeground(new Color(255, 255, 255));

                            b.setBackground(new Color(255, 0, 0));
                            b.setText("X");
                            b.setFont(new Font("Arial", Font.PLAIN, 55));
                            turn=false;
                            check();
                            if(drawcounter==8 ) {
                                if (checked == false)
                                { JOptionPane.showMessageDialog(frame, "draw", "winner", JOptionPane.ERROR_MESSAGE);
                                    frame.dispose();
                                }
                            }else drawcounter++;}

                        }
                        else {
                            if (b.getText() != "X" && b.getText()!="O"){

                            b.setForeground(new Color(255, 255, 255));
                            b.setBackground(new Color(0, 0, 255));
                            b.setText("O");
                            b.setFont(new Font("courier", Font.BOLD, 55));
                            turn=true;
                            check();
                            if(drawcounter==8 ) {
                                if (checked == false)
                                { JOptionPane.showMessageDialog(frame, "draw", "winner", JOptionPane.ERROR_MESSAGE);
                                frame.dispose();
                            }
                            }else drawcounter++;}

                        }
                    }
                }});

        }


        frame.setVisible(true);
    }
    public void check(){
        if((buttons[0].getText()==buttons[1].getText()) && (buttons[0].getText()==buttons[2].getText())) {
            JOptionPane.showMessageDialog(frame, buttons[0].getText()+" wins !", "winner", JOptionPane.ERROR_MESSAGE);
            frame.dispose();
            checked = true;
        }
        else if((buttons[3].getText()==buttons[4].getText()) && (buttons[3].getText()==buttons[5].getText())) {
            JOptionPane.showMessageDialog(frame, buttons[3].getText()+" wins !", "winner", JOptionPane.ERROR_MESSAGE);
            frame.dispose();
            checked = true;
        }
       else if((buttons[6].getText()==buttons[7].getText()) && (buttons[6].getText()==buttons[8].getText())) {
            JOptionPane.showMessageDialog(frame, buttons[6].getText()+" wins !", "winner", JOptionPane.ERROR_MESSAGE);
            frame.dispose();
            checked = true;
        }
        else if((buttons[0].getText()==buttons[3].getText()) && (buttons[3].getText()==buttons[6].getText())) {
            JOptionPane.showMessageDialog(frame, buttons[0].getText()+" wins !", "winner", JOptionPane.ERROR_MESSAGE);
            frame.dispose();
            checked = true;
        }
        else if((buttons[1].getText()==buttons[4].getText()) && (buttons[4].getText()==buttons[7].getText())) {
            JOptionPane.showMessageDialog(frame, buttons[1].getText()+" wins !", "winner", JOptionPane.ERROR_MESSAGE);
            frame.dispose();
            checked = true;
        }
        else if((buttons[2].getText()==buttons[5].getText()) && (buttons[5].getText()==buttons[8].getText())) {
            JOptionPane.showMessageDialog(frame, buttons[2].getText()+" wins !", "winner", JOptionPane.ERROR_MESSAGE);
            frame.dispose();
            checked = true;
        }
        else if((buttons[0].getText()==buttons[4].getText()) && (buttons[4].getText()==buttons[8].getText())) {
            JOptionPane.showMessageDialog(frame, buttons[0].getText()+" wins !", "winner", JOptionPane.ERROR_MESSAGE);
            frame.dispose();
            checked = true;
        }
        else if((buttons[2].getText()==buttons[4].getText()) && (buttons[4].getText()==buttons[6].getText())) {
            JOptionPane.showMessageDialog(frame, buttons[2].getText()+" wins !", "winner", JOptionPane.ERROR_MESSAGE);
            frame.dispose();
            checked = true;
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {

       }}

                /*}else {
                    if(buttons[i].getText()!="0"){
                        buttons[i].setText("0");
                        buttons[i].setForeground(new Color(0,0,255));
                    turn = true;
                    winner();
                    }*/






