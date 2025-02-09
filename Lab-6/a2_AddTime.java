import java.util.Scanner;

class Time {
    private int hour;
    private int minute;

    public Time() {
        this.hour = 0;
        this.minute = 0;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void addition(int hour, int minute) {
        this.hour += hour;
        this.minute += minute;

        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute = this.minute % 60;
        }
        this.hour = this.hour % 24; // Adjust for 24-hour format
    }
}


public class a2_AddTime {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter hour and minutes for Time1: ");
		Time t1 = new Time(sc.nextInt(),sc.nextInt());
		System.out.print("Enter hour and minutes for Time2: ");
		Time t2 = new Time(sc.nextInt(),sc.nextInt());

		Time result = new Time();
		result.addition(t1.getHour(),t1.getMinute());
		result.addition(t2.getHour(),t2.getMinute());

        System.out.println("The added time is: " + result.getHour() + " hours and " + result.getMinute() + " minutes.");
    }

}
