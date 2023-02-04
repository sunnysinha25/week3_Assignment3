package week3_Assignment3.fi;

@FunctionalInterface
public interface Calc 
{
	
	//Abstract methood
	abstract int cube(int value);
    
	//Default method
    default int square(int value)
    {
        return (value*value);
    }
    
    //Default method
    default int add(int a, int b)
    {
        return (a+b);
    }
    
    //Static method
    static int sub(int a, int b) 
    {
        return (a-b);
    }
    
    //Static method
    static int mul(int a, int b) 
    {
        return (a*b);
    }
    
    //Static method
    static int div(int a, int b) 
    {
        return (a/b);
    }
}
