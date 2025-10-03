package handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.PrintTable;

@WebServlet("/printdb")
public class PrintDb extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tableName = req.getParameter("DBtoprint");
		
		ResultSet resultSet = PrintTable.displayAllRecords(tableName);
		try {
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			PrintWriter out = resp.getWriter();
			out.print("<div class=\"mainContainer\">");
			out.print("<table>");
//			headers
			out.print("<tr>");
			int count = resultSetMetaData.getColumnCount();
			for (int i = 1; i <= count; i++) {
				String header = resultSetMetaData.getColumnName(i);
				out.print("<th>"+header+"</th>");
			}
			out.print("</tr>");
			
//			records
			
			while(resultSet.next())
			{
				out.print("<tr>");
				for (int i = 1; i <= count; i++) {
					String columnData = resultSet.getString(i);
					out.print("<td>"+columnData+"</td>");
				}
				out.print("</tr>");
			}
			
			out.print("</table>");
			out.print("</div>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/Table.jsp");
			dispatcher.include(req, resp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	

}