package equals_and_hashcode;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Alice";

        Employee e2 = new Employee();
        e2.id = 1;
        e2.name = "Alice";

       // System.out.println(e1.equals(e2));

        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set.size());

//        String s1 = new String("Alice");
//        String s2 = new String("Alice");
//
//        System.out.println(s1.equals(s2));
    }
}