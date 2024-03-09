package com.ebc.test.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CollatzController {
    @GetMapping("/collatz")
    public String getCollatzSequence(@RequestParam int number) {
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

    @PutMapping("/api/sequence/collatz/{input}")
    public ResponseEntity<String> putCollatzSequence(@PathVariable("input") int input){
        StringBuilder sequence = new StringBuilder();
        int n = input;
        while (n != 1) {
            sequence.append(n).append(" -> ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        sequence.append(1);
        String jsonResult = "{\"sequence\": \"" + sequence.toString() + "\"}";
        return new ResponseEntity<>(jsonResult, HttpStatus.OK);
    }
}
