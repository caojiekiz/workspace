package beginner.chapter4.section1;

public class Newsfeed05 {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public Newsfeed05(){

    }

    public String[] getTopics(){
        return topics;
    }

    public int getNumTopics(){
        return topics.length;
    }

    public static void main(String[] args){
        Newsfeed05 sampleFeed = new Newsfeed05();

        System.out.println("The number of topics is "+ sampleFeed.getNumTopics());

    }
}

