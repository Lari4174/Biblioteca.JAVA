package biblioteca;

public class Emprestimo {
	String demp;
	int hora;
	Livro emprestado;
	Usuario emprestador;
	public Emprestimo(String demp, int hora, Livro emprestado, Usuario emprestador) {
		this.demp = demp;
		this.hora = hora;
		this.emprestado = emprestado;
		this.emprestador = emprestador;
	}
	public void setdemp(String demp) {
		this.demp = demp;
	}
	public void sethora(int hora) {
		this.hora = hora;
	}
	public void setemprestado(Livro emprestado) {
		this.emprestado = emprestado;
	}
	public void setemprestador(Usuario emprestador) {
		this.emprestador = emprestador;
	}
	public String getdmep() {
		return demp;
	}
	public int gethora() {
		return hora;
	}
	public Livro getemprestado() {
		return emprestado;
	}
	public Usuario getusuario() {
		return emprestador;
	}
	public static void main(String args[]) {
		Livro livro1 = new Livro("Harry Potter","Yasuo e Yone", "Lol 2.0", "runa e terra", 2022,1,1024);
		Usuario user1 = new Usuario("Kayn",24,"bilateral",416666666);
		Emprestimo emp1 = new Emprestimo("20/02/-1876",19,livro1,user1);
		System.out.println("EMPRÉSTIMO");
		System.out.println("Nome da pessoa: " + emp1.getusuario().getnome());
		System.out.println("Sexo: " + emp1.getusuario().getsexo());
		System.out.println("Livro emprestado: " + emp1.getemprestado().gettitulo());
		System.out.println("Edicao: "+ emp1.getemprestado().getedicao());
		System.out.println("Data emprestimo:" + emp1.getdmep() + " e a hora: " +emp1.gethora());
	}
}
