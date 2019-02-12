public class part1 {
    // finds the gene
    public String findSimpleGene(String dna){
        int startIndex = dna.indexOf("ATG");
        String result = "";
        if(startIndex == -1)
            return "";
        int endIndex = dna.indexOf("TAA",startIndex+3);
        if(endIndex == -1)
            return "";
        if((endIndex - startIndex)%3 == 0)
            result = dna.substring(startIndex,endIndex+3);     
        return result;
    }
    
    public void testSimpleGene(){
        System.out.println("\ndna: AAATGCCCTAACTAGATTAAGAAACC");
        System.out.println("gene is: "+findSimpleGene("AAATGCCCTAACTAGATTAAGAAACC"));
        System.out.println("\ndna: GGATGAAATGGGTAAHHH");
        System.out.println("gene is: "+findSimpleGene("GGATGAAATGGGTAAHHH"));
        System.out.println("\ndna: GGATGAAATGGGTHHH");
        System.out.println("gene is: "+findSimpleGene("GGATGAAATGGGTHHH"));
        System.out.println("\ndna: GGATGAAATGGGTHHHAGDTAA");
        System.out.println("gene is: "+findSimpleGene("GGATGAAATGGGTHHHAGDTAA"));
        
    }
    
    public static void main(String[] args){
        part1 dnaCheck = new part1();
        dnaCheck.testSimpleGene();
    
    }

}
