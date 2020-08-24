package com.example.testapp.controllers;
import com.example.testapp.utils.Logging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


@RestController
@RequestMapping("/java")
public class Controller {
    @Autowired
    Logging logging;

    @GetMapping("/sendData")
    public String logData() {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Howard");
        namesList.add("Camille");
        namesList.add("Tamra");
        namesList.add("Debora");
        namesList.add("Staci");
        namesList.add("Russell");
        namesList.add("Salas");
        namesList.add("Livingston");
        namesList.add("Raquel");
        int i = 1;
        while(i <= 800000) {
            Random ran = new Random();
            map.put("participantName", namesList.get(ran.nextInt(namesList.size())));
            map.put("participantEmail", namesList.get(ran.nextInt(namesList.size())) + "@gmial.com");
            logging.loggerInfo(map);
            i++;
        }
        return "Done";
    }
}
