import java.util.Scanner;
public class Debug2 {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        //here's a hint
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long fact = 1; // initialize factorial, start at 1
        // long is a good way to process large numbers as it can store numbers from  -9223372036854775808 to 9223372036854775808.
        // https://www.w3schools.com/java/ref_keyword_long.asp
        for (int i = 1; i <= x; i++){ // Start at 1 end at input
        fact = fact * i; // multiply the numbers together
        }
        System.out.println(fact);
        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        int num = sc.nextInt();
        int sum = 0; // Initialize the sum as 0
        for (int i = 1; i <= num; i+= 2){ // i += 2, every other, so 3 should be (1+3) 
        sum += i; // loop and add to the sum    
        }
        System.out.println("The sum is " + sum);


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4"); 
        boolean run = true; // It never becomes false because run is always true
        while (run == true){
            System.out.println("I printed once!");
            run = false; // add a condition that terminates the loop
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5"); // this one was tricky, I had to consult stack exchange
         // https://stackoverflow.com/questions/66557726/using-loops-to-reverse-a-string
        //hint
        String reverse = "";
        String input = sc.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) { // move backwards in the string -1 since the first character of the string is technically 0 not 1 so each index is technically 1 less.
            // For example for hat, the character 't' is index 2 not 3 
            reverse += input.charAt(i); // adding the characters to the empty string, 
        // needed to understand what CharAt is for, it returns the character at the specified index in a string.
        // https://www.w3schools.com/java/ref_string_charat.asp
    }
}
}
