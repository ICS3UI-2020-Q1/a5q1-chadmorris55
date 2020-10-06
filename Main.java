import java.util.Scanner;
/**
 * prints out a multiplication table for a number
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // asks user for numeber and stores it 
    System.out.println("Please enter an integer to create a multiplication table for");
    int number = input.nextInt();
    //while the count is below 12, it'll print out whatever the inputted number is, multiplied by whatever the count is (1-12)
    for (int count = 1; count <= 12; count++){
      int product = count * number;
      System.out.println(count + " x " + number + " = " + product);
    }
  }
}
