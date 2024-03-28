package web;

import java.io.IOException;
//import java.io.PrintWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IMC
 */
@WebServlet("/ImcServlet")
public class ImcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		        // Afficher les résultats
		try(PrintWriter out= response.getWriter()){
			String p = request.getParameter("poids");
			String t = request.getParameter("taille");
			double imc =Double.parseDouble(p)/(Double.parseDouble(t)*Double.parseDouble(t));
			 out.println("<!DOCTYPE html>");
			 out.println("<html>");
			 out.println("<head>");
			 out.println("<title> Servlet ImcServlet </title>");
			 out.println("</head>");
			 out.println("<body>");
			 out.println("poids "+ p +"<br>");
			 out.println("taille "+ t + "<br>");
			 out.println("IMC "+ imc + "<br>");
			 out.println("</body>");
			 out.println("</html>");


		}
		        
			 
	}

	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
