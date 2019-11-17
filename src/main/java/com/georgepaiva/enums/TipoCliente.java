package com.georgepaiva.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa Jurídica");

	// Atributos para armazenar os tipos enums.
	private int cod;
	private String descricao;

	// Construtor de tipo Enumerado é sempre private.
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	// Criar os metodos Gettters(Cria-se apenas o Get, poise uma vez instanciado o
	// tipo enumerado, não se muda mais o nome dele).
	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	// Metodo que retorna o objeto do TipoCliente já instanciado conforme o cod que
	// for passado.
	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		// Buscar para todo o objeto x, nos valores possivéis do TipoCliente
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + cod);
	}

}
