package coreJavapractice;

public class copyToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  arr1[] = new int[] { 2, 8, 5, 6, 7 };
		int arr2[] = new int[arr1.length];
		int i = 0;

		for (i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("Elements or first array:");
		for (i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();  
		
		System.out.println("Elements of new array: ");
		for (i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}    
	
}


