package beginner.chapter4.section1;

//import the Arrays package here:
import java.util.Arrays;
public class Newsfeed02 {


    public Newsfeed02(){

    }

    public String[] getTopics(){
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }


    public static void main(String[] args){
        Newsfeed02 sampleFeed = new Newsfeed02();
        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);
        System.out.println(Arrays.toString(topics));
    }
}

