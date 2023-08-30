package beginner.chapter2;

public class Magic {
    public static void main(String[] args) {
        int myNumber = 23;
    /*
    We will refer to myNumber as the original number from now on -
    it might be helpful to document this.
    */
        // int stepOne = myNumber * myNumber;
        // int stepTwo = stepOne + myNumber;
        // int stepThree = stepTwo / myNumber;
        // int stepFour = stepThree + 17;
        // int stepFive = stepFour - myNumber;
        // int stepSix =  stepFive / 6;
        // System.out.println(stepSix);
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        System.out.println(magicNumber);

    }
}
