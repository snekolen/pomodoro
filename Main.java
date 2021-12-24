import java.util.Date;

//May be used for displaying JFrame instead

//Allow user to customize

public class Main {
    public static void main(String args[]) {
        Time obj = new Time();
        Date[] d = obj.retDates();

        for(int i = 0; i < d.length; i ++){
            System.out.println(d[i]);
        }
    }
}