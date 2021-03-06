package com.igeek.ebuy.manager.controller;


import com.igeek.ebuy.pojo.TbItem;
import com.igeek.ebuy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {


    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem queryById(@PathVariable long itemId){
//        Springmvc 会自动讲对象转化为json， 因为配置了Responsebody
        return itemService.queryById(itemId);
    }

}
