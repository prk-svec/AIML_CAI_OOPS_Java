//Develop a JAVA program to search for an element 
//in a given list 
//of elements using binary search mechanism.
public class BinarySearch {
	public static void main(String[] args) {

		int first,middle,last,search;
		int arr[] = {11,22,33,44,66,77};
		
		search = 22;
		int n = arr.length-1;
		first = 0;
		last = n;
		middle = (first+last)/2;
		
		while(first <= last)
		{
			if(arr[middle] < search)
			{
				first = middle+1;
			}
			else if(arr[middle] == search)
			{
			System.out.println(" Element Found At Position:-- "+middle);
				break;				
			}
			else
			{
				last = middle-1;
			}
			
			middle = (first+last)/2;
		}
		if (first > last)
			System.out.println(" Element is not found");		
	}
}
