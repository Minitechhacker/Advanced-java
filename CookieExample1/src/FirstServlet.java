

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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
	    try{  
	    	  
	          
	        PrintWriter out = response.getWriter();  
	              
	        String username=request.getParameter("username");  
	        out.print("Welcome "+username);  
	      
	        Cookie ck=new Cookie("username",username);//creating cookie object  
	        response.addCookie(ck);//adding cookie in the response  
	      
	        //creating submit button  
	        out.print("<form action='SecondServlet'method='post'>");  
	        out.print("<input type='submit' value='go'>");  
	        out.print("</form>");  
	              
	        out.close();  
	      
	            }catch(Exception e){System.out.println(e);}  

		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
