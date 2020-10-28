package lt.auba.getadvice.controller;

import lt.auba.getadvice.model.User;
import lt.auba.getadvice.repository.UserRepository;
import lt.auba.getadvice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/usersList")
    public String viewUserList(Model model) {
        List<User> usersList = userService.getAllUsers();
        model.addAttribute("usersList", usersList);
        return "index";
    }

//    @GetMapping("/usersList")
//    public String getUsers(Model model) {
//        List<User> users = (List<User>) userRepository.findAll();
//        model.addAttribute("users", users);
//        return "index";
//    }

}
