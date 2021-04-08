public class Room {
    private int roomIndex;
    private int secretCode;
    public static int nextIndex = 1;
    
    public Room(int code) {
        secretCode = code;
        roomIndex = nextIndex++;
    }
    
    public String toString() {
        return String.format("Room:%03d", roomIndex);
    }
    
    public int getRoomIndex() {
        return roomIndex;
    }
    
    public boolean openDoor(int code) {
        if (secretCode == code) {
            return true;
        }
        return false;
    }
}