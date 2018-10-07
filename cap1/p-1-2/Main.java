package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
    test();
    }

    public static void test() throws IOException {
        Random gerador = new Random(); //gerador de numeros aleatorios
        ArrayList<Integer> linhas = new ArrayList<Integer>(); //arrayList de inteiros
        ArrayList<String> errosDigitacao = new ArrayList<String>(); // arrayList com meus erros de digitacao proposital
        String frase = "Eu não mandarei mais spam para meus amigos";
        String fraseComErro;
        String c, newC1, newC2, newC3;
        int[] l = new int[100];

        for (int i = 0; i < 8; i++){
            linhas.add(gerador.nextInt(100)); //gerando os numeros aleatorios de 1 a 100

            fraseComErro = frase; // passando a frase correta para editar
            int a1 = gerador.nextInt(fraseComErro.length());
            c = fraseComErro.substring(a1, a1 + 1); //pega um caractere aleatorio da frase
            a1 = gerador.nextInt(fraseComErro.length());
            newC1 = frase.substring(a1, a1 + 1); //pega um caractere aleatorio da frase
            a1 = gerador.nextInt(fraseComErro.length());
            newC2 = frase.substring(a1, a1 + 1); //pega um caractere aleatorio da frase
            a1 = gerador.nextInt(fraseComErro.length());
            newC3 = frase.substring(a1, a1 + 1); //pega um caractere aleatorio da frase

            //trocando alguns caracteres da frase
            fraseComErro = fraseComErro.replaceFirst(c, newC1);
            fraseComErro = fraseComErro.replaceFirst(c, newC2);
            fraseComErro = fraseComErro.replaceFirst(c, newC3);
            errosDigitacao.add(fraseComErro);
        }

        for (String f_erro: errosDigitacao){
//            System.out.println(f_erro);
        }

//Ate aqui ok


        Collections.sort(linhas); //Ordenando as linhas

        //Escrever tbm em um arquivo
        FileWriter f = new FileWriter("file.txt", true);
        BufferedWriter gravaf = new BufferedWriter(f);

        System.out.print("linhas com erro de digitação: ");
        gravaf.write("linhas com erro de digitação: ");

        for (Integer linha: linhas) { //setando as linhas sorteadas com 1
            l[linha] = 1;
            System.out.print(linha+1 + " ");
            gravaf.write(linha+1 + " ");
        }

        System.out.println();
        gravaf.newLine();

        int x = 0;
        for (int i = 0; i < 100; i++){
            if(l[i] == 1){
                System.out.println(i+1 + " " + errosDigitacao.get(x++));
                gravaf.write(i+1 + " " + errosDigitacao.get(x-1));
                gravaf.newLine();
            } else {
                System.out.println(i+1 + " " + frase);
                gravaf.write(i+1 + " " + frase);
                gravaf.newLine();
            }
        }

        gravaf.newLine();
        gravaf.close();
        f.close();
    }
}
