package com.infoafp.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

	ERRO_DE_SISTEMA("/erro-de-sistema", "Erro de sistema"),
	PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro inválido");
	
	private String title;
	private String uri;
	
	ProblemType(String path, String title) {
		this.uri = "https://infoafp.com.br" + path;
		this.title = title;
	}
	
}
