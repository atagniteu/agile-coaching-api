package com.agile.coaching.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Home start page controller.
 *
 * @author muriel Tagueka
 * @since 31.05.2017
 */

@Controller
public class HomeController {
	
	@RequestMapping("/home")
    public String home() {
        return "home";
    }

}
