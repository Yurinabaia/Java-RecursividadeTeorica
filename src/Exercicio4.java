
public class Exercicio4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] vetor = new int[5]; 
		{
			vetor[0] = 12;
			vetor[1] = 21;
			vetor[2] = 9;
			vetor[3] = 3;
			vetor[4] = 8;
		}
		int[] vetVal = new int[vetor.length];
		int tmg = vetor.length -1;
		ImprimirVetor(vetor, vetVal, tmg);
		for (int i = 0; i < vetVal.length; i++)
		{
			System.out.println("Vetor[" + i + "] = " + vetVal[i]);
		}
		
		System.out.println("\n--------------------------------");
		ImprimirVetorContrario(vetor, vetVal, tmg,0);
		System.out.println("Vetor ao contrario");

		for (int i = 0; i < vetVal.length; i++)
		{
			System.out.println("Vetor[" + i + "] = " + vetVal[i]);
		}
		System.out.println("\n--------------------------------");
		System.out.println("Soma do vetor");

		for (int i = 0; i < vetVal.length; i++)
		{
			System.out.println("Vetor[" + i + "] = " +SomaVetor(vetor,i,0));
		}
	}
	public static int ImprimirVetor(int[] vet, int [] vetValores, int n) 
	{
		if(n == 0) 
		{
			vetValores[n] = vet[n];
			return vetValores[n];
		}
		else 
		{
			vetValores[n] = vet[n];
			return ImprimirVetor(vet, vetValores,n -1);
		}
	}
	public static int ImprimirVetorContrario(int[] vet, int [] vetContrario, int n, int i) 
	{
		if(n ==0) 
		{
			vetContrario[i] = vet[n];
			return vetContrario[n];
		}
		else 
		{
			vetContrario[i] = vet[n];
			return ImprimirVetorContrario(vet,vetContrario, n -1, i +1);
		}
	}
	public static int SomaVetor(int[] vet, int n, int soma) 
	{
		if(n ==0) 
		{
			soma = soma + vet[n];
			return soma;
		}
		else 
		{
			if(n == vet.length -1) 
			{
				soma = vet[n];
			}
			else
			soma = soma + vet[n];
			return SomaVetor(vet, n - 1, soma);
		}
	}
}
