package example.Stopwatch;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
//el steps for reference
//TODO
//test case l record minutes hat fail then h3ml record minutes then green w refactor law fe
//test case negative input then red then hazabat el code then green then refactor law fe
//if minutes reach 60 hours msh hay7salaha 7aga then hazabatha then refactor
//if hours reach 24 days msh hay7salaha 7aga then hazabatha then refactor
//daily working hours msh hay7sal 7aga l date then azabatha



public class StopWatchTest {
  @Test
  void TestMinutes(){
    //Arrange
    Stopwatch stopwatch = new Stopwatch();
    //Act
    stopwatch.recordMinutes(-5);
    //Assert
    assertEquals(0, stopwatch.getRecordedMinutes());
  }
  @Test
  void TestHours(){
    //Arrange
    Stopwatch stopwatch = new Stopwatch();
    //Act
    stopwatch.recordMinutes(75);
    //Assert
    assertEquals(1, stopwatch.getRecordedHours());
  }
  @Test 
  void TestDays() {
    //Arrange
    Stopwatch stopwatch = new Stopwatch();
    //Act
    stopwatch.recordMinutes(1600); // 1600 minutes = 26 hours
    //Assert
    assertEquals(1, stopwatch.getRecordedDays());
  }
 
  @Test
    void TestWorkingHours() {
        //Arrange
        Stopwatch stopwatch = new Stopwatch();
        //Act
        stopwatch.recordMinutes(480); 
        //Assert
        assertEquals(8, stopwatch.getRecordedMinutes());
    }
}
