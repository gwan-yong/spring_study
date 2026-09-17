package com.example.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeRepository noticeRepository;

    @GetMapping("/notice")
    public String notice(Model model) {

        List<Notice> noticeList = noticeRepository.findAll();
        noticeList.toString();

        model.addAttribute("notice", noticeList);
        return "notice.html";
    }

    public String addNotice()
}
