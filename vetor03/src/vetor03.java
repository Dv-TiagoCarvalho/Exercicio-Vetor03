import java.util.Scanner;

public class vetor03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int contador=0;

        System.out.println("Digite 20 valores");

        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = scanner.nextInt();

             }

            for (int i = 0; i < vetor.length; i++) {
                
                if (vetor[i]%2==0) {
                   

                    System.out.println(" Pares: " + vetor[i]);
                    contador++;     
                    
                }     
            }

            System.out.println("Numero de Pares: " + contador);
            scanner.close();
           
        }
       

          
    }

