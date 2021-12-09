package inc.monster.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping
    public String index(HttpServletRequest httpServletRequest, Model model) {
        System.out.println("httpServletRequest.getRequestURI() = " + httpServletRequest.getRequestURI());
        System.out.println("httpServletRequest.getRemoteHost() = " + httpServletRequest.getRemoteHost());
        model.addAttribute("IwasHere", "Spring");
        return "index";
    }

    @GetMapping("noview")
    public String noview() {
        return "viewGibtEsNicht";
    }
}
