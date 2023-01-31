package com.example.calculator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @CrossOrigin
    @GetMapping(value = "/math/examples")
    public List<String> examples(){
        List<String> ex = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            StringBuilder example = new StringBuilder();
            int symbol = (int) (Math.random() * (3 + 1));
            int firstNum  = (int) (Math.random() * (1000 + 1));
            int secondNum = (int) (Math.random() * (1000 + 1));
            example.append(firstNum);
            switch (symbol) {
                case 0 -> example.append("+");
                case 1 -> example.append("-");
                case 2 -> example.append("/");
                case 3 -> example.append("*");
            }
            example.append(secondNum);
            ex.add(example.toString());
        }
        return ex;
    }
}
