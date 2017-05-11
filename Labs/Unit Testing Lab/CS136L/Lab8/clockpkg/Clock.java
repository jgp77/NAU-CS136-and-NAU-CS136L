package clockpkg;

public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        wrap();
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }

    public void addMinutes(int m) {
        this.minute += m;
        wrap();
    }

    public void addHours(int h) {
        this.hour += h;
    }

    private void wrap() {
        hour += minute / 60;
        minute = minute % 60;
    }
}
