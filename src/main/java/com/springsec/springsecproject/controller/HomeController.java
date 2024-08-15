package com.springsec.springsecproject.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(HttpServletRequest request){
        return "Home page"+request.getSession().getId();
    }
    @GetMapping("/allproducts")
    public String allProducts(){
        return "AllProducts";
    }
    @GetMapping("/csrfToken")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
