package cloneandequals;

public class Dice {
    
    int sum = 0;
    
    public int Throw() {
        int roll = 1 + (int)(Math.random()*6);
        return roll;
    }
    
    public int Throw(int dice){
        for (int i = 0; i < dice; i++){
            
            int roll = 1 + (int) (Math.random() * 6);
            
            sum = sum + roll;
        }
        return sum;
    }
    
    public int Throw (int dice, int bounces){
        for (int i = 0; i < dice; i++){
            int roll = 0;
            
            while (bounces != 0) {
                roll = roll + (1 + (int) (Math.random() * 6));
                bounces--;
            }
            
            System.out.println("Roll: " + roll);
            
            sum = sum + roll;
        }
        return sum;
            
    }
}
