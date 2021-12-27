import java.util.Calendar;
import java.util.Date;

//This class sets times for the countdown timer
public class Time {
    private int pomoTime;
    private int breakTime;

    public boolean pomodoro;

    public Time() { //Default constructor
        this.pomoTime = 25;
        this.breakTime = 5;

        this.pomodoro = true;
    }

    public Time(int t, int b) { //Parametrized constructor (Needed?)
        this.pomoTime = t;
        this.breakTime = b;
    }

    //Getter and setter functions
    public void setP(int p) {
        this.pomoTime = p;
    }

    public void setB(int b) {
        this.breakTime = b;
    }

    public int getP() {
        return pomoTime;
    }

    public int getB() {
        return breakTime;
    }

    public void resetTimes() {
        this.pomoTime = 25;
        this.breakTime = 5;
        this.pomodoro = true;
    }
    
    public void switchMode(){
        if(pomodoro) this.pomodoro = false; //Pomodoro finished
        else this.pomodoro = true; //Break time finished
    }

    //Return array with current and end of task and break times
    public Date retTime() {
        Calendar curr = Calendar.getInstance();
        long millis = curr.getTimeInMillis();
        long time;

        if(pomodoro){
            time = pomoTime * 60 * 1000;
        }else{
            time = breakTime * 60 * 1000;
        }

        switchMode();
        
        Date intervalEnd = new Date(millis + time);
        return intervalEnd;
    }

    public static void main(String args[]) {
        Time obj = new Time();
        System.out.println(obj.retTime()); //pomodoro
        System.out.println(obj.retTime()); //break
    }
}
