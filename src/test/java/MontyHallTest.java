import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MontyHallTest {

    @Test
    void doorWithPrize() {
        MontyHall montyHall = new MontyHall();
        montyHall.setDoorWithPrize(1);
        assertEquals(1, montyHall.getDoorWithPrize());
    }
}
