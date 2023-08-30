package beginner.chapter4.section3;

import java.util.ArrayList;

public class MainActivity {

    // TODO #1: add integer member variables here
    int currentQuestionIndex;
    int totalCorrect;
    int totalQuestions;

    // TODO #2: add ArrayList member variable here
    ArrayList<Question> questions = new ArrayList<Question>();

    // TODO #3 add startNewGame() here
    public void startNewGame() {
        // == Question 1 ==
// imageIdentifier: 921238
// questionString: "How tall is the Eiffel tower?"
// answerZero: "1024 ft"
// answerOne: "1063 ft"
// answerTwo: "1124 ft"
// answerThree: "1163 ft"
// correctAnswerIndex: 1

// == Question 2 ==

// imageIdentifier: 107343
// questionString: "Who invented the computer algorithm?"
// answerZero: "Charles Babbage"
// answerOne: "John Carmack"
// answerTwo: "Alan Turing"
// answerThree: "Ada Lovelace"
// correctAnswerIndex: 3


        Question question1 = new Question(921238, "How tall is the Eiffel tower?", "1024 ft", "1063 ft", "1124 ft", "1163 ft", 1);
        Question question2 = new Question(107343, "Who invented the computer algorithm?", "Charles Babbage", "John Carmack", "Alan Turing", "Ada Lovelace", 3);
        Question question3 = new Question(748294, "What is the name for the patch of skin found on your elbow?", "Elbow Skin", "Fascia Elbora", "Wenis", "Todd", 2);

        //ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        //System.out.println(questions.size());
        totalQuestions = questions.size();
        totalCorrect = 0;
        Question firstQuestion = chooseNewQuestion();
        // displayQuestion(question1);
        // displayQuestionsRemaining(questions.size());
    }


    // TODO #4 add chooseNewQuestion() here

    public Question chooseNewQuestion() {
        //只有3个问题
        int randomNum = generateRandomNumber(questions.size()-1);
        //System.out.println(questions.size());
        currentQuestionIndex = randomNum;
        return questions.get(currentQuestionIndex);
    }

    // TODO #5 add getCurrentQuestion() here
    public Question getCurrentQuestion() {
        return questions.get(currentQuestionIndex);
    }

    // TODO #6 add onAnswerSubmission() here
    public void onAnswerSubmission() {
        Question currQuestion = getCurrentQuestion();
        if (currQuestion.isCorrect()) {
            totalCorrect += 1;
            questions.remove(currQuestion);
            //displayQuestionsRemaining(questions.size());
        }
        if (questions.size() == 0) {
            System.out.println("game over");
            startNewGame();
        }
    }

    //random fun
    int generateRandomNumber(int max) {
        double randomNumber = Math.random();
        double result = max * randomNumber;
        return (int) result;
    }

    String getGameOverMessage(int totalCorrect, int totalQuestions) {
        if (totalCorrect == totalQuestions) {
            return "You got all " + totalQuestions + " right! You won!";
        } else {
            return "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next time!";
        }
    }
}