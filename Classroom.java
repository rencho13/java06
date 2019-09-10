package fr.wildcodeschool.idetest.java6;

public class Classroom {

	public static void main(String[] args) {
		
		Wilder stephan = new Wilder("Stéphan", true);
		System.out.println(stephan.whoAmI());
		
		Wilder franck = new Wilder("Franck", false);
		System.out.println(franck.whoAmI());
		
		
	}

}
