package biblioteca;

public class Usuario {
	String nome;
	int idade;
	String sexo;
	long telefone;
	
	public Usuario(String nome, int idade, String sexo, long telefone){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
	}
	public void setnome(String nome){
		this.nome = nome;
	}
	public void setsexo(String sexo){
		this.sexo = sexo;
	}
	public void setidade(int idade){
		this.idade = idade;
	}
	public void settelefone(long telefone){
		this.telefone = telefone;
	}
	public String getnome() {
		return nome;
	}
	public String getsexo() {
		return sexo;
	}
	public int idade () {
		return idade;
	}
	public long telefone() {
		return telefone;
	}
}
