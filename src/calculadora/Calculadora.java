package calculadora;
import java.util.Scanner;
/**
 *
 * @author Willy Rafael
 */
public class Calculadora {
    public static void main(String[] args) {
      
      //Leitor de dados de entrada  
      Scanner entrada = new Scanner(System.in);
      
      //Declaração de duas variáveis
      int num1 = 0;
      int num2 = 0;  
      
      //Informando os valores atuais das variáveis
      System.out.printf("O valor de N1 é: %d\n",num1);
      System.out.printf("O valor de N2 é: %d\n",num2);
      
      //Realizando a leitura dos numeros digitados e salvando 
      //dentro das variáveis declaradas
      System.out.println("Digite o primeiro numero:");
      num1 = entrada.nextInt();
      
      System.out.println("Digite o segundo numero:");
      num2 = entrada.nextInt();
      
      //Perguntando sobre qual procedimento realizar e o guardando 
      //em uma variável declarada
      System.out.println("Qual o processo a se realizar? \n"
              + "Digite a numeração desejada:\n"
              + "1 - Somar\n2 - Subtrair\n3 - Dividir\n4 - Multiplicar\n");
      int op = entrada.nextInt();
      
      //gravando o metodo da classe de calculos em uma variável "valor"
      calculos valor = new calculos();
      
      //Iniciando duas variáveis para resultados
      int result = 0;
      float result2 = 0;
      
      //Realizando processos dependendo da variável "op"
      switch (op){
          case 1: //Soma
              result = valor.soma(num1,num2);
              System.out.printf("O valor da soma é: %d\n",result);
              break;
          case 2: //Subtração
              result = valor.subt(num1,num2);
              System.out.printf("O valor da subtração é: %d\n",result);
              break;
          case 3: //Divisão
              result2 = valor.div(num1,num2);
              System.out.printf("O valor da divisão é: %.2f\n",result2);
              break;
          case 4: //Multiplicação
              result2 = valor.mult(num1,num2);
              System.out.printf("O valor da multiplicação é: %.2f\n",result2);
              break;      
      }
    }
    
    //Classe onde estão os metodos de cálculos
    private static class calculos {
        //Soma
        public int soma(int A,int B) {
            int soma = A + B;
            return soma;
        }
        //Subtração
        public int subt(int A,int B) {
            int subt = A - B;
            return subt;
        }
        //Divisão
        public float div(int A,int B) {
            int div = A / B;
            return div;
        }
        //Multiplicação
        public float mult(int A,int B) {
            int mult = A * B;
            return mult;
        }
    }
}
