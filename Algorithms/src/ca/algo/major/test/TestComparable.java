package ca.algo.major.test;

import ca.algo.major.sort.Student;

public class TestComparable {
    public static void main(String[] args) {
        Student s1 = new Student("Jack", 18);
        Student s2 = new Student("David", 15);

        Comparable<Student> max = getMax(s1, s2);
        System.out.println(max);
    }
    public static Comparable<Student> getMax(Comparable<Student> c1, Comparable<Student> c2)
    {
        int result = c1.compareTo((Student) c2);
        if(result >= 0)
        {
            return c1;
        }
        else
        {
            return c2;
        }
    }
}
