package TestingDZ;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<SportsmenAbstractClass> sportsmenAbstractClasses = new ArrayList<>();
        List<Obstacle> obstacles = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            sportsmenAbstractClasses.add(new SportsmenAbstractClass(100 + (i * 10),3 + i));
        }
        for (int i = 0; i < 15; i++) {
            obstacles.add(new Treadmill(10 * i));
            obstacles.add(new Wall(i));
        }
        for (int i = 0; i < sportsmenAbstractClasses.size() ; i++) {
            for (int j = 0; j < obstacles.size(); j++) {
                if (!sportsmenAbstractClasses.get(i).isCan()){
                    break;
                }
                sportsmenAbstractClasses.get(i).sporting(obstacles.get(j));
            }
        }

    }
}
