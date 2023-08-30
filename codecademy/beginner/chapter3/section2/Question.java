package beginner.chapter3.section2;

// Define your Question class here:
public class Question {
    int correctAnswer;
    int playerAnswer = 2;
    int imageId;
    String questionText;
    String answer0;
    String answer1;
    String answer2;
    String answer3;
    public Question(int imageIdentifier,String questionString,String answerZer,String answerOne,String answerTwo,String answerThree,int correctAnswerIndex) {
        correctAnswer = correctAnswerIndex;
        //this.playerAnswer = playerAnswer;
        imageId = imageIdentifier;
        questionText = questionString;
        answer0 = answerZer;
        answer1 = answerOne;
        answer2 = answerTwo;
        answer3 = answerThree;
    }
    // public String toString() {
    //   return "\n" + imageId +
    //          "\n" + questionText +
    //          "\n" + answer0 +
    //          "\n" + answer1 +
    //          "\n" + answer2 +
    //          "\n" + answer3;
    // }
}