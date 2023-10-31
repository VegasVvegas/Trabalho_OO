package entities;

import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date dataNascimento;
	private String email;
	private String senha;
	
	public Pessoa(String nome, Date dataNascimento, String email, String senha) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String vizualizarPessoa() {
		return "test";
	}
}
