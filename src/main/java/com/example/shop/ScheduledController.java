package com.example.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ScheduledController {
    private final ScheduledRepository scheduledRepository;

    @GetMapping("/scheduled")
    public String scheduled(Model model) {
        List<Scheduled> scheduleds = scheduledRepository.findAll();

        model.addAttribute("scheduled",scheduleds);
        return "scheduled.html";
    }
}
