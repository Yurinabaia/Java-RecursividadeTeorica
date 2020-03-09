
public class Exercicio3 {

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
		int x = 12;
		for (int i = 0; i < x; i++) {
			int tmg = vetor.length - 1;
			System.out.println("O valor "+ (i + 1) +" no vetor deu "  + PesquisarVetor(vetor, i, tmg));
		}

		
	}
	public static boolean PesquisarVetor(int[] vet, int x, int tamanho) 
	{
		if(vet[tamanho] == x ) 
		{
			return true;
		}
		else if(tamanho <=0 ) 
		{
			return false;
		}
		else 
		{
			return PesquisarVetor(vet, x, tamanho -1);
		}
	}
}
