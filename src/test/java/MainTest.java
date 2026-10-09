import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void shouldCalculateMiles() {
        int ticketPrice = 13_676;
        int rublesPerMile = 20;
        int expected = 683;

        int actual = ticketPrice / rublesPerMile;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMilesForRoundSum() {
        int ticketPrice = 10_000;
        int rublesPerMile = 20;
        int expected = 500;

        int actual = ticketPrice / rublesPerMile;

        Assertions.assertEquals(expected, actual);
    }
}