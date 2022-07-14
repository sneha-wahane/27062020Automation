package array;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		String[][] data=new String[4][2];
		data[0][0]="sneha";
		data[0][1]="wahane";
		data[1][0]="sneha";
		data[1][1]="wahane";
		data[2][0]="sneha";
		data[2][1]="wahane";
		data[3][0]="sneha";
		data[3][1]="wahane";
		for(int r=0;r<data.length;r++)
		{
			for(int c=0;c<data[r].length;c++)
			{
				System.out.print(data[r][c]+" ");
			}
			System.out.println();
		}
				
	}

}
