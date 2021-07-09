import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter numbers: ");

        // This inputs the numbers and stores as one whole string value
        // (e.g. if user entered 1 2 3, input = "1 2 3").
        String input = keyboard.nextLine();

        // This splits up the string every at every space and stores these
        // values in an array called numbersStr. (e.g. if the input variable is
        // "1 2 3", numbersStr would be {"1", "2", "3"} )
        String[] numbersStr = input.split(" ");

        // This makes an int[] array the same length as our string array
        // called numbers. This is how we will store each number as an integer
        // instead of a string when we have the values.
        int[] numbers = new int[numbersStr.length];

        // Starts a for loop which iterates through the whole array of the
        // numbers as strings.
        for (int i = 0; i < numbersStr.length; i++) {
            // Turns every value in the numbersStr array into an integer
            // and puts it into the numbers array.
            numbers[i] = Integer.parseInt(numbersStr[i]);
            // OPTIONAL: Prints out each value in the numbers array.
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }
}
