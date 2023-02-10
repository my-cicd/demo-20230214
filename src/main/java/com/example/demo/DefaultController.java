package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DefaultController {
    @GetMapping(value="/")
    public Message index() {
        String name = "your name";
        return new Message(1, "Hello " + name + " new2");
    }

    // vulnerable code sample
    @GetMapping(value="/{name}")
    public String hello(@PathVariable("name") String name) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        Process p = r.exec(name);
        p.waitFor();
        p.destroy();
        return null;
    }
}
