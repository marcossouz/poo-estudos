package br.com.k19.testes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LeDoTecladoEEscreveNoArquivo {
	private static PrintStream printStream;

	public static void main(String[] args) throws IOException {
		InputStream teclado = System.in;
		Scanner scanner = new Scanner(teclado);
		
		FileOutputStream arquivo = new FileOutputStream("saida.txt");
		printStream = new PrintStream(arquivo);
		
		while(scanner.hasNextLine()){
			String linha = scanner.nextLine();
			printStream.println(linha);
			
		}
		
		scanner.close();
	}
}
