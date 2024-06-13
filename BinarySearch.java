import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
class Outer{

	class Inner{

		public void takeInput(int arr[],Scanner sc){

			for (int i = 0 ;  i < arr.length; ++i) {
				
				arr[i] = sc.nextInt();
			}
		}

		public void printArray(int arr[]){

			for (int item : arr) {
				System.out.print(item+" ");
			}
		}

		public int binarySearch(int arr[],int target){

			int start = 0, end = arr.length - 1, mid = -1;

			while (start <= end) {

				 mid = (start + end) / 2;

				 if(arr[mid] == target){

				 	return mid;

				 }else if(arr[mid] < target){

				 	start = mid + 1;

				 }else{

				 	end = mid - 1;
				 }
			}

			return -1;
		}
	}
}
public class BinarySearch{

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();

			int arr[] = new int[size];

			Outer outer = new Outer();
			Outer.Inner inner = outer.new Inner();

			System.out.println("\nEnter the array elements : ");
			inner.takeInput(arr,sc);

			//Array must be sorted to perform binary search.
			Arrays.sort(arr); 

			System.out.println("\nResulted array after sorting : ");
			inner.printArray(arr);

			System.out.print("\nEnter the target element need to search : ");
			int target = sc.nextInt();

			int index = inner.binarySearch(arr,target);

			if(index != -1){
				System.out.println("\n"+target+" -> element present at : "+index+" index.");
			}else {
				System.out.println("\n"+target+" -> element not found!!");
			}

		}catch (InputMismatchException e) {
			System.out.println("\nInputMismatchException Occured :: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("\nException Ocuured :: "+e.getMessage());
		}
	}
}