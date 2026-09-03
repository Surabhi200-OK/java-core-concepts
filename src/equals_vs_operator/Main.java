package equals_vs_operator;

public class Main {
    public static void main(String[] args) {

        String s1 = "Alice";
        String s2 = "Alice";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Alice");
        String s4 = new String("Alice");

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        String s5 = "Java";
        String s6 = new String("Java");

        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));

        String s7 = new String("Java");
        s7 = "Java";

        System.out.println(s5==s7);
        System.out.println(s5.equals(s7));

        s7 = null;

        System.out.println(s7.equals(s5));

        String s8 = "Hello";
        String s9 = s8 + "World";

        System.out.println(s8 == s9);
        System.out.println(s8.equals(s9));


    }
}
