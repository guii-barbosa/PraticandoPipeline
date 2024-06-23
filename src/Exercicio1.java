import java.util.Scanner;
import java.util.Stack;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //push() – Insere um elemento na pilha
        //pop() – Remove um elemento da pilha
        //empty() – Verifica se a pilha está vazia
        //3. Copiar topo (peek)
        //4. Verificar se a pilha está vazia (isEmpty)

        Stack pilha = new Stack();
        int num, quant=0, opcao;


        do{
            System.out.println("----Menu----");
            System.out.println("\n[ 0 ] Sair." +
                    "\n[ 1 ] Remover o topo." +
                    "\n[ 2 ] Ver topo da lista." +
                    "\n[ 3 ] Verificar se a Pilha está vazia" +
                    "\n[ 4 ] Vizualizar Pilha" +
                    "\n[ 5 ] Adcionar");
            opcao= input.nextInt();

            switch(opcao){
                case 1:
                    if(pilha.isEmpty()){
                        System.out.println("Adcione algo a pilha para remove-lo.");
                    }else{
                        System.out.println("Topo removido!");
                        pilha.pop();
                    }
                    break;
                case 2:
                    if(pilha.isEmpty()){
                        System.out.println("A pilha está vazia.");
                    }else{
                        System.out.println("O último número é: " + pilha.peek() );
                    }
                    break;
                case 3:
                    if(pilha.isEmpty()){
                        System.out.println("A pilha está vazia");
                    }else{
                        System.out.println("A pilha está cheia.");
                    }
                    break;
                case 4:
                    System.out.println(pilha);
                    break;
                case 5:
                    System.out.println("Digite um número natural");
                    pilha.push(input.nextInt());
                    break;
            }


        }while(opcao!=0);

    }
}