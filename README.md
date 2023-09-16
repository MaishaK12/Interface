# Interface
Lab work for my Data Structures and Algorithms class.

Comparator Interface

    Create a new project and call it Lab2-Interface. 
    Let’s practice the Comparator interface. It is one of the interfaces from Java library. The interface declares a compare method. It is used to compare two objects of the same class. 
      int compare(Object obj1, Object obj2); 
      obj1 and obj2 are two objects to be compared. 
    We’ll also use Arrays class’s sort method from Java library. 
    public static void sort(Object[] a, ComparatorClass c) 
    To sort the array a, ComparatorClass must implement a Comparator interface. 
    For this lab, you will compare objects of Person class using customized comparators. The comparators are based on age and name. 

Person class 
    Create a class, Person. 
    Declare instance variables to hold person’s age, first and last name. 
    Create a constructor, getter and setters as required. 
    Override toString 
      It must return person’s full name and age. 

AgeComparator class 
    Create AgeComparator class which implements Comparator interface and define compare method. 
      compare(a,b) must return a negative number if a should come before b, zero if a and b are the same, and a positive number otherwise. 
      You need to cast objects (Object →Person). 
    Alternatively, compare method of wrapper class Integer can be called to compare two person objects based on their age. 

NameComparator class 
    Create NameComparator class which implements Comparator interface and define compare method. 
    Use compareTo method of String class to compare first names of person objects. 
      Object1.method1().compareTo(object2.method1()) 
    Keep into consideration the possibility of same first names. In this case, the overrided compare method is responsible to compare persons last names. 
      compareTo() returns 0 if both strings are equal. 
      If returned value is not equal to zero, compare last names. 

PersonTester 
    Create an array, peopleList, of Person type which hold at least 10 people objects. 
    Sort the array of people with the Arrays.sort method based on their ages and names.
      Arrays.sort(peopleList, new AgeComparator()); 
      Arrays.sort(peopleList, new NameComparator()); 
