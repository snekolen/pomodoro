import java.util.Calendar;
import java.util.Date;

//This class sets times for the countdown timer
public class Time {
    private int taskTime;
    private int breakTime;

    public Time() { //Default constructor
        this.taskTime = 25;
        this.breakTime = 5;
    }

    public Time(int t, int b) { //Parametrized constructor (Needed?)
        this.taskTime = t;
        this.breakTime = b;
    }

    //Getter and setter functions
    public void setT(int t) {
        this.taskTime = t;
    }

    public void setB(int b) {
        this.breakTime = b;
    }

    public int getT() {
        return taskTime;
    }

    public int getB() {
        return breakTime;
    }

    public void resetTimes() {
        this.taskTime = 25;
        this.breakTime = 5;
    }

    //Return array with current and end of task and break times
    public Date[] retDates() {
        Date[] date = new Date[3];
        Calendar curr = Calendar.getInstance();
        date[0] = curr.getTime();


        long milis = curr.getTimeInMillis();
        date[1] = new Date(milis + (taskTime * 60 * 1000));
        date[2] = new Date(milis + ((taskTime + breakTime) * 60 * 1000));
        return date;
    }
}
