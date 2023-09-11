import javax.swing.*;
public class NumberGame{
    public static void main(String[] args) {
        int SystemNum = (int) (Math.random()*100 + 1);
        int userAns = 0;
        System.out.println("The correct guess would be " + SystemNum);
         int count = 1;
 
        while (userAns != SystemNum)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAns = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAns, SystemNum, count));
            count++;
        }  
    }
 
    public static String determineGuess(int userAns, int SystemNum, int count){
        if (userAns <=0 || userAns >100) {
            return "Your guess is invalid";
        }
        else if (userAns == SystemNum ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAns > SystemNum) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAns < SystemNum) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    } 
}
