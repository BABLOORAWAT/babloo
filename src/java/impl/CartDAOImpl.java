
package impl;

import dao.ProductDAO;
import dao.CartDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.Cart;


public class CartDAOImpl implements CartDAO{

    @Override
    public void insert(Cart c) {
        String query = "insert into Cart (productId,qty,email)values(?,?,?)";
        try{
           Connection conn = config.Config.conn;
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setInt(1, c.getProductId());
            pstmt.setInt(2, c.getQty());
            pstmt.setString(3, c.getEmail());
            
            pstmt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public List<Cart> getCart(String email) {
        String query = "select * from Cart where email=?";
        
        List<Cart> cart = new ArrayList<>();
        ProductDAO pdao = new ProductDAOImpl();
        
        try{
            Connection conn = config.Config.conn;
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                Cart u = new Cart();
                
                u.setId(rs.getInt("id"));
                u.setEmail(rs.getString("email"));
                u.setProductId(rs.getInt("productId"));
                u.setQty(rs.getInt("qty"));
                u.setBillingaddress(rs.getString("Billingaddress"));
                u.setShippingaddress(rs.getString("Shippingaddress"));
                
                Product p = pdao.getProduct(u.getProductId());
                                                
                u.setProduct ( p );
                
                cart.add(u);
            }
            
            System.out.println(cart);
        }
        catch(Exception e){
           e.printStackTrace();
        }
        
        return cart;
    }

    @Override
    public void deleteAllItemsByEmail(String email) {
        String query = "delete from Cart where email = ?";
        try{
            Connection conn = config.Config.conn;
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Cart getCart(String email, int ProductId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        String query = "delete from Cart where id=?";
        try{
            Connection conn = config.Config.conn;
            PreparedStatement pstmt = conn. prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAddressAndBilling(String email, String billingaddress, String shippingaddress) {
     String query = "update Cart set billingaddress = ?, shippingaddress = ? where email = ?";
        
        System.out.println("email: " + email);
        System.out.println("shippingaddress: " + shippingaddress);
        System.out.println("billingaddress: " + billingaddress);
        
        try {
            Connection conn = config.Config.conn;

            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, shippingaddress);
            pstmt.setString(2, billingaddress);
            pstmt.setString(3, email);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    


    
    
}
