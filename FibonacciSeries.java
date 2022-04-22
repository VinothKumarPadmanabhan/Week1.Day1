
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0;
		int secondNum=1;
		int range=5;
		int sum=0;
		for(int i=0;i<range;i++)
		{
			//System.out.println("counter i "+i);
			System.out.println("fibonacci series--"+sum);
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			//System.out.println();
		}
	}

}
