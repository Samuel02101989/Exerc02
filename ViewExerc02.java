package com.indra.exerc02.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.indra.exerc02.controller.ControllerExerc02;
import com.indra.exerc02.model.Cliente;

public class ViewExerc02 {

public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();



		String nome = JOptionPane.showInputDialog("Nome: ");
		String rua = JOptionPane.showInputDialog("Rua: ");
		int numeroDaCasa = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
		long telefone = Long.parseLong(JOptionPane.showInputDialog("Telefone: "));
		long celular = Long.parseLong(JOptionPane.showInputDialog("Celular: "));
		String cpf = JOptionPane.showInputDialog("CPF: "); 
		String cnpj = JOptionPane.showInputDialog("CNPJ: ");

		cli.setNome(nome);
		cli.setRua(rua);
		cli.setNumeroCasa(numeroDaCasa);
		cli.setTelefone(telefone);
		cli.setCelular(celular);
		cli.setCpf(cpf);
		cli.setCnpj(cnpj);

		ControllerExerc02 controller = new ControllerExerc02(); 
		clientes.add(cli);
		controller.listeTodosClientes(clientes);
		
	}
}
