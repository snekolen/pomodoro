import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.FlowLayout;  
import java.awt.event.*;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Dimension;

//This class keeps track of characteristics for the JFrame

public class Main implements ActionListener { //Used for console
    public JFrame frame;
    public JButton taskButton;
    public JButton settingsButton;

    private JPanel timer;
    public JPanel pages;
    public CardLayout card;

    public Settings settings;

    public Main() {
        frame = new JFrame("Pomodoro");
        settings = new Settings();

        timer = new JPanel();
        pages = new JPanel();
        card = new CardLayout();
    
        this.taskButton = new JButton("Tasks");
        this.settingsButton = new JButton("Settings");

        this.taskButton.addActionListener(this);
        this.settingsButton.addActionListener(this);
    }

    public void runFrame(){
        frame.setSize(1080, 780); //4.5 * 3.25
        frame.setLocationRelativeTo(null);  

        ImageIcon icon = new ImageIcon("C:/pomodoro/images/pomodoro.png");
        frame.setIconImage(icon.getImage());

        timer.add(taskButton);
        timer.add(settingsButton);

        pages.setLayout(card);
        pages.add(timer, "Timer");
        frame.add(pages);

        frame.setLayout(new FlowLayout()); //Change layout soon

        //Settings
        frame.add(settings.settingsMenu); //Works but fix formatting later

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
    }


    public static void main(String[] args){ //Loads homescreen
        System.setProperty("java.awt.headless", "false"); //Disables headless

        Main display = new Main();
        display.runFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) { //Action listener for buttons
        if(e.getSource() == taskButton){
            card.next(pages);
            System.out.println("Task button");
        }else if(e.getSource() == settingsButton){
            settings.openSettings();
            System.out.println("Settings button");
        }
    }
}