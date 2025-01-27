package com.example.demo2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Item;

@Controller
@RequestMapping("/each")
public class EachController {

      @RequestMapping("")
    public String index(Model model) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("えんぴつ", 120, "緑"));
        itemList.add(new Item("消しゴム", 100, "ホワイト"));
        itemList.add(new Item("ホチキス", 160, "シルバー"));
        // モデルにリストを追加
        model.addAttribute("itemList", itemList);
        return "each";
    }
}
