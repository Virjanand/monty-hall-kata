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
        revealedDoor = 2;
    }
}
