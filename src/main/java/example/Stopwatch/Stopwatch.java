package example.Stopwatch;

public class Stopwatch {
    int hours=0;
    int minutes=0;
    int seconds=0;
    int day=0;
    int workingHours=0;

    public void recordMinutes(int minutes) {
        if (minutes > 0) {
     this.minutes = minutes;
    }
    else{
            System.out.println("Invalid input. Minutes must be a positive number");
    }
}
    public int getRecordedMinutes(){
    return this.minutes;
    }
}
