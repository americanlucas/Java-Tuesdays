package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Livro;

public class ProgramaAutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();

        // Adicionando livros
        livros.add(new Livro("J.K. Rowling", "Britânica", "Harry Potter", "Bloomsbury", "Uma história sobre um jovem bruxo."));
        livros.add(new Livro("George Orwell", "Britânica", "1984", "Secker & Warburg", "Um romance distópico sobre um regime totalitário."));
        livros.add(new Livro("Machado de Assis", "Brasileiro", "Dom Casmurro", "Livraria Garnier", "Uma história de ciúmes e traição no Rio de Janeiro imperial."));

        // Sistema para exibir informações dos livros
        for (Livro livro : livros) {
            System.out.println("\nInformações do Livro:");
            livro.imprimirInfoLivro();
        }

        scanner.close();
    }
}

