package it.gp.springsec2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/users/page1")
    public String getUserPage1() {
        return "/users/page1";
    }

    @GetMapping("/users/page2")
    public String getUserPage2() {
        return "/users/page2";
    }

    @GetMapping("/admin")
    public String getAdminPage() {
        return "/admin/admin_page";
    }
}
