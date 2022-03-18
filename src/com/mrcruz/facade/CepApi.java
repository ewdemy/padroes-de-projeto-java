package com.mrcruz.facade;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	} 
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Quixeramobim";
	}
	public String recuperarEstado(String cep) {
		return "CE";
	}
}
