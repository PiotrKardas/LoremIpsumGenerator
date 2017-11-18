package pl.LoremIpsumGenerator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoremIpsumController {

    @GetMapping("/")
    public String greetingForm(Model model) {
        LoremIpsumGenerator lrmIpsGnrt = new LoremIpsumGenerator();
        model.addAttribute("lorem1", lrmIpsGnrt);
        return "form";
    }

    @PostMapping("/")
    public String greetingSubmit(@ModelAttribute LoremIpsumGenerator loremIpsumGenerator) {
        return "after";
    }
}
