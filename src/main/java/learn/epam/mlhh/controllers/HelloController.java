package learn.epam.mlhh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@Controller
public class HelloController {
    private String message = "Form";
    //   private String message1 = "Search";

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home(Map<String, Object> model) {
        model.put("message", this.message);
        return "index";
    }
    @RequestMapping(value="/", method=RequestMethod.POST)
    public String homePost(Map<String, Object> model) {
        model.put("message", "Method Post");
       // return "search_page";
        return "post";
    }

    @RequestMapping(value="/search", method=RequestMethod.POST)
    public String searchPost(Map<String, Object> model) {
        model.put("message", "Method Post");
        return "search_page";
    }

}
