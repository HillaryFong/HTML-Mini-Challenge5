package challenge.mini.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import challenge.mini.dto.Activity;
import challenge.mini.services.ActivityManager;

/**
 * Servlet implementation class PrevServlet
 */
@WebServlet("/Prev")
public class PrevServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrevServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("prevCount"));
		
	
		
		if(id == 1)
		{
			request.setAttribute("currVal", id);
			Activity currNote = new ActivityManager().getNote(id);
			request.setAttribute("currNote", currNote.getActivity());
		}else {
			request.setAttribute("currVal", id-1);
			Activity currNote = new ActivityManager().getNote(id);
			request.setAttribute("currNote", currNote.getActivity());
		}
		
		request.getRequestDispatcher("index.jsp").forward(request,  response);
	}

}
