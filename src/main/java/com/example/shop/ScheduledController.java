package com.example.shop;


import org.springframework.web.bind.annotation.GetMapping;

public class ScheduledController {
    private ScheduledRepository scheduledRepository;

    @GetMapping("/scheduled")
    public String scheduled (){
        return "scheduled.html";
    }

}
