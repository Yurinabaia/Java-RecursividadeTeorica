import java.io.*;



public class Exercicio9 
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		
		/*//Caso queira digitar a palavra apage este comentario
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite seu nome");
		String Palavra = entrada.readLine().toUpperCase();//Aqui está convertendo a palavra para caixa alta
		
		*/
		//Observação: Estou convertendo a palavra YURITVWS tirei o U porque iria repetir mas pode colocar o U se quiser pois
		//Não irá fazer diferença alguma.
		
		
		
		int[] lista = new int[8];//O vetor que ira ser ordenado
		OrdemAlfabeticaemNumerosASCII("YURITVWX", lista);//Convertir a palavra em String para tabela ASCII em números
		//Aqui o vetor irá conter os números da tabela ASCII
		//De acordo com a tabela ASCII o vetor será ordenado
		System.out.println("Vetor com a tabela ASCII sem ordenar");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(" " +lista[i]);
		}
		
		int tamanho = lista.length -1;//Aqui estou pegando o tamanho do vetor
		RecursividadeMergeSort(lista, 0, tamanho);//Aqui irá ordenar meu vetor
		
		
		System.out.println("\n\nVetor com a tabela ASCII ordenado");
		for (int i = 0; i < lista.length; i++) 
		{
			System.out.print(" " + lista[i]);//Aqui eu printei o vetor ordenado da tabela ASCII
		}
		System.out.print("\n" + OrdemAlfabeticaemASCIIparaString(lista));//Convertir o vetor em ASCII para string 
	}	
	public static int[] OrdemAlfabeticaemNumerosASCII(String alfa, int[] vetint)//Função de converter string em números da
	//tabela ascii
	{
		 for ( int i = 0; i < alfa.length(); ++i ) 
	        { 
	            char c = alfa.charAt( i ); 
	            int j = (int) c; 
	            vetint[i] = j;
	        } 
	        return  vetint;
	}
	public static String OrdemAlfabeticaemASCIIparaString(int[] vetint) //função de converter vetor da tabela ASCII em string
	{
		String res = "";
		 for ( int i = 0; i < vetint.length; ++i ) 
	        { 
	            
	            res +=(char)vetint[i];
	        } 
	        return  res;
	}
	
	public static void RecursividadeMergeSort(int[] lista, int baixo, int alto) //Recursividade do MergeSort
	{
		if(baixo == alto) //Aqui é meu caso base
		{
			return;
		}
		else 
		{
			int medio = (baixo + alto)/2;//Aqui o vetor pela metade da esqueda e direita
			RecursividadeMergeSort(lista,baixo,medio);//Aqui é recursiviade chamando o meu vetor do lado esquerdo
			RecursividadeMergeSort(lista,medio + 1,alto);//Aqui é recursividade chamando meu vetor do lado direito
			intercalar(lista,baixo,medio,alto);//Aqui e a intercalação dos valores do meu vetor

		}
	}
	public static void intercalar(int[]list, int baixoi, int medioi, int altoi) 
	{
		int[] L = new int[medioi - baixoi + 2];//Aqui meu vetor que ira receber os valores intercalados da esquerda
		
		for (int i = baixoi; i <= medioi; i++) 
		{
			L[i - baixoi] = list[i];//Vetor recebendo valores do vetor da esquerda
		}
		L[medioi - baixoi + 1] = Integer.MAX_VALUE;//Aqui é meu vetor da esquerda recebendo o maior valor
		int[] R = new int[altoi - medioi + 1];//Aqui meu vetor que ira receber os valores intercalados da direita
		
		for (int i = medioi + 1; i <= altoi; i++)
		{
			R[i - medioi - 1] = list[i];//Vetor recebendo os valores do vetor da direita
		}
		R[altoi - medioi] = Integer.MAX_VALUE;//Aqui é meu vetor da direita recebendo o maior valor
		int i = 0, j = 0;//Aqui estão os meus contadores
		
		for (int k = baixoi; k <= altoi; k++) 
		{
			if (L[i] <= R[j]) 
			{
				list[k] = L[i];
				i++;
			}
			else 
			{
				list[k] = R[j];
				j++;
			}
		} 
	}

}


//Desculpe pelas gambiarras, mas o foi que pude fazer :)
