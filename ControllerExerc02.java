package com.indra.exerc02.controller;

import java.util.ArrayList;

import com.indra.exerc02.model.Cliente;

public class ControllerExerc02 {
	public void listeTodosClientes(ArrayList<Cliente> clientes) {

		if (clientes.size() == 0) {
			System.out.println("Nao existe cadastro");

		} else {
			for (int i = 0; i < clientes.size(); i++) {
				Cliente cli = clientes.get(i);
				System.out.println("\nNOme: " + cli.getNome());
				System.out.println("\nRua: " + cli.getRua());
				System.out.println("\nNumero: " + cli.getNumeroCasa());
				System.out.println("\nTelefone: " + cli.getTelefone());
				System.out.println("\nCelular: " + cli.getCelular());
				System.out.println("\nCPF: " + cli.getCpf());
				System.out.println("\nCnpj: " + cli.getCnpj());
			}
			System.out.println("Fim da lista");
		}
	}
}
