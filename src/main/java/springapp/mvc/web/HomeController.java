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

  @RequestMapping(method = RequestMethod.GET)
  public String hello(ModelMap model) {
    model.addAttribute("message", "It works!");
    return "home";
  }
}