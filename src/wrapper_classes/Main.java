package wrapper_classes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //Boxing
        int a = 10;
        Integer obj = Integer.valueOf(a);

       //Unboxing
        int b = obj.intValue();

        //autoboxing
        Integer obj1 = a;

        //autoUnboxing
        int c = obj1;

        //String to Integer
        String s = "10";
        Integer obj2 = Integer.valueOf(s);

        //String to int
        int d = Integer.parseInt(s);

        //Integer to String
        String s1 = obj2.toString();

        //compareTo
        Integer e = Integer.valueOf(10);
        Integer f = Integer.valueOf(20);

        Integer res = e.compareTo(f);

        System.out.println(res);

        System.out.println(Integer.max(e,f));
        System.out.println(Integer.min(e,f));
        System.out.println(Integer.sum(e,f));

        //Utility Variables
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}