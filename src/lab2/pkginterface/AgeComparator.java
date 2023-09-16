package lab2.pkginterface;

import java.util.Comparator;

public class AgeComparator implements Comparator<Object> {
    @Override
    public int compare(Object obj1, Object obj2) {
        if (obj1 instanceof Person && obj2 instanceof Person) {
            Person person1 = (Person) obj1;
            Person person2 = (Person) obj2;
            
            // Compare ages using Integer.compare
            return Integer.compare(person1.getAge(), person2.getAge());
        } else {
            // Handle cases where objects are not type Person
            throw new IllegalArgumentException("Both objects must be type Person");
        }
    }
}
