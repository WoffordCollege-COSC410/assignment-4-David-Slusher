package edu.wofford;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuiMain extends JFrame implements ActionListener {
    TicTacToeModel model;
    JButton zz;
    JButton zo;
    JButton zt;
    JButton oz;
    JButton oo;
    JButton ot;
    JButton tz;
    JButton to;
    JButton tt;
    JPanel panel;
    JLabel label;
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == zz){
          if(model.setMarkAt(0,0)){
            if(model.getMarkAt(0,0) == TicTacToeModel.Mark.XMARK){
              zz.setText("X");
            }
            else{
              zz.setText("O");
            }
          }

        }
        else if (event.getSource() == zo){
          if(model.setMarkAt(0,1)){
            if(model.getMarkAt(0,1) == TicTacToeModel.Mark.XMARK){
              zo.setText("X");
            }
            else{
              zo.setText("O");
            }
          }
        }
        else if (event.getSource() == zt){
          if(model.setMarkAt(0,2)){
            if(model.getMarkAt(0,2) == TicTacToeModel.Mark.XMARK){
              zt.setText("X");
            }
            else{
              zt.setText("O");
            }
          }
        }
        else if (event.getSource() == oz){
          if(model.setMarkAt(1,0)){
            if(model.getMarkAt(1,0) == TicTacToeModel.Mark.XMARK){
              oz.setText("X");
            }
            else{
              oz.setText("O");
            }
          }
        }
        else if (event.getSource() == oo){
          if(model.setMarkAt(1,1)){
            if(model.getMarkAt(1,1) == TicTacToeModel.Mark.XMARK){
              oo.setText("X");
            }
            else{
              oo.setText("O");
            }
          }
        }
        else if (event.getSource() == ot){
          if(model.setMarkAt(1,2)){
            if(model.getMarkAt(1,2) == TicTacToeModel.Mark.XMARK){
              ot.setText("X");
            }
            else{
              ot.setText("O");
            }
          }

        }
        else if (event.getSource() == tz){
          if(model.setMarkAt(2,0)){
            if(model.getMarkAt(2,0) == TicTacToeModel.Mark.XMARK){
              tz.setText("X");
            }
            else{
              tz.setText("O");
            }
          }
        }
        else if (event.getSource() == to){
          if(model.setMarkAt(2,1)){
            if(model.getMarkAt(2,1) == TicTacToeModel.Mark.XMARK){
              to.setText("X");
            }
            else{
              to.setText("O");
            }
          }
        }
        else if (event.getSource() == tt){
          if(model.setMarkAt(2,2)){
            if(model.getMarkAt(2,2) == TicTacToeModel.Mark.XMARK){
              tt.setText("X");
            }
            else{
              tt.setText("O");
            }
          }
        }
        if (model.getResult() == TicTacToeModel.Result.XWIN){
          label.setText("X wins");
        }
        else if (model.getResult() == TicTacToeModel.Result.OWIN){
          label.setText("O wins");
        }
        else if (model.getResult() == TicTacToeModel.Result.TIE){
          label.setText("TIE");
        }
    }

    public GuiMain() {
        model = new TicTacToeModel();
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("");
        label.setName("result");
        add(new JLabel());
        add(label);
        add(new JLabel());
        setLayout(new GridLayout(4, 5));
        zz = new JButton();
        zz.setName("location00");
        zo = new JButton();
        zo.setName("location01");
        zt = new JButton();
        zt.setName("location02");
        oz = new JButton();
        oz.setName("location10");
        oo = new JButton();
        oo.setName("location11");
        ot = new JButton();
        ot.setName("location12");
        tz = new JButton();
        tz.setName("location20");
        to = new JButton();
        to.setName("location21");
        tt = new JButton();
        tt.setName("location22");

        zz.addActionListener(this);
        zo.addActionListener(this);
        zt.addActionListener(this);
        oz.addActionListener(this);
        oo.addActionListener(this);
        ot.addActionListener(this);
        tz.addActionListener(this);
        to.addActionListener(this);
        tt.addActionListener(this);

        add(zz);
        add(zo);
        add(zt);
        add(oz);
        add(oo);
        add(ot);
        add(tz);
        add(to);
        add(tt);

    }


	public static void main(String[] args) {
	    GuiMain window = new GuiMain();
        window.setVisible(true);
        window.setPreferredSize(new Dimension(500, 500));
	}
}
