package string;

public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder empty = new StringBuilder();
        System.out.println(empty); // ""
        StringBuilder sb = new StringBuilder("I use Java");
        System.out.println(sb.length()); // 10
        System.out.println("--------------------------------");
        StringBuilder sb1 = new StringBuilder("I use Java");
        System.out.println(sb1.charAt(0)); // 'I'
        System.out.println(sb1.charAt(6)); // 'J'
        System.out.println("--------------------------------");
        StringBuilder sb2 = new StringBuilder("start");
        sb2.setCharAt(1, 'm');
        System.out.println(sb2); // "smart"
        System.out.println("--------------------------------");
        StringBuilder sb3 = new StringBuilder("dessert");
        sb.deleteCharAt(2);
        System.out.println(sb3); // "desert"
        System.out.println("--------------------------------");
        sb.append("123");
        System.out.println(sb3); //desert123
        System.out.println("--------------------------------");
        StringBuilder sb4 = new StringBuilder("I'm a programmer.");
        sb.insert(6, "Java ");
        System.out.println(sb4); // I'm a Java programmer.
        System.out.println("--------------------------------");
        StringBuilder sb5 = new StringBuilder("Let's use C#");
        sb.replace(10,12,"Java");
        System.out.println(sb5); // Let's use Java
        System.out.println("--------------------------------");
        StringBuilder sb6 = new StringBuilder("Welcome");
        sb6.delete(0,3); //come
        sb6.reverse(); //
        System.out.println(sb6); //emoc
        //when you have a StringBuilder object,
        // you can get a String by invoking the toString method.

        System.out.println("--------------------------------");
        StringBuilder letters = new StringBuilder("A");
        for (char i = 'B'; i <= 'Z'; i++ ) {
            letters.append(" "+ i);

        }

        System.out.print(letters+"/");
        System.out.println("--------------------------------");
    }
}
