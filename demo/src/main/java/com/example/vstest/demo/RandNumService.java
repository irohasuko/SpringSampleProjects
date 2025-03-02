package com.example.vstest.demo;

import org.springframework.stereotype.Service;

@Service
public class RandNumService {
    
    public int getRandNum(){
        return (int)(Math.random() * 100);
    }
}
