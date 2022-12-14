package com.example.server.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public interface RecordsFigenService {
    void send();
    void getState();
}
