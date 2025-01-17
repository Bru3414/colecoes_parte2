package br.com.bdam;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ColecoesParte2 {

	public static void main(String[] args) {
		exercicio1();
		exercicio2();
	}
	
	public static void exercicio1() {
		System.out.println("**** EXERCICIO 1 ****");
		Scanner s = new Scanner(System.in);
		System.out.println("Digite nomes separados por: ,");
		String nomes = s.next().toLowerCase();
		String[] nomesSeparados = new String[nomes.split(",").length];
		for (int i = 0; i < nomes.split(",").length; i++) {
			nomesSeparados[i] = nomes.split(",")[i];
		}
		Arrays.sort(nomesSeparados);
		System.out.println("Nomes separados em ordem alfabética:");
		for (String nome : nomesSeparados) {
			System.out.println(nome);			
		}
	}
	
	public static void exercicio2() {
		System.out.println("**** EXERCICIO 2 ****");
		String texto = "Carlos-M,Joana-F,Bruno-M,Ana-F,Vitoria-F,Pedro-M,Rogerio-M,Amanda-F,Wellington-M";
		System.out.println(texto);
		List<String> pessoas = new ArrayList<>();
		List<String> masculino = new ArrayList<>();
		List<String> feminino = new ArrayList<>();
		for (int i = 0; i < texto.split(",").length; i++) {
			pessoas.add(texto.split(",")[i]);
			
			if (pessoas.get(i).split("-")[1].intern() == "M") {
				masculino.add(pessoas.get(i).split("-")[0]);
			} else {
				feminino.add(pessoas.get(i).split("-")[0]);
			}
			
		}
		Collections.sort(masculino);
		Collections.sort(feminino);
		System.out.println("Gênero masculino:");
		for (String nome: masculino) {
			System.out.println(nome);				
		}
		System.out.println(" ");
		System.out.println("Gênero feminino:");
		for (String nome: feminino) {
			System.out.println(nome);				
		}	
	}
 
}
