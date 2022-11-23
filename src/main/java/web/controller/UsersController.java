package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.DAO.UserDAO;
import web.Model.User;

@Controller
@RequestMapping   ("/users")
public class UsersController {

    private final UserDAO userDAO;

    @Autowired
    public UsersController(UserDAO userDAO) {
       this.userDAO = userDAO;
    }

    @GetMapping ()
    public String allUsers(Model model){
        model.addAttribute("all", userDAO.allUserDAO());
        return "users";
    }

    @GetMapping("/{id}")
    public String showById(@PathVariable("id") int id,Model model  ){
        model.addAttribute("findForId", userDAO.showById(id));
        return "showById";
    }
    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("newAdd", new User());
        return "users/new";
    }
 //   @PostMapping()
    public String create(@ModelAttribute("newAdd") User user){
        userDAO.save(user);
        return "redirect:/users";
    }
}