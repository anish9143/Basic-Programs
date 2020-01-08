package Practice;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
		int array[]= {8,2,11,98,7,0};
		
		int length = array.length;
		System.out.println("length of array is :"+length);
		
		for (int i = 0; i < length; i++) {
			
			
				for (int j = 0; j < length-1; j++) {
					
					
					// Ascending Order
					if (array[j] > array[j+1]) {
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
						
					}
					
				}
			
			
		}
		
		for (int i = 0; i < length; i++) {
			System.out.print(" "+array[i]);
		}
		
		
	}

}
