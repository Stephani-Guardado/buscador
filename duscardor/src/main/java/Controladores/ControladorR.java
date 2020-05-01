package Controladores;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import duscardor.TbUsuariop;

/**
 * Servlet implementation class ControladorR
 */
public class ControladorR extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorR() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String nombre = request.getParameter("Nombre");
		String apellido = request.getParameter("apellido");
		String usuario = request.getParameter("Usuario");
		String contraseña = request.getParameter("contraseña");
		String dui = request.getParameter("dui");
		
		TbUsuariop u = new TbUsuariop();
		u.setNombre_usuario(nombre);
		u.setApellido_usuario(apellido);
		u.setUsuario(usuario);
		u.setContrasenia(contraseña);
		u.setDui(dui);
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("duscardor");		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.flush();
		em.getTransaction().commit();
		response.sendRedirect("bueno.jsp");	
	}

}
