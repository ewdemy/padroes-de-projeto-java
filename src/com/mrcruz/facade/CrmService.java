package com.mrcruz.facade;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente gravado com sucesso!");
		System.out.println("Nome: " + nome);
		System.out.println("CEP: " + cep);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
	}
}
