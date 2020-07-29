package com.angryman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/com/angryman/{sampleText}")
    public String sample(@PathVariable final String sampleText) {
        return String.format("sampleText : %s", sampleText);
    }
}
