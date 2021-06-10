package controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Locale;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/translate")
    public String translate() {
        return "/translate";
    }

    @PostMapping("/translate")
    public String translate(String word, ModelMap modelMap) {
        modelMap.put("hello", "Xin chao");
        modelMap.put("goodbye", "Tam biet");
        modelMap.put("dog", "Con cho");
        modelMap.put("cat", "Con meo");
        modelMap.put("today", "Ngay hom nay");

        word = word.toLowerCase(Locale.ROOT);
        String result = (String) modelMap.get(word);
        String error = "";

        if (result == null) {
            error = "Khong tim thay!";
        } else {
            modelMap.addAttribute("word", word);
            modelMap.addAttribute("result", result);
        }
        modelMap.addAttribute("error", error);
        return "/translate";
    }
}
