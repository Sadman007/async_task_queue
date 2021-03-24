package com.example.taskqueue;

import com.github.sonus21.rqueue.annotation.RqueueListener;
import org.springframework.stereotype.Component;

@Component

public class MessageListener {
    @RqueueListener(value = "${telco.request.queue.name}")
    public void postCDR(TelcoRequest telcoRequest) {
        System.out.println("TelcoRequest " + telcoRequest);
    }
    public static boolean isPrime(Integer num) {
        if(num < 2) return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    @RqueueListener(value = "primeGenQueueName")
    public void postPrimeGen(PrimeRequest primeRequest) {
        System.out.println("PrimeRequest " + primeRequest);
        int count = 0;
        for(int i = primeRequest.getFrom(); i <= primeRequest.getTo(); i++) {
            if (isPrime(i)) count++;
        }
        System.out.println("Total prime numbers from " + primeRequest.getFrom() + " to " + primeRequest.getTo() + " is " + count);
    }
}
