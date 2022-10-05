/*Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno.
 * Calcule e imprima a média semestral.
 * O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
 * Cada nota deve ser validada separadamente.

 No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

 Entrada
 O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido para este X for igual a 2.

 Saída
 Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”.
 Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.

 Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)"
 e esta mensagem deve ser apresentada novamente se o valor da entrada padrão para X
 for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.

 A média deve ser impressa com dois dígitos após o ponto decimal.*/

import java.util.*;
public class VariasNotasComValidacao
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        double nota1 = 0;
        double nota2 = 0;
        double media = 0;
        int escolha = 0;
        double aux1=0,aux2=0;

        while(escolha != 2  )
        {

            do
            {
                nota1 = scan.nextDouble();
                if(nota1 >= 0 && nota1 <= 10 )
                {
                    aux1 = nota1;
                }
                else
                {
                    System.out.println("nota invalida");
                }

            } while(nota1 <0 || nota1 > 10);

            do
            {
                nota2 = scan.nextDouble();
                if(nota2 >= 0 && nota2 <= 10 )
                {
                    aux2 = nota2;
                }
                else
                {
                    System.out.println("nota invalida");
                }

            } while(nota2 <0 || nota2 > 10);

            media = (aux1+aux2)/2;
            System.out.printf("media = %.2f",media);
            System.out.println();
            System.out.println("novo calculo (1-sim 2-nao)");
            do
            {
                escolha = scan.nextInt();
                if (escolha < 1 || escolha > 2)
                {
                    System.out.println("novo calculo (1-sim 2-nao)");
                }

            } while (escolha > 2 || escolha < 1) ;
        }
    }
}
