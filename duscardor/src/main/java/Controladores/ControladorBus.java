package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
/**
 * Servlet implementation class ControladorBus
 */
public class ControladorBus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorBus() {
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
		try {
			String dui = request.getParameter("CAJA");
			System.out.println(dui);
			 duscardor.TbUsuariop u = new duscardor.TbUsuariop();
			 buscadoresDao.BuscaDao d = new buscadoresDao.BuscaDao();  
			 u.setDui(dui);
			
					Gson json = new Gson();
					response.getWriter().append(json.toJson(d.buscar(u)));
				} catch (Exception e) {
					System.out.println("Error3" + e);
				}
	
	}

}
