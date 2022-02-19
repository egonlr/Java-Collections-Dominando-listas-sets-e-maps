package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Egon Luiz");
		alunos.add("Sérgio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Mauricio Aniche");  // não aceita repetidos no Set
		
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sérgio Lopes");
		System.out.println(pauloEstaMatriculado);
		
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println();
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println();
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosEmLista);
		
		System.out.println(alunosEmLista);

	}

}
