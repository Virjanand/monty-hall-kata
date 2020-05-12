public class MontyHall {
    private final int numberOfDoors;
    private int doorWithPrize;
    private int revealedDoor;
    private int chosenDoor;

    public MontyHall(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setDoorWithPrize(int doorWithPrize) {
        this.doorWithPrize = doorWithPrize;
    }

    public int getDoorWithPrize() {
        return doorWithPrize;
    }

    public int getRevealedDoor() {
        return revealedDoor;
    }

    public void revealDoor() {
        for (int doorNumber = 1; doorNumber <= numberOfDoors; doorNumber++) {
            if (doorNumber != doorWithPrize && doorNumber != chosenDoor) {
                revealedDoor = doorNumber;
                return;
            }
        }
    }

    public void chooseDoor(int chosenDoor) {
        this.chosenDoor = chosenDoor;
    }

    public int getChosenDoor() {
        return chosenDoor;
    }

    public void switchDoor() {
        for (int doorNumber = 1; doorNumber <= numberOfDoors; doorNumber++) {
            if (doorNumber != getRevealedDoor() && doorNumber != getChosenDoor()) {
                chosenDoor = doorNumber;
                return;
            }
        }
    }

    public boolean isWin() {
        return chosenDoor == doorWithPrize;
    }
}
