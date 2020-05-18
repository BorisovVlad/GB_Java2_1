package TestingDZ;

public class SportsmenAbstractClass {
    private int canRun;
    private int canJump;
    private boolean can;

    public int getCanRun() {
        return canRun;
    }

    public int getCanJump() {
        return canJump;
    }

    public boolean isCan() {
        return can;
    }

    public SportsmenAbstractClass(int canRun, int canJump) {
        this.canRun = canRun;
        this.canJump = canJump;
        this.can = true;
    }

    public void sporting(Obstacle obstacle) {
        if (obstacle.length() > 0){
            run(obstacle);
        } else {
            jump(obstacle);
        }
    }
    public void jump(Obstacle obstacle) {
        if (getCanJump() >= obstacle.weight()){
            System.out.println("Получилось перепрыгнуть через стену высотой " + obstacle.weight());
        } else {
            System.out.println("Не получилось перепрыгнуть через стену высотой " + obstacle.weight());
            can = false;
        }
    }

    public void run(Obstacle obstacle) {
        if (obstacle.length() < canRun) {
            System.out.println("Получилось пробежать  " + obstacle.length() + " метров");
        } else {
            System.out.println("Не получилось пробежать  " + obstacle.length() + " метров");
            can = false;
        }
    }

}
