package example.Stopwatch;

public class Stopwatch {
    int hours=0;
    int minutes=0;
    int seconds=0;
    int day=0;
    int workingHours=0;

  public void recordMinutes(int minutes) {
    if (minutes > 0) {
     this.minutes += minutes; 
      if (this.minutes >= 60) {
         this.hours += this.minutes / 60;
         this.minutes = this.minutes % 60;
        }
        if (this.hours >= 24) {
            this.day += this.hours / 24;
            this.hours = this.hours % 24;
        }
    } else {
        System.out.println("Invalid input. Minutes must be a positive number");
    }
}

}
