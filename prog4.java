package W1L2_HOMEWORK_ASSIGNMENT;

public class prog4 {

	public static void main(String[] args) {
	if(args.length == 0 || args == null)
	   {
		System.out.print("No arguement passed!");
		return;
	   }
	   int[] lengthOfEachString = new int[args.length];
		int countOfStrStartingWithA = 0;
		for(int i=0;i<args.length;i++)
		{
			lengthOfEachString[i] = args[i].length();
			
			if(args[i].startsWith("A"))
			{
				countOfStrStartingWithA++;
					
			}
		
		}
		System.out.println("Count of string inputs starting with 'A' is: " + countOfStrStartingWithA);
		System.out.print("The length of each string input is ");
		for(int len:lengthOfEachString) {
			System.out.print(len + " ");
		}
		
	}
	}


