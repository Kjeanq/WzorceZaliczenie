package zaliczenie.projekt.wzorceProjektowe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String getLogin(Model model) {
        model.addAttribute("logowanie", "logowanie");

        return "login";
    }

}
