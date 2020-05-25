package HW3;

import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    private Map<Integer, SecondNameAndTelephoneNumber> mapOfTelephone = new HashMap<>();
    private int count;
    private int someNumber;

    public TelephoneDirectory() {
    }

    public void add(long telephoneNumber, String secondName){
        count++;
        mapOfTelephone.put(count, new SecondNameAndTelephoneNumber(telephoneNumber, secondName));
    }
    public void get(String secondName){
        mapOfTelephone.forEach((key, value) -> {
            if (secondName.equals(mapOfTelephone.get(key).getSecondName())){
                System.out.println(mapOfTelephone.get(key));
                someNumber++;
            }
        });
        if (someNumber == 0){
            System.out.println("Don`t have this number");
        } else {
            someNumber = 0;
        }
    }
}
