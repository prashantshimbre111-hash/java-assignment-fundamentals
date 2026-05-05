package ParameterizedconstructorQues1;

//1. Create a class -> Animal.java -> create a void method in it as printName() -> syso ("LION").
//2. create a class -> AnimalKingdom.java -> create a constructor -> in constructor create a object of animal class and call printName() method.
//3. create Test.java -> and create a object of AnimalKingdom class.
//
//Target usnderstanding -> Test class will trigger constructor of AnimalKingdom.java and then constructor will trigger method of Animal.java


public class Test {
	public static void main(String[] args) {
		AnimalKingdom Animal = new AnimalKingdom();
		
	}

}
