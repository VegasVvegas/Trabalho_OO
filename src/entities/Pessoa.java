package entities;

public abstract class Pessoa {
	protected String nome;
	protected String dataNascimento;
	protected String email;
	protected String senha;
	
	public Pessoa(String nome, String dataNascimento, String email, String senha) {
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
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
