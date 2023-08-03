package day04;

// 2차원 배열에 값을 넣어서 출력해주세요.

public class ArrayTest2 {

	public static void main(String[] args) {
		int n = 4;
	    // 배열의 값 입력
	    // 아래처럼 선언과 동시에 초기화하면 안됩니다. 직접 순번(index)를 선택해서 넣어주세요.
	    // int[][] arr = {
	    //   {1,2,3,4},
	    //   {5,6,7,8},
	    //   {9,10,11,12},
	    //   {13,14,15,16},
	    // }

	    /*
	      1 2 3 4
	      5 6 7 8
	      9 10 11 12
	      13 14 15 16

	    */
		
	    int[][] arr = new int[n][n];

	    int num = 1;
	    for(int row = 0; row < n; row++) {
	      for(int col = 0; col < n; col++) {
	        arr[row][col] = num;
	        num++;
	      }
	    }
	    
	    for(int row = 0; row < n; row++) {
	      for(int col = 0; col < n; col++) {
	        System.out.print(arr[row][col] + " ");
	      }
	      System.out.println();
	    }

	  }
	}