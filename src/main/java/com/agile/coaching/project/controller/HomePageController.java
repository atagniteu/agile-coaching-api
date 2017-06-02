package com.agile.coaching.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



/**
 * Home page controller.
 *
 * @author muriel Tagueka
 * @since 31.05.2017
 */
@Controller
public class HomePageController {
	/**
     * TODO this is the main route to test the server.
     * TODO In a productive environment, this route should be deleted, disabled or redirected.
     */
    @GetMapping("/demo")
    String hello() {
        return "Bienvennue sur la page Agile Coaching!";
    }

}
