package beginner.chapter3.section4;

public class MainActivity {

    // Add generateRandomNumber() here
    public int generateRandomNumber(int max) {
        int  randomNumber = (int)Math.random() * max;
        return randomNumber;
    }
    // Add getGameOverMessage() here
    public String getGameOverMessage(int totalCorrect, int totalQuestion) {
        if(totalCorrect == totalQuestion) {
            String str1 = "You got all 6 right! You won!";
            return str1;
        } else {
            String str2 = "You got 3 right out of 6. Better luck next time!";
            return str2;
        }

    }


}
