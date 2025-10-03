
package handler;

import java.io.IOException;
import java.io.PrintWriter;

import controller.StateOfficeController;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.StateOfficeEntity;

@WebServlet("/add-state-office")
public class AddStateOfficeHandler extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StateOfficeEntity stateOfficeEntity = new StateOfficeEntity(req.getParameter("stateofficeName"), req.getParameter("stateofficeAddress"), req.getParameter("stateofficePincode"), req.getParameter("stateofficeCity"));
//		System.out.println("data from frontend: "+stateOfficeEntity);
		StateOfficeController stateOfficeController = new StateOfficeController();
		stateOfficeController.createStateOffRecord(stateOfficeEntity);
		PrintWriter out = resp.getWriter();
		out.write("<div class=\"mainContainer\">");
		out.write("<h1>State office is created </h1>");
		out.write("</div>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/response.jsp");
		dispatcher.include(req, resp);
		
		
		
	}

}
