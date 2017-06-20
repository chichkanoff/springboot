package io.demo.controller;

import io.demo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
    @Value("Super")
    private final Message message;

    @Autowired
    public AppController(Message message) {
        this.message = message;
    }


    // http:localhost:808/cat?name=Barsik
    @RequestMapping("/cat")
    public String catAction(@RequestParam(value = "name", required = false, defaultValue = "Barsik") String name, Model model){
        model.addAttribute("name", name + " " + message.getLastName());
        return "cat";
    }
}
