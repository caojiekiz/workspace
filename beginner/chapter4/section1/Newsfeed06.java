package beginner.chapter4.section1;

import java.util.Arrays;

public class Newsfeed06 {

    String[] topics;

    public Newsfeed06(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        Newsfeed06 feed;
        if (args[0].equals("Human")) {

            //topics for a Human feed:
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new Newsfeed06(humanTopics);

        } else if(args[0].equals("Robot")) {

            //topics for a Robot feed:
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new Newsfeed06(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new Newsfeed06(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}

