package cloneandequals;

public class CloneAndEquals {

 public static void main(String[] args) throws CloneNotSupportedException {
        
        TripleDice test = new TripleDice();
        TripleDice testClone = (TripleDice) test.clone();
        System.out.println("Average of three dice using TripleDice is: " + test.Throw());
        
        Dice test2 = new Dice();
        System.out.println("Average of three dice using TripleDice's clone is: " + testClone.Throw());
        System.out.print("\n");
        
        // Testing the rules of a true clone
        
        System.out.println("test != testClone is " + (test != testClone)); 
            // should return "true"
            
        System.out.println("test.getClass() == testClone.getClass() is " 
                + (test.getClass() == testClone.getClass()));  
            //should return true
            
        System.out.println("test.equals(testClone) is " + (test.equals(testClone)));
            /* I believe this is false since the three dice
             will differ depending on what is rolled in each case */   
    }
    
}
