package swing;

import javax.swing.JFrame;

public class first {
  public static void main(String[] args) {
    JFrame obj=new JFrame();
    second sc=new second();
    obj.setBounds(10,10,700,600);
    obj.setTitle("my Breakout Ball");
    obj.setResizable(false);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    obj.add(sc);
  }
    
}