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

    @Test
    void chooseDoor() {
        montyHall.chooseDoor(3);
        assertEquals(3, montyHall.getChosenDoor());
    }

    @Test
    void chooseDoor2RevealDoor3() {
        montyHall.chooseDoor(2);
        montyHall.revealDoor();
        assertEquals(3, montyHall.getRevealedDoor());
    }

    @Test
    void switchDoor() {
        montyHall.chooseDoor(3);
        montyHall.revealDoor();
        montyHall.switchDoor();
        assertEquals(1, montyHall.getChosenDoor());
    }

    @Test
    void isWinNoSwitch() {
        montyHall.chooseDoor(3);
        montyHall.revealDoor();
        assertEquals(false, montyHall.isWin());
    }

    @Test
    void isWinWithSwitch() {
        montyHall.chooseDoor(3);
        montyHall.revealDoor();
        montyHall.switchDoor();
        assertEquals(false, montyHall.isWin());
    }
}
