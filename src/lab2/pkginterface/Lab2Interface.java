package lab2.pkginterface;

import java.util.Arrays;

public class Lab2Interface {

    public static void main(String[] args) {
        // Create array of Person objects
        Person[] peopleList = new Person[10];
        peopleList[0] = new Person("Seraphina", "Doe", 18);
        peopleList[1] = new Person("Bertha", "Alberheart", 25);
        peopleList[2] = new Person("Charles", "Young", 28);
        peopleList[3] = new Person("Kreyal", "Arroyal", 19);
        peopleList[4] = new Person("Emai", "Ardecetti", 18);
        peopleList[5] = new Person("Phirre", "Lotus", 20);
        peopleList[6] = new Person("Kissae", "Arroyal", 19);
        peopleList[7] = new Person("Kidus", "Elai", 16);
        peopleList[8] = new Person("Nari", "Oh", 17);
        peopleList[9] = new Person("Chanyang", "Joo", 17);
        
        // Sort array people by age using AgeComparator
        Arrays.sort(peopleList, new AgeComparator());

        System.out.println("Sorted people list by their age: ");
        for (Person person : peopleList) {
            System.out.println(person.toString());
        }

        // Sort array people by name using NameComparator
        Arrays.sort(peopleList, new NameComparator());

        System.out.println("\nSorted people list by their name: ");
        for (Person person : peopleList) {
            System.out.println(person.toString());
        }
    }
    
}
