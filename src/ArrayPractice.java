public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] words = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    words[0] = "Hi";
    words[1] = "Hello";
    words[2] = "World";
    words[3] = "Java";
    // Get the value of the array at index 2
    System.out.println(words[2]);
    // Get the length of the array
    System.out.println(words.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < words.length; i ++) {
      System.out.println(words[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String word : words) {
      System.out.println(word);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
