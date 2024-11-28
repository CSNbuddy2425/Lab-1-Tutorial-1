package intermediate;

public class L1Q3 {

    public static void main(String[] args) {
        System.out.println("Square:");
        
        int squareSize = 9;
        
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                if (i==0 ||i==squareSize-1|| j==0 ||j==squareSize-1){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
           
        }
        
        //Oval
        System.out.println("\nOval:");
        
        int ovalSize=9;
        
        for(int i=0; i <ovalSize; i++){
            if (i==0 || i==ovalSize-1){
                System.out.println("   ***   ");
            }
            else if (i==1 || i==ovalSize-2){
                System.out.println(" *     *  ");
            }
            else{
                System.out.println("*       * ");
            }
        }
        
        //Arrow
        System.out.println("\nArrow:");
        
        int arrowSize=7;
        
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        for(int i=0; i<arrowSize; i++){
            System.out.println("  *  ");
        }
        
        //Diamond
         System.out.println("\nDiamond:");
          int size = 5; 

        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
