
public class Exercicio5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Valores " + CosenoRadiano(5));
	}
	public static double CosenoRadiano(int n) 
	{
		if(n ==0) 
		{
			return n;
		}
		else 
		{
			int fat = fatorial(n);
			System.out.print(fat);
			if(n%2 == 0) 
			{
				return 1/fat - CosenoRadiano(n -1);
			}
			else 
			{
				return 1/fat + CosenoRadiano(n - 1);
			}
		}
	}
	public static int fatorial(int n) 
	{
			 if (n==0) 
			 {
				 return 1;
			 }
			 else
			 return (n * fatorial(n-1));
			 
	}
}
