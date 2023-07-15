package com.example.Registration_Form.Controller;
import com.example.Registration_Form.Repository.UserRepository;
import com.example.Registration_Form.Entity.UserDtls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserRepository repo;

    @GetMapping("/Home")
    public String Home() {
        return "Home";
    }
    @GetMapping("/Register")
    public String Register() {
        return "Register";
    }

    @PostMapping("/Register/Save")
    public String Register(@ModelAttribute UserDtls u, HttpSession session) {
        System.out.println(u);
        repo.save(u);
        return "redirect:/";
    }

    @GetMapping("/Login")
    public String Login() {
        return "Login";
    }
    @PostMapping("/Login/Save")
    public String Login(@ModelAttribute UserDtls u, HttpSession session) {
        System.out.println(u);
        repo.save(u);
        return "redirect:/";
    }

}


