package sg.edu.nus.iss.d12wkshop;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    public List<Item> getCart() {

        List<Item> listItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Prada Bag");
        itm.setQuantity(10);
        listItems.add(itm);

        itm = new Item();
        itm.setItemName("Macbook Pro");
        itm.setQuantity(10);
        listItems.add(itm);

        
        //model.addAttribute("cart", cartItems); 
        return listItems; 
    }
    
}
