package br.com.k19.testes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LeUmArquivoEGravaEmOutro {
	private static Scanner scanner;

	public static void main(String[] args) throws IOException{
		InputStream arquivoEntrada = new FileInputStream("entrada.txt");
		scanner = new Scanner(arquivoEntrada);
		
		FileOutputStream arquivoSaida = new FileOutputStream("saida.txt");
		PrintStream printstream = new PrintStream(arquivoSaida);
		
		while(scanner.hasNextLine()){
			String linha = scanner.nextLine();
			printstream.println(linha);
		}
		
		printstream.close();
	}
}
