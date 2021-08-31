package W1L2_HOMEWORK_ASSIGNMENT;

public class prog5 {

	public static void main(String[] args) {
		int[] a = {5,6,-4,3,1};
		int[] b = { 3,8,9,11};
        int[] resultArray = combine( a, b);
        for(int i=0;i<resultArray.length;i++) {
        	System.out.print(resultArray[i] + " ");
        }
	}
	public static int[] combine(int[] a, int[] b) {
		int[] combinedArray = new int[a.length + b.length];
		System.arraycopy(a, 0, combinedArray, 0, a.length);
		System.arraycopy(a, 0, combinedArray, 0, a.length);
		System.arraycopy(b, 0, combinedArray, a.length, b.length);
		return combinedArray;
	}
}
