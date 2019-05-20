package lab4;

import java.time.LocalDateTime;

public class TimeTable {

    private String number;
    private String toArrival;
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;

    public TimeTable(String number, String toArrival, LocalDateTime timeStart, LocalDateTime timeEnd) {
        this.number = number;
        this.toArrival = toArrival;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getToArrival() {
        return toArrival;
    }

    public void setToArrival(String toArrival) {
        this.toArrival = toArrival;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    @Override
    public String toString() {
        return "TimeTable{" +
                "number='" + number + '\'' +
                ", toArrival='" + toArrival + '\'' +
                ", timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                '}';
    }
}
