package model;
/* JavaBeans é uma classe Java com especificações
 * (objetivo principal : Segurança) isolando e encapsulando os dados
 * 
 * Ou seja, salva dados num fluxo para posterior requisição
*/ 

public class JavaBeans {
	private String idcon;
	private String nome;
	private String fone;
	private String email;
	
	
	public JavaBeans() {
		super();
	
	}
	
	public JavaBeans(String idcon, String nome, String fone, String email) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	public String getIdcon() {
		return idcon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
