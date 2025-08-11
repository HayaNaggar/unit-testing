package example.Stopwatch;

public class Stopwatch {
    int hours=0;
    int minutes=0;
    int seconds=0;
    int day=0;
    int workingHours=0; //assuming a wroking day is 8 hours
    int workingDays = 0;

 public void recordMinutes(int minutes) {
    if (minutes > 0) {
        this.minutes += minutes; 
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
       
    } else {
        System.out.println("Invalid input. Minutes must be a positive number");
    }
}

    public int getRecordedMinutes(){
    return this.minutes;
    }
    public int getRecordedHours() {

        return this.hours;
    }
    public int getRecordedDays() {

        return this.day;
    }
    public int getRecordedWorkingHours() {
        return this.workingHours;
    }
       public int getRecordedWorkingDays() {
        return this.workingDays;
    }
}