package ListaDeUsuarios;

public class UsuarioDOATest {
	
	public static void main(String[] args) throws Exception {
	    Usuarios usuarios = new Usuarios();
	    usuarios.setNome("Bento Goncalves");
	    usuarios.setEmail("bento@datainfo.com.br");

	   UsuarioDAO dao = new UsuarioDAO();
	    System.out.println("Salvando a pessoa: " + usuarios.getNome());
	    usuarios = dao.salvar(usuarios);

	    usuarios.setNome("Bento Goncalves");
	    usuarios = dao.salvar(usuarios);
	    System.out.println("Alterando a pessoa: " + usuarios.getNome());

	    Usuarios usuarios2 = dao.consultarPorId(usuarios.getId());
	    System.out.println("Consultando: " + usuarios2.getNome());

	    System.out.println("Removendo a pessoa: " + usuarios.getId());
	    dao.excluir(usuarios.getId());
	  }
	}


