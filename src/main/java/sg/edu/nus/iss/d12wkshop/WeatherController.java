package sg.edu.nus.iss.d12wkshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = { "/weather" })
public class WeatherController {

    @GetMapping
    public String weather(
            @RequestParam(required = true) String city,
            @RequestParam(name = "units", defaultValue = "metrics") String units, Model model) {

        model.addAttribute("city", city);  //attribute name link to html
        model.addAttribute("units", units); //attribute name link to html

        //return the weather.html (view)
        return "weather";

    }
    @GetMapping("{city}")
    public String weather2(
            @PathVariable(required = true) String city,
            @RequestParam(name = "units", defaultValue = "kolimeters") String units, Model model) {

        model.addAttribute("city", city);  //attribute name link to html
        model.addAttribute("units", units); //attribute name link to html

        //return the weather.html (view)
        return "weather";
    }

}
