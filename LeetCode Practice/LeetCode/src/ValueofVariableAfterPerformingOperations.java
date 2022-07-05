public class ValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
       String [] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));

    }
     public static int finalValueAfterOperations(String[] operations) {
         int ans = 0;
         for (int i = 0; i < operations.length ; i++) {

             if ( operations[i] == "++X" || operations[i] == "X++"){
                 ans+=1;
             }
             if ( operations[i] == "--X" || operations[i] == "X--"){
                 ans-=1;
             }
         } return ans;
     }

}