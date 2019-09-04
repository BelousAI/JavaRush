package Test.Other;

import Test.Other.Test;

/**
 * Created by Антон on 16.02.2017.
 */
public class Student {
    private int student_id;

    public Student(int student_id)
    {
        this.student_id = student_id;
    }

    public static void main(String[] args)
    {
        Student s1 = new Student(8888);
        Student s2 = new Student(8888);

        if(s1.equals(s2))                       //нужно переопределять метод equals!!!
            System.out.println("Они равны!");
        else
            System.out.println("Они не равны!");

        String st = "java";
        String st2 = "java";
        System.out.println(st.equals(st2));     //в классе String метод equals переопределен!!!!
    }
}
