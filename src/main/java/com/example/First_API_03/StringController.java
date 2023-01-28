package com.example.First_API_03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping(value = "/")
    public String getStrings(@RequestParam String string1, @RequestParam(required = false) String string2){

        String concat;
        if(string2 == null){
           concat = string1;
        } else concat = string1 + " " + string2;

        return concat;
    }

    /* In Postman inserire:
       - Una sola stringa >>>>   http://localhost:8080/?string1=FIRST
       - Due stringhe     >>>>   http://localhost:8080/?string1=FIRST&string2=SECOND    */
}