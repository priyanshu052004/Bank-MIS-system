package handler;

import java.io.IOException;
import java.io.PrintWriter;
import controller.CustomerController;
import model.CustomerEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.StateOfficeEntity;


@WebServlet("/add-customer-record")
public class AddCustomerHandler extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		CustomerEntity customerEntity = new CustomerEntity(req.getParameter("Customername"), req.getParameter("customerbalance"), req.getParameter("AccountNumber"), req.getParameter("customercontact"),req.getParameter("customerbid"));
//		CustomerController customerController = new CustomerController();
//		customerController.createCustomerRecord(customerEntity);
//		PrintWriter out = resp.getWriter();
//		out.write("Customer is created");
		
		
	
	}

}
