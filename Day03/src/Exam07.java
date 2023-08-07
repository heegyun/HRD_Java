
public class Exam07 {

	public static void main(String[] args) {
		
		int max = -1;
		int min = 100;
		
		int[] array = {1,5,3,8,2,10,30,20};
		
	
		for(int i =0 ;i<array.length;i++) {
			 max = Math.max(max, array[i]);

			
		}
		
		for(int i =0 ;i<array.length;i++) {
			min = Math.min(min, array[i]);
			
		}
	
		System.out.println("max: "  + max);
		System.out.println("min: "  + min);
		
				
	}

}
