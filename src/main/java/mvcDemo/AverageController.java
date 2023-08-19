package mvcDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AverageController
 */
@WebServlet("/averageController")
public class AverageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		double firstNumber = Double.parseDouble(request.getParameter("firstNumber"));
		double secondNumber = Double.parseDouble(request.getParameter("secondNumber"));

		AverageCalculator averageObject = new AverageCalculator();
		double average = averageObject.calcuateAverage(firstNumber, secondNumber);
		request.setAttribute("num1", firstNumber);
		request.setAttribute("num2", secondNumber);
		request.setAttribute("result", average);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
	}

}
