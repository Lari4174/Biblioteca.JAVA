package biblioteca;

public class Livro {
	String titulo;
	String autores;
	String area;
	String editora;
	int ano;
	int edicao;
	int numeroF;
	public Livro(String titulo, String autores, String area, String editora, int ano, int edicao, int numeroF){
		this.titulo = titulo;
		this.autores = autores;
		this.area = area;
		this.editora = editora;
		this.ano = ano;
		this.edicao = edicao;
		this.numeroF = numeroF;
	}
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setautores(String autores) {
		this.autores = autores;
	}
	public void setarea(String area) {
		this.area = area;
	}
	public void seteditora(String editora) {
		this.editora = editora;
	}
	public void setano(int ano) {
		this.ano = ano;
	}
	public void setedicao(int edicao) {
		this.edicao = edicao;
	}
	public void setnumeroF(int numeroF) {
		this.numeroF = numeroF;
	}
	public String gettitulo() {
		return titulo;
	}
	public String getautores() {
		return autores;
	}
	public String getarea() {
		return area;
	}
	public String geteditora() {
		return editora;
	}
	public int getano() {
		return ano;
	}
	public int getedicao() {
		return edicao;
	}
	public int getnumeroF() {
		return numeroF;
	}
}
