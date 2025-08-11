package example.Stopwatch;

import java.lang.classfile.Signature;
import java.lang.classfile.instruction.ThrowInstruction;

public class Stopwatch {
    int hours;
    int minutes;
    int seconds;
    int day;
    int workingHours;

    public void recordMinutes(int minutes) {
     this.minutes = minutes;
    }
    public int getRecordedMinutes(){
    return this.minutes;
    }
}
