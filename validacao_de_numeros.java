import java.util.Scanner;

public class validacao_de_numeros {

    public static void main(String[] args) {
        int A[][]= new int[3][3];
        int x=0;
        Scanner console = new Scanner(System.in);

        System.out.println("digite o valor de x: ");
        x=console.nextInt();


        //for para receber os valores
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print("digite os valores desejados: ");
                A[i][j]=console.nextInt(); 
            }
        }

        //for para fazer a validação
        for(int i=0;i < 3;i++){
            for(int j=0;j<3;j++){
                if(A[i][j]%x==0){
                    System.out.print(A[i][j]+" ");
                }
            }
        }          
    }
}
