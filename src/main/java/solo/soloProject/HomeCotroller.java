package solo.soloProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCotroller {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("data","home");
        return "home";
    }
}
