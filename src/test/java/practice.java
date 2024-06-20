import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {9,7,5,4};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j]) {
					
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					//A[j+1]=tempa
				}
				
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(i==3)
			{
				System.out.println("4th Maximum "+a[i]);
			}
		}
	}

}
