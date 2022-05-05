import java.util.*;

class InsertionSort{
	
	public static void insertionSort(int[] arr){
		for (int i = 0; i < arr.length; i++){
			int temp = arr[i];
			int j;
			for (j = i - 1; j >=0 && arr[j] > temp; j--){
				arr[j+1] = arr[j];
			}
			System.out.println(Arrays.toString(arr));
			arr[j + 1] = temp;
			
		}
		
	}
	
	/*
	public static void insertionSort1(int[] arr){
		for (int i = arr.length - 1; i >= 0; i--){
			int temp = arr[i];
			// System.out.println("Temp:"+temp);
			for (int j = i - 1; j >= 0; j--){
				// System.out.println("arr[j]"+arr[j]);
				if (arr[j] > temp){
					arr[i] = arr[j];
					System.out.println(Arrays.toString(arr));
				} else {
					continue;
				}
			}
		}
	}
	*/
	
}

public class Question1{
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array element: ");
		for (int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Input: "+Arrays.toString(arr));
		InsertionSort.insertionSort(arr);
		System.out.println("Output: "+Arrays.toString(arr));
		
		
	}
}



/*
int[] arr = {2, 4, 6, 8, 3};
int[] arr = {1, 2, 4, 5, 3};
System.out.println("Input: "+Arrays.toString(arr));
InsertionSort.insertionSort(arr);
*/		
		
	/*
	public static void insertionSort(int[] arr){
		for (int i = arr.length - 1; i >= 0; i--){
			int temp = arr[i];
			int j;
			for (j = i - 1; j >=0 && arr[j] > temp; j--){
				arr[j+1] = arr[j];
			}
			System.out.println(Arrays.toString(arr));
			arr[j + 1] = temp;
			// System.out.println(Arrays.toString(arr));
		}
	}
	*/
	
	/*
	public static void insertionSort(int[] arr){
		for (int i = arr.length - 1; i >= 0; i--){
			// System.out.print(arr[i]+" ");
			int temp = arr[i];
			int j;
			for (j = i - 1; j >=0; j--){
				if (arr[j] < temp){
					arr[j] = temp;
					//System.out.println(arr[j] + " "+ j);
					//System.out.println(arr[i] + " "+ i);
				}
				System.out.println(Arrays.toString(arr));
			}
			
			// arr[j + 1] = temp;
			//System.out.println(Arrays.toString(arr));
		}
	}
	*/
	
	/*
	int[] arr = {2, 4, 6, 8, 3};
	System.out.println("Input: "+Arrays.toString(arr));
	InsertionSort.insertionSort1(arr);
	System.out.println("Output: "+Arrays.toString(arr));
	*/