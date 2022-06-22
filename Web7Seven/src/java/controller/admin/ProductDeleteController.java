package controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ProductService;
import service.impl.ProductServiceImpl;

//@WebServlet(urlPatterns = { "/admin/cate/delete" })

/**
 *
 * @author ACER
 */
public class ProductDeleteController extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    ProductService productService = new ProductServiceImpl();

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
        productService.delete(id);
        resp.sendRedirect(req.getContextPath() + "/admin/product/list");
    }

}
