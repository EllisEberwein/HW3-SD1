/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
    System.out.println("Input a word:");
    Scanner sc = new Scanner(System.in); 
    String input = sc.nextLine();
    for (int i = 0; i < input.length(); i++){ // For each i less than the length, since recall the first spot is 0 in a string 
        // and it will terminate once the i is below the length of the string 
        char spot = input.charAt(i); // I used char to store each index of the string 
        // https://www.w3schools.com/java/ref_keyword_char.asp
        // charat pulls the letter off the current index, I used in Debug 2
        System.out.println(spot); // then print the spot in the string once it is stored
        // then it will repeat until the last index
    }
}}
