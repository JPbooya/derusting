import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String str = "Hello World";
    // Find the length of the string
    System.out.println(str.length());
    // Concatenate (add) two strings together and reassign the result
    str = str + " Hey";
    // Find the value of the character at index 3
    System.out.println(str.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(str.contains("Hello"));
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < str.length(); i++) {
      System.out.println(str.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> words = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    words.add("H");
    words.add("E");
    words.add("Y");
    // Join all of the strings in the list together into a single string separated by commas
    String joined = String.join(",", words);
    System.out.println(joined);
    // Use a built-in method to achieve this instead of using a loop

    // Check whether two strings are equal
    System.out.println("H".equals("H"));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
