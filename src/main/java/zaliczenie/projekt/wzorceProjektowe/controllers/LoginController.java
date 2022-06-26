package zaliczenie.projekt.wzorceProjektowe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import zaliczenie.projekt.wzorceProjektowe.backend.LoginBackend;
import zaliczenie.projekt.wzorceProjektowe.database.tables.User;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String getLogin( Model model) {
        return "login";
    }
    @RequestMapping(value = "/logowanie", method = RequestMethod.POST)
    public ModelAndView logging(@ModelAttribute User user) {

        return new ModelAndView();
    }

}
