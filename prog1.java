package W1L2_HOMEWORK_ASSIGNMENT;

import lesson2.random.RandomNumbers;

public class prog1 {

	public static void main(String[] args)
	{
    int x = RandomNumbers.getRandomInt(1,9);
	System.out.println("random number x in the range 1 .. 9 is: "+ x);
	double poweredNumber = Math.pow(Math.PI,x);
	System.out.println("πx is " + poweredNumber);
	int y = RandomNumbers.getRandomInt(3,14);
	System.out.println("random number y in the range 3 .. 14 is: "+ y);
	poweredNumber = Math.pow(y,Math.PI);
	System.out.println("yπ is " + poweredNumber );
	}

}
