public class MontyHall {
    private int doorWithPrize;
    private int revealedDoor;
    private int chosenDoor;

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
        for (int i = 1; i <= 3; i++) {
            if (i != doorWithPrize) {
                revealedDoor = i;
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
        for (int i = 1; i <=3; i++) {
            if (i != getRevealedDoor() && i != getChosenDoor()) {
                chosenDoor = i;
                return;
            }
        }
    }

    public boolean isWin() {
        return true;
    }
}
