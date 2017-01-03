package org.superbiz.struts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/addUserForm")
    public String addUserForm() {
        return "addUserForm";
    }
}
