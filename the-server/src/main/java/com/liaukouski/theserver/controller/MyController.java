package com.liaukouski.theserver.controller;

import com.liaukouski.theserver.service.HeavyWorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequiredArgsConstructor
public class MyController {

    private final HeavyWorkService service;

    @GetMapping("do")
    public CompletableFuture<Integer> getSmth() {
        return service.doHeavyWork();
    }
}
