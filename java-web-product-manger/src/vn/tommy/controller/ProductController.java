package vn.tommy.controller;

import vn.tommy.model.Product;
import vn.tommy.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/")
public class ProductController extends HttpServlet {
    ProductServiceImpl listProduct = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                detailProduct(request, response);
                break;
            default:
                viewProduct(request, response);
                break;
        }
    }


    private void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get list product
        List<Product> products = listProduct.findAll();
        request.setAttribute("products",products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/index.jsp");
        dispatcher.forward(request, response);
    }

    private void detailProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        Product product = listProduct.findById(productId);
        request.setAttribute("product", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/detail.jsp");
        dispatcher.forward(request, response);
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");
        double price = Double.parseDouble(request.getParameter("price"));

        // new Product
        Product product = new Product(name, price, description, producer);

        // ad new product
        listProduct.create(product);

        response.sendRedirect("/");
    }
}
