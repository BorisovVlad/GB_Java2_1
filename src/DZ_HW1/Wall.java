package TestingDZ;

public class Wall implements Obstacle {
    private int weight;

    public Wall(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public int weight() {
        return weight;
    }
}
