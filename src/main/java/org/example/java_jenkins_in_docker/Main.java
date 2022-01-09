package org.example.java_jenkins_in_docker;

public class Main {

	public static boolean checkifInputIsEvenNumber(int number) 
	{
		return number%2==0;
		
	}
	public static void main(String[] args) 
	{
		System.out.println(checkifInputIsEvenNumber(122));

	}

}
