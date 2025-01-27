package com.example.demo2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.User;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/ex-16")
public class Ex16Controller {

    @Autowired
    private ServletContext application;

    @RequestMapping("")
    public String index() {
        @SuppressWarnings("unchecked")//ArryListの警告を無視する
        List<User> nameList = (List<User>) application.getAttribute("nameList");
        if (nameList == null) {
            nameList = new ArrayList<>();
            application.setAttribute("nameList", nameList);
        }
        return "ex-16";
    }

    @RequestMapping("/post")
    public String post(String name, String comment) {
        @SuppressWarnings("unchecked")//ArryListの警告を無視する
        List<User> nameList = (List<User>) application.getAttribute("nameList");
        nameList.add(0, new User(name, comment));
        return "ex-16";
    }
}