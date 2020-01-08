package Practice;

public class InsertElementInArray {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4 };

		int n = array.length;
		
		System.out.println("******Initial Array****************");
		for (int i = 0; i < n; i++) {
			System.err.println(" " + array[i]);
		}

		int newArray[] = new int[n + 1];

		int x = 5;
		int pos = 3;

		for (int i = 0; i < n + 1; i++) {

			// insert all elements till pos

			if (i < pos) {
				newArray[i] = array[i];
			}

			// then insert x at pos
			else if (i == pos) {
				newArray[i] = x;
			}

			// then insert rest of the elements
			else {
				newArray[i] = array[i - 1];
			}
		}
		
		
		System.out.println("******New Array****************");
		
		for (int i = 0; i < newArray.length; i++) {
			
			System.out.println(" " + newArray[i]);
		}
	}

}


/*
1	.First get the element to be inserted, say x
2.	Then get the position at which this element is to be inserted, say pos
3.	Create a new array with the size one greater than the previous size
4.	Copy all the elements from previous array into the new array till the position pos
5.	Insert the element x at position pos
6.	Insert the rest of the elements from the previous array into the new array after the pos
*/
