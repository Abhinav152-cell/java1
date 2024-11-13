package scanner;

public class ArrayPrintEvenElements {

	
		public static void main(String args[]){

			int arr[] = {1,2,3,4,7,6};
		 printEvenElements(arr);
			
		}
		static void printEvenElements(int arr[]) {
			for(int i =0; i<arr.length; i++) {
				if (arr[i]%2==0) {
				System.out.println(arr[i]);}
			}
		}
}
