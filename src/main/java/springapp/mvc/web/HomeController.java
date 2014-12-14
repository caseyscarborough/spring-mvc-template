package springapp.mvc.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

  private static final Logger log = Logger.getLogger(HomeController.class);
  private static final String viewDirectory = "home/";

  @RequestMapping(method = RequestMethod.GET)
  public String home(ModelMap model) {
    model.addAttribute("message", "It works!");
    return viewDirectory + "home";
  }
}