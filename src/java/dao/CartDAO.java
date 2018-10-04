package dao;

import java.util.List;
import model.Cart;

public interface CartDAO {

    void insert( Cart c );
    
    
    List<Cart> getCart(String email);
    
    void updateAddressAndBilling(String email, String billingaddress, String shippingaddress);
    
    void deleteAllItemsByEmail( String email );
    void delete( int id );
    void delete ( String email);
    
    Cart getCart(String email, int productId);

    
    
    
}
