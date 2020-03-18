
public class Exercicio5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub, 
		System.out.print("Valores " + CosenoRadiano(0, 0, 12,0));
	}
	public static double CosenoRadiano(int n, int cont,int fim, double resul) 
	{
		double fat = fatorial(n);
		if(n > fim) 
		{
			return resul;
		}
		else 
		{
			if(cont%2 == 0) 
			{
				resul = resul + 1/fat;
				return CosenoRadiano(n + 2, cont +1, fim, resul);
			}
			else 
			{
				resul = resul - 1/fat;
				return CosenoRadiano(n + 2, cont +1, fim, resul);
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
