package core;

public class Prog_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1=2, c1=3;
		int r2=3, c2=2;
		
		int[][] arr1 = {{3, -2, 5}, {3, 0, 4}};
		int[][] arr2 = { {2, 3}, {-9, 0}, {0, 4}};
		
		int[][] prod = new int[r1][c2];
		
		for(int i=0; i<r1; i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0; k< c1; k++) {
					prod[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		System.out.println("Matrix multiplication is shown below:");
		for (int[] row:prod) {
			for(int col:row) {
				System.out.print(col+ " ");
			}
			System.out.println();
		}
	}

}
