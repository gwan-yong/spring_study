package com.example.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

   /* @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }*/

    @GetMapping("/list")
    String list(Model model) {
        List<Item> result = itemRepository.findAll();
        //System.out.println(result);
        result.toString();
        model.addAttribute("data", result);
        return "list.html";
    }

    @GetMapping("/write")
    String write() {
        return "write.html";
    }

    /*@PostMapping("/add")
    String addPost(@RequestParam String title,
                   @RequestParam Integer price) {
        Item item = new Item();
        item.setTitle(title);
        item.setPrice(price);

        itemRepository.save(item);

        return "redirect:/list";
    }*/
    @PostMapping("/add")
    String addPost(@ModelAttribute Item item) {
        itemRepository.save(item);
        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")     //url 파라미터
    String detail(@PathVariable Long id, Model model) {
        Optional<Item> result = itemRepository.findById(id);
        if (result.isPresent()){
            Item item = result.get();
            model.addAttribute("data",result.get());
        }else {
            return "redirct :/list";
        }
        return "detail.html";
    }

}
