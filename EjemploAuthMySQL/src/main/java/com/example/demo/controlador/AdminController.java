package com.example.demo.controlador;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
    @GetMapping("/home")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin() {
        return "auth/admin/home"; // Muestra la página específica del administrador (admin.html)
    }
    
}
