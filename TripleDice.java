package cloneandequals;

public class TripleDice extends Dice implements Cloneable {
    
    @Override
    public int Throw () 
    {
        int roll = (super.Throw() + super.Throw() + super.Throw())/3;
        return roll;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
    return super.clone();
    }
    
}