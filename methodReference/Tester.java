/*
Question 2:
Create constructor(2 parameters) method reference for Person Class 
*/

package week3_Assignment3.methodReference;

@FunctionalInterface
interface MyInterface{
    Person getPerson(String Name , int age);
}

public class Tester {

	public static void main(String[] args) {
		
		MyInterface obj = Person :: new;
        
        System.out.println("PERSON NAME: " +obj.getPerson("SUNNY SINHA", 22).getName());
        System.out.println("PERSON AGE: "+ obj.getPerson("SUNNY SINHA", 22).getAge());

	}

}

/*
EXPECTED INPUT/OUTPUT
PERSON NAME: SUNNY SINHA
PERSON AGE: 22
*/
