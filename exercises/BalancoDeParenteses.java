/*
 Dada uma expressão qualquer com parênteses, indique se a quantidade de parênteses está correta ou não,
  sem levar em conta o restante da expressão. Por exemplo:

a+(b*c)-2-a        está correto
(a+b*(2-c)-2+a)*2  está correto

enquanto

(a*b-(2+c)         está incorreto
2*(3-a))           está incorreto
)3+b*(2-c)(        está incorreto

Ou seja,todo parênteses que fecha deve ter um outro parênteses
que abre correspondente e não pode haver parênteses que fecha sem um previo parenteses que
abre e a quantidade total de parenteses que abre e fecha deve ser igual.

Entrada
Como entrada, haverá N expressões (1 <= N <= 10000), cada uma delas com até 1000 caracteres.

Saída
O arquivo de saída deverá ter a quantidade de linhas correspondente ao arquivo de entrada,
 cada uma delas contendo as palavras correct ou incorrect de acordo com as regras acima fornecidas.
  */

import java.util.*;
public class BalancoDeParenteses
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        while(scan.hasNext())
        {
            String palavra = scan.next();
            int contAberto =0 ;
            boolean erro= false;

            for(int i=0; i<palavra.length(); i++ )
            {
                char caracter = palavra.charAt(i);

                if(caracter == ')' )
                {
                    if(contAberto == 0)
                    {
                        erro =true;
                        break;
                    }
                    contAberto--;
                }else if (caracter == '(')
                {
                    contAberto++;
                }

            }

            if(contAberto >0 || erro)
            {
                System.out.println("incorrect");

            }
            else
            {
                System.out.println("correct");
            }
        }

    }
}
