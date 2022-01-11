public class Main {

    public static void main(String[] args) {
	System.out.println("Hi, I am Kah Jun"); //Example 1
    String module = "CSC1009"; //Example 2
    switch (module) {
        case "CSC1006" -> System.out.println("Math 2");
        case "CSC1007" -> System.out.println("Operating Systems");
        case "CSC1008" -> System.out.println("Data Structure and Algorithms");
        case "CSC1009" -> System.out.println("Object Oriented Programming");
        case "CSC1010" -> System.out.println("Computer Networks");
    }
    for (int x = 102; x >= 66; x--){ //Example 3
        if (x%2 != 0){
            System.out.format("x is %d\n", x);
        }
    }
    }
}
