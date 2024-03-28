package web;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IMC
 */
@WebServlet("/IMC")
public class IMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IMC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 double weight = Double.parseDouble(request.getParameter("weight"));
	        double height = Double.parseDouble(request.getParameter("height"));
		        double imc = weight/ (height*height);
		        
		        // Afficher les résultats
		        response.setContentType("text/html");
		        response.getWriter().println("<html><head><title>Résultats de l'IMC</title></head><body>");
		        response.getWriter().println("<h2>Résultats de l'IMC :</h2>");
		        response.getWriter().println("<p>Poids: " + weight + " kg</p>");
		        response.getWriter().println("<p>Taille: " + height + " m</p>");
		        response.getWriter().println("<p>IMC: " + imc + "</p>");
		        response.getWriter().println("</body></html>");
			 
	}

	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
