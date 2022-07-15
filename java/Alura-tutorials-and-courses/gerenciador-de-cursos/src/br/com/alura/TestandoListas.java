package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula01 = "Conhecendo mais de listas";
		String aula02 = "Modelando a classe Aula";
		String aula03 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula01);
		aulas.add(aula02);
		aulas.add(aula03);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}

		System.out.println(aulas.size());

		aulas.forEach(aula -> {
			System.out.println("percorrendo:");
			System.out.println("Aula " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);
	}
}
