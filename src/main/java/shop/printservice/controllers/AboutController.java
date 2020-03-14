package shop.printservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String getAboutModel(Model model) {
        model.addAttribute("info", "information");
        return "pages/about";
    }
}
