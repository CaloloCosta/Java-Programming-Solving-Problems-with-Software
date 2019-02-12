
/**
 * Write a description of part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
        int startIndex = dna.indexOf(startCodon);
        String result = "";
        if(startIndex == -1)
            return "";
        int endIndex = dna.indexOf(stopCodon,startIndex+3);
        if(endIndex == -1)
            return "";
        if((endIndex - startIndex)%3 == 0){
            if(startCodon.compareTo("ATG") ==0)
                result = dna.substring(startIndex,endIndex+3).toUpperCase();
            else if(startCodon.compareTo("atg") == 0)
                result = dna.substring(startIndex,endIndex+3).toLowerCase();
        }
               
        return result;
    }
    
    public void testSimpleGene(){
        System.out.println("\ndna: ATGGGTTAAGTC");
        System.out.println("gene is: "+findSimpleGene("ATGGGTTAAGTC","ATG","TAA"));
        System.out.println("\ndna: gatgctataat");
        System.out.println("gene is: "+findSimpleGene("gatgctataat","atg","taa"));
       
       
    }
    public static void main(String[] args){
        part2 p = new part2();
        p.testSimpleGene();
        
    }

}
