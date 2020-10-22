package practice_Exercises;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row=1; row<=3; row++) {
			for (int t1=2;t1>=row;t1--)
			{
				System.out.print(" ");
			}
			for(int t2=1;t2<=row; t2++)
			{
				System.out.print(t2);
			}
			for (int t3=row; t3>1; t3--)
			{
				System.out.print(t3-1);
			}
			System.out.println();
		}
		
	}

}
