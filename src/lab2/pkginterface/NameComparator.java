package lab2.pkginterface;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Compare first names using compareTo
        int firstNameComparison = p1.getfName().compareTo(p2.getfName());

        // If first names are equal, then compare last names
        if (firstNameComparison == 0) {
            return p1.getlName().compareTo(p2.getlName());
        }
        return firstNameComparison;
    }
}
