package sg.edu.nus.iss.d12wkshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/indexresource","/indexresouce.html"})
public class IndexResource {

    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        return "index"
    }
    
}
