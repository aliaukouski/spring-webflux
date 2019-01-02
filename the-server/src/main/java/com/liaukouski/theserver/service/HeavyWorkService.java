package com.liaukouski.theserver.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
public class HeavyWorkService {

    public CompletableFuture<Integer> doHeavyWork() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(30_000);
            } catch (InterruptedException e) {
                log.error("Error", e);
            }
            return 10;
        });
    }
}
