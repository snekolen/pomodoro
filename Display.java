import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.*;  
import java.awt.event.*;  

//This class keeps track of characteristics for the JFrame

public class Display{ //Used for console

    public static void main(String[] args){ //Loads homescreen
        JFrame frame = new JFrame("Pomodoro");
        frame.setSize(1080, 780); //4.5 * 3.25
        frame.setLocationRelativeTo(null);  

        ImageIcon icon = new ImageIcon("C:/pomodoro/images/pomodoro.png");
        frame.setIconImage(icon.getImage());

        //Tasks and settings buttons/layout
        JButton taskButton = new JButton("Tasks");
        JButton settingsButton = new JButton("Settings");
        frame.add(taskButton);
        frame.add(settingsButton);
        frame.setLayout(new FlowLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
    }

}