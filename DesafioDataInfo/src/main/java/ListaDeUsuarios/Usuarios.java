package ListaDeUsuarios;

public class Usuarios {

	private Long id;
	private String nome;
	private String telefone;
	private String email;

	public String getTelefone() {
		return telefone;
	}

	public void setDataNascimento(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}