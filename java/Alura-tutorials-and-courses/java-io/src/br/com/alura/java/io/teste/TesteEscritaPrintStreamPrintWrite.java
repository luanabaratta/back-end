package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWrite {

	public static void main(String[] args) throws IOException {


		 	//Fluxo de Entrada com Arquivo
		    //OutputStream fos = new FileOutputStream("lorem2.txt");
		    //Writer osw = new OutputStreamWriter(fos);
		    //Buff3eredWriter bw = new BufferedWriter(osw);
			
			//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
			//PrintStream ps = new PrintStream("lorem2.txt");
			PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
			
			ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
			ps.println();
			ps.println();
			ps.println();
			ps.println("Lorem ipsum dolor sit");
			
			ps.close();
			
		}

}
