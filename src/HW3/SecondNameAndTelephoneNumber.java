package HW3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SecondNameAndTelephoneNumber {
    private long telephoneNumber;
    private String secondName;
    private int count;
    private Map<Integer, SecondNameAndTelephoneNumber> mapOfTelephone = new HashMap<>();



    public SecondNameAndTelephoneNumber(long telephoneNumber, String secondName) {
        this.telephoneNumber = telephoneNumber;
        this.secondName = secondName;
    }
    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "telephoneNumber=" + telephoneNumber +
                ", secondName='" + secondName + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondNameAndTelephoneNumber that = (SecondNameAndTelephoneNumber) o;
        return telephoneNumber == that.telephoneNumber &&
                secondName.equals(that.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephoneNumber, secondName);
    }
}
