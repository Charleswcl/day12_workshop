package sg.edu.iss.day12_workshop.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/home", "/index"})
public class HomeController {

    @GetMapping()
    public String home(Model model) {
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        String currentTime = date.toString();

        System.out.printf(">>the current time is %s\n", currentTime);
        
        // Add the time to model
        model.addAttribute("currTime", currentTime);
        // model.addAttribute("currTime", new Date().toString());
        
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));
        return "index";
    }

}
