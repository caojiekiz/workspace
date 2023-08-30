package beginner.chapter3.section2;

public class AndroidOS {
    public AndroidOS() {
        System.out.println("AndroidOS Booting Up...");
    }

    public void runQuizApp() {
        // Create three questions here
// == Question 1 ==

// imageIdentifier: 921238
// questionString: "How tall is the Eiffel tower?"
// answerZero: "1024 ft"
// answerOne: "1063 ft"
// answerTwo: "1124 ft"
// answerThree: "1163 ft"
// correctAnswerIndex: 1
        Question question1 = new Question(921238,"How tall is the Eiffel tower?","1024 ft",
                "1063 ft","1124 ft","1163 ft",1);
        System.out.println("Question 1: " + question1.questionText);
        System.out.println("answer1: " + question1.answer0);
        System.out.println("answer2: " + question1.answer1);
        System.out.println("answer3: " + question1.answer2);
        System.out.println("answer4: " + question1.answer3);
        System.out.println("Question 1 Correct Answer: " + question1.correctAnswer);
        //System.out.println("Question 2, answer0: " + question2.answer0);
        // System.out.println("Question 3, answer3: " + question2.answer3);
        // question1.toString();
    }

    public static void main(String[] args) {
        System.out.println("Starting: AndroidOS");
        AndroidOS androidOS = new AndroidOS();
        androidOS.runQuizApp();

    }
}