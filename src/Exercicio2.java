import java.util.Scanner;
import java.util.Stack;
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //criação de vetor
        Candidato vetCandidato[] = new Candidato[50]; //armzenar candidatos
        //variaveis geral
        int num = 1, cont = 0;
        double nota;
        String nome;
        //pilhas
        Stack pilhaOrdenada = new Stack(); // Aqui vao ficar as notas da maior para a menor
        Stack pilhaCandidatoClass = new Stack();// os classificados
        Stack pilhaTemporaria = new Stack(); // aqui vamos colocar as notas temporariamente
        Stack pilhaCandidatoNao = new Stack();// nao classificados


        //Candidato maiorCandidato = new Candidato(null,0);


        //---------------------------Adcionar os nomes e notas dos candidatos-----------------------

        do {//do que adciona os alunos no vetor
            System.out.println("----Menu----" +
                    "\n[ 1 ] Adcionar aluno e sua nota." +
                    "\n[ 2 ] Finalizar registro.");
            num = input.nextInt();
            if (num == 1) {
                System.out.println("Digite o nome do " + (cont + 1) + " aluno(a).");
                nome = input.next();
                System.out.println("Digite a nota do(a) " + nome + ".");
                nota = input.nextDouble();
                Candidato candidato = new Candidato(nome, nota);
                vetCandidato[cont] = candidato;
                cont++;
            }
            if (cont == 49) {
                System.out.println("Você adcionou a quantidade limite de nomes e notas.");
                num = 2;
            }

        } while (num == 1);//fechar o  do

        //-------------------------------Ordenar vetor em ordem do maior para menor-------------------------

        int indice=0;

        Candidato maiorCandidato = new Candidato(null,0);
        for (int i=0; i < cont; i++){//1
            for(int j = 0; j<cont; j++){//2
                if(vetCandidato[i].getNota() < vetCandidato[j].getNota()){
                    maiorCandidato  = vetCandidato[j];
                    indice = j;
                    vetCandidato[indice]= vetCandidato[i];
                    vetCandidato[i] = maiorCandidato;
                }
            }


        }
        for(int c =0; c<cont; c++){
            System.out.println(vetCandidato[c]);
        }

        //-------------------------------Colocar nas pilhas-------------------------------------------

        System.out.println("Quantos candidatos foram classificados?");//10 -> entao as 10 maiores notas vao para uma 2 pilha
        int quant = input.nextInt();

        for(int c = 0; c < cont; c++){
            pilhaTemporaria.push(vetCandidato[c]);
        }
        for(int c = 0; c < quant; c++){
            pilhaCandidatoClass.push(pilhaTemporaria.pop());
        }
        for(int c = 0; c < quant; c++){
            pilhaCandidatoNao.push(pilhaTemporaria.pop());
        }

        System.out.println("Pilha classificados: " + pilhaCandidatoClass);
        System.out.println("Pilha não classificados: " + pilhaCandidatoNao);








}}