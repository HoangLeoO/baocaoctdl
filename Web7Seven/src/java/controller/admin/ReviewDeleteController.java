package controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ReviewService;
import service.impl.ReviewServicesImpl;

/**
 *
 * @author ACER
 */
public class ReviewDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ReviewService reviewService =  new ReviewServicesImpl();

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		reviewService.delete(Integer.parseInt(id));
		resp.sendRedirect(req.getContextPath() + "/admin/review/list");
	}

}
