public class MontyHall {
    private int doorWithPrize;
    private int revealedDoor;

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
}
