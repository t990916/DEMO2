package com.example.demo2.Controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domain.Questionnaire;
import com.example.demo2.form.Ex17QuestionnaireForm;



@Controller
@RequestMapping("/questionnaire")
public class Ex17QuestionnaireController {


    @ModelAttribute
    public Ex17QuestionnaireForm setUpForm(){
        return new Ex17QuestionnaireForm();
    }

    @RequestMapping("")
    public String index(Model model) {

    Map<Integer, String> hobbyMap = new LinkedHashMap<>();
    hobbyMap.put(1, "野球");
    hobbyMap.put(2, "サッカー");
    hobbyMap.put(3, "テニス");
    model.addAttribute("hobbyMap", hobbyMap);
    return "user2/ex-17-input";
    }

    @RequestMapping("/create2")
    public String create2(
        Ex17QuestionnaireForm form,
        RedirectAttributes redirectAttributes
    ) {
        Questionnaire questionnaire = new Questionnaire();
        BeanUtils.copyProperties(form, questionnaire);
    
        List<String> hobbyList = new ArrayList<>();
        for (String hobbyCode : form.getHobbyList()) {
            switch (hobbyCode) {
                case "1":
                    hobbyList.add("野球");
                    break;
                case "2":
                    hobbyList.add("サッカー");
                    break;
                case "3":
                    hobbyList.add("テニス");
                    break;
            }
        }
        questionnaire.setHobbyList(hobbyList);
        
    
        redirectAttributes.addFlashAttribute("questionnaire", questionnaire);
    
        return "redirect:/questionnaire/toresult2";
    }

    @RequestMapping("/toresult2")
    public String toresult2() {
        return "user2/ex-17-result";
    }
}
