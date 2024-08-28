import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         
        int parametroUm = sc.nextInt();
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            
        }
        sc.close();
    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        }
        for (int i = parametroUm + 1; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
