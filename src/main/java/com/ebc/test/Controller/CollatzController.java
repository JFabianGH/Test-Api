package com.ebc.test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollatzController {
    @GetMapping("/collatz")
    public String getCollatzSequence(@RequestParam("number") int number) {
        StringBuilder sequence = new StringBuilder();
        int n = number;
        while (n != 1) {
            sequence.append(n).append(" -> ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        sequence.append(1); // Add the final value (1)
        return sequence.toString();
    }
}
