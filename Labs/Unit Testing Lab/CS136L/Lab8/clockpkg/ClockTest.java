package clockpkg;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClockTest {
    @Test
    public void clockStartsAtGivenTime(){
        Clock clock = new Clock(1,15);
        assertEquals("Clock hour should be 1.", 1, clock.getHour());
        assertEquals("Clock minute should be 15.", 15, clock.getMinute());
    }

    @Test
    public void testAddMinutes(){
        Clock clock = new Clock(1,15);
        clock.addMinutes(20);
        assertEquals("Clock hour should be 1.", 1, clock.getHour());
        assertEquals("Clock minute should be 35.", 35, clock.getMinute());
    }

    @Test
    public void testAddManyMinutes(){
        Clock clock = new Clock(1,15);
        clock.addMinutes(100);
        assertEquals("Clock hour should be 1.", 2, clock.getHour());
        assertEquals("Clock minute should be 55.", 55, clock.getMinute());
    }

    @Test
    public void testAddHours(){
        Clock clock = new Clock(1,15);
        clock.addHours(4);
        assertEquals("Clock hour should be 5.", 5, clock.getHour());
        assertEquals("Clock minute should be 15.", 15, clock.getMinute());
    }

    @Test
    public void testAddManyHours(){
        Clock clock = new Clock(1,15);
        clock.addHours(32);
        assertEquals("Clock hour should be 9.", 9, clock.getHour());
        assertEquals("Clock minute should be 15.", 15, clock.getMinute());
    }
}
