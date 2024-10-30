import static org.junit.Assert.*;
import org.junit.Test; //junit adalah tools yang digunakan unit testing

public class MaxFinderTest {

    // Pengujian angka 3 dari nilai a, b, dan c yang bernilai 1, 2, dan 3
    @Test
    public void testMaxOf123() {
        assertEquals(3, MaxFinder.findMax(1, 2, 3));
    }

    // Pengujian angka -1 dari nilai a, b, dan c yang bernilai -1, -2, dan -3
    @Test
    public void testMaxOfNegativeNumbers() {
        assertEquals(-1, MaxFinder.findMax(-1, -2, -3));
    }

    // Pengujian angka 1 dari nilai a, b, dan c yang bernilai 0, 0, dan 1
    @Test
    public void testMaxOfZeroAndOne() {
        assertEquals(1, MaxFinder.findMax(0, 0, 1));
    }
}