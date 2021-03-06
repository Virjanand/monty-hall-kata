import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class MontyHallTest {
    private MontyHall montyHall;

    @BeforeEach
    void createMontyHallWithPrize() {
        montyHall = new MontyHall(3);
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
        assertFalse(montyHall.isWin());
    }

    @Test
    void isWinWithSwitch() {
        montyHall.chooseDoor(3);
        montyHall.revealDoor();
        montyHall.switchDoor();
        assertTrue(montyHall.isWin());
    }

    @Test
    void runMontyHall100Times() {
        int numberOfDoors = 3;
        MontyHall montyHall = new MontyHall(numberOfDoors);
        int numberOfWins = 0;
        for (int i = 0; i < 100; i++) {
            montyHall.setDoorWithPrize(getRandomDoorNumber(numberOfDoors));
            montyHall.chooseDoor(getRandomDoorNumber(numberOfDoors));
            montyHall.revealDoor();
            montyHall.switchDoor();
            if (montyHall.isWin()) {
                numberOfWins++;
            }
        }
        System.out.println(numberOfWins);
    }

    private int getRandomDoorNumber(int numberOfDoors) {
        return new Random().nextInt(numberOfDoors) + 1;
    }
}
