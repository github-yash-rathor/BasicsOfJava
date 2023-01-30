package com.example.basicsofjava.Controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/c1" )
public class SpringRestCalls {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getCall() {
        return ResponseEntity.ok("This is a GET call");
    }

    @GetMapping(value =  "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  getCallwithPath(@PathVariable String id) {
        return ResponseEntity.ok("This is a GET call with id : " + id);
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> postCall() {
        return ResponseEntity.ok("This is a POST call");
    }

    @PutMapping (produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  putCall() {
        return ResponseEntity.ok("This is a PUT call");
    }

    @DeleteMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteCall() {
        return ResponseEntity.ok("This is a DELETE call");
    }
}
