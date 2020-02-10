package com.itheima.controller;


import com.itheima.bean.Items;
import com.itheima.service.ItemsService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class itemsController {
    @Autowired
    ItemsService itemsService;

    @RequestMapping("/finAll")
    public String finAll(Model model){
        List<Items> items = itemsService.finAll();
        model.addAttribute("items",items);
        return "items";
    }

    @RequestMapping("/save")
    public String save(Items items){
        int save = itemsService.save(items);
        System.out.println("save = " + save);
        return "redirect:/items/finAll";
    }
}
