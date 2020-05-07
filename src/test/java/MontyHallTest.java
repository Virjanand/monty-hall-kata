import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MontyHallTest {
    private MontyHall montyHall;

    @BeforeEach
    void createMontyHallWithPrize() {
        montyHall = new MontyHall();
        montyHall.setDoorWithPrize(1);
    }

    @Test
    void doorWithPrize() {
        assertEquals(1, montyHall.getDoorWithPrize());
    }

    @Test
    void revealDoor() {
        montyHall.revealDoor();
        assertEquals(2, montyHall.getRevealedDoor());
    }
}
