
public class Exercicio2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Resultado: "+ Div(25,2,0));

	}
	public static int Div(int num1,int num2, int divi) 
	{
		if(num2 > num1) 
		{
			return divi;
		}
		else 
		{
			return Div(num1 - num2,num2, divi +1);
		}
	}
}
