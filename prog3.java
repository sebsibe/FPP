package W1L2_HOMEWORK_ASSIGNMENT;

public class prog3 {

	public static void main(String[] args) {
		String[] duplicateArray = {"horse"};
		RemoveDups(duplicateArray);

	}
	public static void RemoveDups(String[] strArray) {
		if(strArray == null || strArray.length == 0) {
			System.out.println("operation not allowed");
			return;
		}
		if(strArray.length == 1) {
			System.out.println(strArray[0]);
			return;
		}
		
		
		int nonDupArrayLength = 1; //Minimum number of non duplicate array
		String[] intialNonDupArray = new String[strArray.length];
		intialNonDupArray[0] = strArray[0]; //first element of both(i.e. original and non-duplicate) arrays are equal
		for(int i = 1 ; i<strArray.length; i++) {
			boolean duplicatElementFound = false;
			int k = 0;
			while(k<i) {
				if(intialNonDupArray[k] == strArray[i]) {
					duplicatElementFound = true;
					break;
				}
				else {
					k++;
					}
		
			}	
			if(!duplicatElementFound) {
				
				intialNonDupArray[k] = strArray[i];
				nonDupArrayLength++;
				k=0;
			}
			
		}
		String[] finalNonDupArray = new String[nonDupArrayLength];
		
		for(int i=0;i<finalNonDupArray.length;i++) {
			finalNonDupArray[i]=intialNonDupArray[i];
			System.out.print(finalNonDupArray[i] + ",");
		}
		
	}
}
