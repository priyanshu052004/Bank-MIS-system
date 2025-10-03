package handler;

import java.io.IOException;
import java.io.PrintWriter;

import controller.StateOfficeController;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.StateOfficeEntity;

@WebServlet("/delete-state-office")
public class DeleteStateOfficeAddress extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StateOfficeEntity stateOfficeEntity = new StateOfficeEntity();
		int id =  Integer.parseInt(req.getParameter("stateofficeID"));
		stateOfficeEntity.setsId(id);
		StateOfficeController stateOfficeController = new StateOfficeController();
		stateOfficeController.delete(stateOfficeEntity);
		PrintWriter out = resp.getWriter();
		out.write("<div class=\"mainContainer\">");
		out.write("<h1>State office Record deleted for ID " +id+" </h1>");
		out.write("</div>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/response.jsp");
		dispatcher.include(req, resp);
	}

	
}
