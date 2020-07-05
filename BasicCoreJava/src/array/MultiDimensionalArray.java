package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		String[][] data= new String[4][2];
		//Row1
		data[0][0]="user1";
		data[0][1]="Password1";
		//Row2
		data[1][0]="user2";
		data[1][1]="Password2";
		//Row3
		data[2][0]="user3";
		data[2][1]="Password3";
		//Row4
		data[3][0]="user4";
		data[3][1]="Password4";
		
		for(int r=0; r<data.length; r++)
		{
			for(int c=0; c<data[r].length;c++)
			{
				System.out.print(data[r][c]+" ");
			}
			System.out.println();
		}
	}

}
