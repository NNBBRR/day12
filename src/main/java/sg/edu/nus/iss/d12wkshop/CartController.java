package sg.edu.nus.iss.d12wkshop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/cart"})

public class CartController {

    @GetMapping(produces = {"text/html"}) 
        public String displayCart(Model model) {
        CartService cs = new CartService();    
        List<Item> cartItems = cs.getCart();
        model.addAttribute("cartItems", cartItems); //attribute name link to html
     
        //return the cart.html (view)
        return "cart";

    }

    @GetMapping("{itemname}") 
        public String filterdCart(
        @PathVariable (name="itemname" , required=true) String itemname,
        Model model) {
        CartService cs = new CartService();    
        List<Item> cartItems = cs.getCart();

        List<Item> filteredItems = new ArrayList<>();
        for (Item s : cartItems) {
            if (s.getItemName().contains(itemname)) {
                filteredItems.add(s);
            }
        }
       
        model.addAttribute("cartItems", filteredItems); //attribute name link to html
     
        //return the cart.html (view)
        return "cart";


    }
}
