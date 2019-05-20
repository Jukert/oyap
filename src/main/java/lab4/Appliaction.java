package lab4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Appliaction {
    public static void main(String[] args) {

        List<TimeTable> busses = new ArrayList<>();
        busses.add(new TimeTable(
                "123",
                "Minsk",
                LocalDateTime.of(2019, 4, 24, 8, 45),
                LocalDateTime.of(2019, 4, 24, 15, 40)));

        busses.add(new TimeTable(
                "123",
                "Vitebsk",
                LocalDateTime.of(2019, 4, 24, 8, 45),
                LocalDateTime.of(2019, 4, 24, 22, 40)));
        busses.add(new TimeTable(
                "123",
                "Minsk",
                LocalDateTime.of(2019, 4, 24, 8, 45),
                LocalDateTime.of(2019, 4, 24, 20, 40)));


        for (TimeTable timeTable : busses) {
            if (timeTable.getTimeEnd().getHour() < 21) {
                System.out.println(timeTable.toString());
            }

        }
    }

}
