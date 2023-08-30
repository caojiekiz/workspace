package beginner.chapter4.section1;

import java.util.Arrays;

public class Newsfeed04 {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    public Newsfeed04(){
        // Initialize favoriteArticles here:
        favoriteArticles = new String[10];
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle){
        // Add newArticle to favoriteArticles:
        favoriteArticles[favoriteIndex] = newArticle;

    }

    public static void main(String[] args){
        Newsfeed04 sampleFeed = new Newsfeed04();

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}

