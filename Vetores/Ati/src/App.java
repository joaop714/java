//import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {       
        //Scanner scan = new Scanner(System.in);
        Random ran = new Random();


        /* 
        1) Crie um vetor de inteiros ( int ) de 10 posições. 
        Preencha-o com 10 valores digitados pelo usuário. 
        Use um for para exibir os valores deste vetor.

        2) Crie uma matriz char com x linhas por 4 colunas que 
        imprima seu nome completo respeitando os espaços.

        3) Faça um programa com uma matriz 5x5 de inteiros positivos 
        ou negativos digitados pelo usuário e encontre e 
        exiba o maior elemento desta matriz.

        4) Faça um programa com um vetor com 10 elementos inteiros 
        positivos (aleatórios e de sua escolha). Permita que seja 
        solicitado um determinado valor inteiro e positivo para ser 
        procurado neste vetor. Caso exista, o programa deve exibir o 
        índice no qual o valor está posicionado. Caso contrário, o 
        programa deve informar que o elemento não existe no vetor.

        5) Faça um programa com uma matriz com 9 elementos (3x3) 
        reais positivos (aleatórios e de sua escolha). Calcule 
        e exiba a soma dos elementos de cada linha desta matriz.
        */



       //1)

        /* 
        int[] vetor = new int[10];

        for(int c=0;c<10;c++){
            System.out.println("Digite uma numero: ");
            vetor[c] = scan.nextInt();
        }
        for (double veto : vetor){
            System.out.println(veto);
        }
        */

        //2)

        /* 
        char[][] nome = {
            {'J', 'O', 'Ã', 'O'},
            {' ', 'P', 'E', 'D'},
            {'R', 'O', ' ', 'M'},
            {'A', 'R', 'T', 'I'},
            {'N', 'S', ' ', 'T'},
            {'A', 'S', 'S', 'I'},
        };
        for(char[] linhas:nome){
            for(char coluna:linhas){
                System.out.print(coluna);
            }
           // System.out.println();
        }
        */

        //3)

        /* 
        int[][] num =new  int[5][5];
        int mr = Integer.MIN_VALUE; 

        for(int nu = 0; nu < 5; nu++){
            for(int nd = 0; nd< 5; nd++){
                System.out.println("digite um numero: ");
                num[nu][nd] = scan.nextInt();

                if(num[nu][nd] > mr){
                    mr = num[nu][nd];
                }
            }
        }
        System.out.println("O maior numero digitado foi: " + mr); 
        */

        //4)

        /* 
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = ran.nextInt(30) +1;
        }
        System.out.print("Vetor gerado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Digite um numero de 1 a 30 para ser buscado no vetor: ");
        int busca = scan.nextInt();

        int all;
        for(all = 0; all < vetor.length; all++){
            if(vetor[all] == busca){
                    System.out.println("O numero foi encontrado no indice: " + all);
                    break;
            }
        }
        if (all == vetor.length) {
            System.out.println("O numero não foi encontrado no vetor.");
        }
        */

        //5

        
        int[][] mat = new int[3][3];

        for(int linha = 0; linha < mat.length; linha++){
            for(int coluna = 0; coluna <mat.length; coluna++){
                mat[linha][coluna] = ran.nextInt(10) +1;
            }
        }
        int somato = 0;
        for(int linha = 0; linha < mat.length; linha++){
            int somali = 0;
            for(int coluna = 0; coluna <mat[linha].length; coluna++){
              System.out.print(mat[linha][coluna] + " ");
              somali += mat[linha][coluna];
            }
            System.out.println(" | a soma da linha foi: " + somali); 
            somato += somali;
        }
        System.out.println("       | Soma total: "+somato);
        

    }
}
