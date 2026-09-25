package com.example.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ScheduledController {

    private final ScheduledRepository scheduledRepository;

    @GetMapping("/scheduled")
    public String scheduled (Model model){
        List<Scheduled> scheduleds = scheduledRepository.findAll();
        scheduleds.toString();

        model.addAttribute("scheduled",scheduleds);
        return "scheduled.html";
    }

    @GetMapping("/writescheduled")
    public String writeScheduled(){
        return "writescheduled.html";
    }

    @PostMapping("/addscheduled")
    public String addScheduled(@ModelAttribute Scheduled scheduled){
        scheduledRepository.save(scheduled);
        return "redirect:/scheduled";
    }



}
