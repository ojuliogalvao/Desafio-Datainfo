package ListaDeUsuarios;

import java.util.List;

public class UsuarioDAO {
	
	  private EntityManager getEntityManager() {
	    EntityManagerFactory factory = null;
	    EntityManager entityManager = null;
	    try {
	      
	      factory = Persistence.createEntityManagerFactory("ExemplosJPAPU");
	     
	      entityManager = factory.createEntityManager();
	     
	    } finally {
	      factory.close();
	    }
	    return entityManager;
	  }

	  
	  public Usuarios salvar(Usuarios usuarios) throws Exception {
	    EntityManager entityManager = getEntityManager();
	    try {
	      
	      entityManager.getTransaction().begin();
	      System.out.println("Salvando a pessoa.");
	      
	      if(usuarios.getId() == null) {
	        
	        entityManager.persist(usuarios);
	      } else {
	       
	    	  usuarios = entityManager.merge(usuarios);
	      }
	    
	      entityManager.getTransaction().commit();
	    } finally {
	      entityManager.close();
	    }
	    return usuarios;
	  }

	 
	  public void excluir(Long id) {
	    EntityManager entityManager = getEntityManager();
	    try {
	      
	      entityManager.getTransaction().begin();
	     
	      Usuarios pessoa = entityManager.find(Usuarios.class, id);
	      System.out.println("Excluindo os dados de: " + pessoa.getNome());
	    
	      entityManager.remove(pessoa);
	 
	      entityManager.getTransaction().commit();
	    } finally {
	      entityManager.close();
	    }
	  }

	
	  public Usuarios consultarPorId(Long id) {
	    EntityManager entityManager = getEntityManager();
	    Usuarios usuarios = null;
	    try {
	      usuarios = entityManager.find(Usuarios.class, id);
	    } finally {
	      entityManager.close();
	    }
	    return usuarios;
	  }


	public static List<nUsuarios> TodosUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}
	}

