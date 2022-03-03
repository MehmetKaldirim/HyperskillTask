package comparableIntro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    /*
    // char squence
     @Override
    public int compareTo(Article otherArticle) {
        return size > otherArticle.size ? 1 : size < otherArticle.size ? -1 : CharSequence.
                compare(title, otherArticle.title);
    }

    // this is the easiest way compare all as a string
    @Override
    public int compareTo(Article otherArticle) {
        int val = Integer.valueOf(getSize()).compareTo(otherArticle.getSize());

        if(val == 0){
            return getTitle().compareTo(otherArticle.getTitle());
        }
        return val;
    }
    */

    /*@Override
    public int compareTo(Article otherArticle) {
        // add your code here!
        return this.getSize() < otherArticle.getSize() ?
                -1 : this.getSize() > otherArticle.getSize() ? 1 : getTitle().compareTo(otherArticle.getTitle());
    }*/


    @Override
    public int compareTo(Article otherArticle) {
        // add your code here!
        int result;
        if (getSize() < otherArticle.getSize()) {
            result = -1;
        } else if (getSize() == otherArticle.getSize())  {
            if (getTitle().compareTo(otherArticle.getTitle()) < 0)   {
                result = -1;
            } else {
                result = 1;
            }

        } else {
            result = 1;
        }
        return result;
    }


    @Override
    public String toString() {

        return "{ Article Title= " + title  + " Article size= " + size + "}";
    }

    // getters, setters, hashCode and toString

    public static void main(String[] args) {

        Article a = new Article("How to bake an awesome cake?",300);
        Article b = new Article("Alice likes pancakes...But who doesn't?",800);
        Article c = new Article("Halamın tasakları olsa ",800);
        Article d = new Article("Trabzon ancak sampiyon olurdu",200);

        List<Article> article = new ArrayList<>();

        article.add(a);
        article.add(b);
        article.add(c);
        article.add(d);

        Collections.sort(article);
        System.out.println(article.toString());
    }
}
