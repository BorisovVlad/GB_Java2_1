package TestingDZ;

public class Treadmill implements Obstacle{

    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int weight() {
        return 0;
    }
}
