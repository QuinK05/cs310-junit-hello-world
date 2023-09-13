package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public static String reverse(String input) {
    // Create a StringBuilder to store the reversed string
    StringBuilder reversed = new StringBuilder();

    // Iterate through the characters of the input string in reverse order
    for (int i = input.length() - 1; i >= 0; i--) {
        reversed.append(input.charAt(i));
    }

    // Convert the StringBuilder to a String and return it
    return reversed.toString();
}

}