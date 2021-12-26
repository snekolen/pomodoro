import java.util.Date;

//Used for displaying JFrame

public class Main {
    public static void main(String args[]) {
        Time obj = new Time();
        Date[] d = obj.retDates();

        for(int i = 0; i < d.length; i ++){
            System.out.println(d[i]);
        }
    }
}