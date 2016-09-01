import java.text.*;
import java.util.*;

public class DateTask1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Посчитаем сколько дней включительно осталось до Нового Года");
        System.out.println("Введите дату в формате хх.хх.хххх(день.месяц.год) - начало отсчета: ");

        boolean filedString = in.hasNext();

        if (filedString){
            String pars = in.next();

            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

            Date date1 = null;
            Date date2 = null;
            try {
                date1 = sdf.parse(pars);
                date2 = sdf.parse("01.01.2017");
            } catch (ParseException e) {
                e.printStackTrace();
            }

            long difference = date2.getTime() - date1.getTime();
            long days =  difference / (24 * 60 * 60 * 1000);
            System.out.println("До Нового года " + days + " дней");

        }
    }
}