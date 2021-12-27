import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.*;

class Settings implements ActionListener {
    public Time time;
    public JInternalFrame settingsMenu;

    //Notification messages to
    private String pomoMessage;
    private String breakMessage;

    public boolean notifs; //Desktop notifs
    public boolean sound; //Notification sound

    public int intervals;

    public Settings() {
        time = new Time();
        settingsMenu = new JInternalFrame("Settings", true, true, true, true);

        this.pomoMessage = "Back to work!";
        this.breakMessage = "Break time!";
        this.notifs = true;
        this.sound = true;
    }

    public void openSettings() { //Opens settings menu
        JPanel sP = new JPanel();
        JLabel title = new JLabel("Time (minutes)               Notifications");
        sP.add(title);
        settingsMenu.add(sP);
        settingsMenu.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Settings");
    }
}
