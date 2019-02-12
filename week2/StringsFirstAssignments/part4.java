
/**
 * Write a description of part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class part4 {
    public void readUrl(String link){
        String string = "youtube.com";
        int beginningUrl, endUrl;
        URLResource url = new URLResource(link);
        for(String w : url.words()){
           // check if youtube.com is in the word
           if(w.indexOf(string) > -1 || w.indexOf(string.toUpperCase()) > -1){
               // finding the double quotes
               beginningUrl  = w.indexOf("\"");
               endUrl = w.lastIndexOf("\"");
               System.out.println(w.substring(beginningUrl+1,endUrl));          
               
            }
        }    
    }
    public static void main(String[] args){
        part4 p = new part4();
        p.readUrl("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
    }

}
