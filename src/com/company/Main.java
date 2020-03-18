package com.company;
import java.util.*;
/**
 * Lista - 01 Aquecimento!!
 *
 * @author Leonardo Vinícius Rocha de Lima
 * @version 21/02/2020
 */
public class Main {
    /**
     * Método main da Classe.
     * Serve apenas para chamar testar os métodos criados.
     */
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 7};
        int chave = 0;
       encontraValorRecursivo(array, chave);
    }
    /**
     * Calcula o n-esimo valor da sequencia de fibonacci.
     * param   n:   numero do elemento da sequencia. Obrigatoriamente
     *              deve ser maior que 0. (n > 0)
     *
     * @return      valor do n-esimo elemento.
     */
    public static int fibonacciNormal(int fib){
        int anterior = 0;
        int atual = 1;
        int resultado = 0;

        if(fib == 0 || fib == 1){ return fib; }
        if (fib == 2){ return 1;}

        for (int i = 0; i < fib-1; i++) {
            resultado = anterior + atual;
            anterior = atual;
            atual = resultado;
        }
        return resultado;
    }

    /**
     * O método a seguir faz o somatório dos elementos de um arranjo.
     * param   array:   arranjo de inteiros.
     *
     * @return      a soma dos elementos do arranjo.
     */
    public static int somaArray(int [] array){
        int soma = 0;

        for (int i = 0; i < array.length; i++){
            soma = soma+array[i];
        }
        return soma;
    }
    /**
     * O método a seguir faz a soma do 2o e do 3o maiores elementos de um arranjo
     *
     * param   array:  arranjo de inteiros.
     *
     * @return      A soma dos dois elementos.
     */
    public static int somaElementos(int [] array){

        for (int i = 0; i < array.length; i ++){
            int aux = i;
            for(int j = i +1; j < array.length; j++){
                if (array[j] < array[aux]){
                    
                }
            }
        }

        int segundo = array[array.length-2];
        int terceiro = array[array.length-3];
        System.out.println(segundo+" "+terceiro);
        int soma = segundo+terceiro;
        return soma;
    }
    /**
     * O método a seguir corta uma String
     * em um caractere delimitador.
     * Ex: Se String = "Olá, mundo, cruel!"
     *     e Caractere = ","
     *     O retorno deve ser = " mundo, cruel!"
     *
     * param   str:   String a ser cortada.
     * param   c:     Caractere delimitador.
     *
     * @return      Restante da String cortada.
     */
    public static String cortaPrimeiraAparicao(String str, String c){
        String array[] = str.split(c, 2);
        String retorno = array[array.length-1];
        return retorno;
    }
    /**
     * O método a seguir corta uma String
     * na ultima aparição do caractere delimitador.
     * Ex: Se String = "Olá, mundo, cruel!"
     *     e Caractere = ","
     *     O retorno deve ser = " cruel!"
     *
     * param   str:   String a ser cortada.
     * param   c:     Caractere delimitador.
     *
     * @return      Ultimo parte da String cortada.
     */
    public static String cortaUltimaAparicao(String str, String c){
        String array[] = str.split(c);
        String retorno = array[array.length-1];
        return retorno;
    }

    /**
     * O método a seguir corta uma String
     * na primeira e na ultima aparição do caractere delimitador.
     * Ex: Se String = "Olá, mundo, cruel!"
     *     e Caractere = ","
     *     O retorno deve ser = " mundo"
     *
     * param   str:   String a ser cortada.
     * param   c:     Caractere delimitador.
     *
     * @return      A parte da String entre a primeiro e ultima aparição do caractere delimitador.
     */
    public static String cortaMeioString(String str, String c){
        int posicaoPrimeiraOcorrencia = str.indexOf(c);
        int posicaoUltimaOcorrencia = str.lastIndexOf(c);

        String array[] = str.split("");

        String respota = "";

        for (int i = 1; i < array.length; i++){
            if(i > posicaoPrimeiraOcorrencia && i < posicaoUltimaOcorrencia ){
                respota += array[i];
            }
        }
        return respota;
    }

    /**
     * O método a seguir corta uma String
     * na segunda aparição do caractere delimitador.
     * Ex: Se String = "Olá, mas olha, que mundo, cruel!"
     *     e Caractere = ","
     *     O retorno deve ser = " que mundo, cruel"
     *
     * param   str:   String a ser cortada.
     * param   c:     Caractere delimitador.
     *
     * @return      A parte da String após a segunda aparição do caractere delimitador.
     */
    public static String cortandoUmPedaço(String str, String c) {
        String [] array = str.split(c, 3);
        String resposta = array[array.length-1];
        return resposta;
    }

    /**
     * O método a seguir verifica se uma String é um Palíndromo
     * Ex: Se String = "ovo", "arara"
     *     O retorno deve ser = true
     *
     * param   str:   String a ser verificada.
     *
     * @return  True ou False
     */
    public static boolean isPalindromo(String str){
        String array[] = str.split("");
        String finall = "";
        int tamanho = array.length;
        String arrayAux[] = new String[tamanho];
        for(int i = 0; i < array.length; i++){
            tamanho--;
            arrayAux[i] = array[tamanho];
            finall +=arrayAux[i];
        }

        if(str.equals(finall)){
            return true;
        }
        return false;
    }

    /**
     * O método a seguir verifica se uma String é um Palíndromo,
     * porém desconsiderando os espaços.
     * Ex: Se String = "roma me tem amor"
     *     O retorno deve ser = true
     *
     * param   str:   String a ser verificada.
     *
     * @return  True ou False
     */
    public static boolean isPalindromoSemEspaco(String str){
        String newString = str.replace(" ", "");
        String[] array = newString.split("");
        String finall = "";

        int tamanho = array.length;
        String arrayAux[] = new String[tamanho];
        for(int i = 0; i < array.length; i++){
            tamanho--;
            arrayAux[i] = array[tamanho];
            finall +=arrayAux[i];
        }

        if(newString.equals(finall)){
            return true;
        }

        return false;
    }

    /**
     * O método a seguir verifica dentro de uma Lista
     * quais Strings são palíndromos, e caso sejam,
     * o sistema deve escrevelas na tela.
     *
     * Ex: Se a Lista for = {"ovo", "subinoonibus", "leonardo", "teste01", "romametemamor", "brasil"}
     *     O retorno deve ser = {"ovo", "subinoonibus", "romametemamor"}
     *
     * param   listaDePalavras:   Lista de Strings a ser verificada.
     *
     * @return  Lista de Strings que são palíndromos.
     */
    public static List<String> arrayPalindromo(List<String> listaDePalavras){
        List<String> retorno = new ArrayList<>();
        for(int i = 0; i < listaDePalavras.size();i++){
            if (isPalindromo(listaDePalavras.get(i))){
                retorno.add(listaDePalavras.get(i));
            }
        }
        System.out.println("Lista de Palavras que são Palindromos");
        return retorno;
    }

    /**
     * O método a seguir escreve na tela todos os
     * números pares entre 1 e 10000 que são Palíndromos.
     *
     * @return  Lista de números pares que são palíndromos.
     */
    public static void paresPalindromos(){
        String testando = "";
        for(int i = 0; i < 10000; i++){
            if (i%2==0){
                testando = ""+i;
                if (isPalindromo(testando))
                System.out.println("Par Palindromo "+testando);
            }
        }
    }

    /**
     * Calcula o n-esimo valor da sequencia de fibonacci recursivamente.
     * param   n:   numero do elemento da sequencia. Obrigatoriamente
     *              deve ser maior que 0. (n > 0)
     *
     * @return      valor do n-esimo elemento.
     */
    public static int fibonacciRecursivo(int n) {
        if(n == 0) return 0;
        if(n < 2) return n;
        return fibonacciRecursivo(n -1) + fibonacciRecursivo(n - 2);
    }

    /**
     * O método a seguir faz a soma dos valores de um arranjo de inteiros
     * de forma recursiva
     * param    array:  arranjo de inteiros a ser somado.
     *
     * @return      valor da soma dos elementos do arranjo.
     */
    public static void somaRecursiva(int array[]){
        int tamanho = array.length-1;
        int soma = 0;
        System.out.println(somaRecusivaAux(array, tamanho, soma));
    }

    /**
     * O método é um método auxiliar ao método somaRecursiva.
     * Ele recebe as entradas e realmente soma os valores.
     *
     * param    array:  arranjo de inteiros a ser somado.
     *          i:      tamanho o array.
     *          soma:   variável que guarda o valor da soma.
     *
     * @return      valor da soma dos elementos do arranjo.
     */
    public static int somaRecusivaAux(int array[], int i, int soma){
        if(i < 1){
            return soma+array[0];
        }
        soma += array[i];
        return somaRecusivaAux(array, i-1, soma);
    }


    /**
     * O método a seguir corta uma String
     * na segunda aparição do caractere delimitador de forma recursiva
     * Ex: Se String = "Olá, mas olha, que mundo, cruel!"
     *     e Caractere = ","
     *     O retorno deve ser = " que mundo, cruel"
     *
     * param   str:   String a ser cortada.
     * param   c:     Caractere delimitador.
     *
     * @return      A parte da String após a segunda aparição do caractere delimitador.
     */
    public static String cortandoUmPedacoRecursivamente(String str, String c){
        System.out.println(cortandoUmPedacoRecursivamenteAux(str, c, 0));
        return "";
    }

    /**
     * O método auxiliar do método cortandoUmPedacoRecursivamente.
     * Serve apenas para atribuir os valores corretamente e não mudar
     * a assinatura do método.
     * Ex: Se String = "Olá, mas olha, que mundo, cruel!"
     *     e Caractere = ","
     *     O retorno deve ser = " que mundo, cruel"
     *
     * param   str:   String a ser cortada.
     * param   c:     Caractere delimitador.
     * param    i:    Contador de recursividade
     *
     * @return      A parte da String após a segunda aparição do caractere delimitador.
     */
    public static String cortandoUmPedacoRecursivamenteAux(String str, String c, int contador) {
        String newString = str.substring(str.indexOf(c)).replaceFirst(c,"");
        if (contador == 1) {
            return newString;
        }
        contador = contador+1;
        return cortandoUmPedacoRecursivamenteAux(newString, c, contador);
    }

    /**
     * O método a seguir verifica se uma String é um Palíndromo
     * de forma recursiva.
     * Ex: Se String = "ovo", "arara"
     *     O retorno deve ser = true
     *
     * param   str:   String a ser verificada.
     *
     * @return  True ou False
     */
    public static boolean isPalindromoRecursivo(String str){
        return isPalindromoRecursivoAux(str, 0, str.length()-1);
    }

    public static boolean isPalindromoRecursivoAux(String s, int i, int f){
        boolean resp;
        if(i < (f/2)){
            resp = true;
        }

        if(s.charAt(i) != s.charAt(f)){
            return resp = false;
        }else {
            if(i>=(s.length()-1)) return true;
            resp = isPalindromoRecursivoAux(s,i+1,f-1);

        }
        return resp;
    }

    public static int fatorialRecursivo(int fatorial){
        if (fatorial == 0) return 1;
        return fatorial * fatorialRecursivo(fatorial-1);
    }

    public static boolean encontraValor(int[] array, int chave){
        for(int i = 0; i < array.length; i++){
            if (array[i] == chave){
                System.out.println("O valor "+chave+"exite e está na posição"+i);
                return true;
            }
        }
        return false;
    }

    public static boolean encontraValorRecursivo(int[] array, int chave){
        int posicao = array.length-1;
        encontraValorRecursivo(array, chave, posicao);
        if (encontraValorRecursivo(array, chave, posicao)) {
            System.out.println("O valor "+chave+" existe dentro do array");
            return true;
        }
        System.out.println("O valor não existe dentro do array");
        return false;
    }

    public static boolean encontraValorRecursivo(int[] array, int chave, int posicao){
        if (posicao == 0 && array[posicao] != chave) return false;
        if (array[posicao] == chave) return true;
        return encontraValorRecursivo(array, chave, posicao-1);
    }
}



