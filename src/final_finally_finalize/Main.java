package final_finally_finalize;


import final_finally_finalize.finally_block.Maths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //final_keyword
        // Variable Level

//        Employee e1 = new Employee("Google");
//        e1.id = 1L;
//        e1.name = "Alice";
//
//
//        e1.printEmployeeInfo();

        //Method Level

//        Employee e1 = new Employee();
//        e1.greet();
//
//        Intern i1 = new Intern();
//        i1.greet();
//
//        Manager m1 = new Manager();
//        m1.greet();

        //Class Level

//        Employee e1 = new Employee();
//        e1.greet();

        // --------------------------------------------------------------------------------------------------------------------------------

        //finally Block
        Maths m = new Maths();
        int result = m.divide(4,0);
        System.out.println(result);

        // -----------------------------------------------------------------------------------------------------------------------------------


    }
}