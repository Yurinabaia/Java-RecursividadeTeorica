
public class Exercicio1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Resultado: " +Mult(5,77));
	}
	public static int Mult(int num1, int mult) 
	{
		if(mult == 0) 
		{
			return 0;
		}
		else 
		{
			return num1 + Mult(num1, mult - 1);
		}
	}
}
