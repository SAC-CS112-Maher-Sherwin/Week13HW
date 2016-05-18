package cloneandequals;

public class ThreeDice {
    private Dice D1;
    private Dice D2; 
    private Dice D3;
    
    public int Throw(){
        int roll;
        roll = (D1.Throw(1) + D2.Throw(1) + D3.Throw(1))/3;
        return roll;
    }
}