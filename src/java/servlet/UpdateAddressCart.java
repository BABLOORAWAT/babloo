/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.CartDAO;
import impl.CartDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name= "UpdateAddressCart", urlPatterns = { "/UpdateAddressCart"})
public class UpdateAddressCart extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    String email = req.getParameter("email");
        String billingaddress = req.getParameter("billingaddress");
        String shippingaddress = req.getParameter("shippingaddress");
        
        CartDAO cdao = new CartDAOImpl();
        
        cdao.updateAddressAndBilling(email, billingaddress, shippingaddress);
        
        resp.sendRedirect("Checkout.jsp?email=" + email);
        
    }

    
}
