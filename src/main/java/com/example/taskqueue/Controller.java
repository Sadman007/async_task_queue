package com.example.taskqueue;

import com.github.sonus21.rqueue.core.RqueueMessageEnqueuer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @Autowired
    private RqueueMessageEnqueuer rqueueMessageEnqueuer;
    @Value("${telco.request.queue.name}")
    private String telcoRequestQueueName;

    /// date format: timestamp
    @GetMapping("cdr")
    public String postCDR(@RequestParam String MSISDN, @RequestParam String startDate, @RequestParam String endDate) {
        System.out.println("CDR Request Proccessing...");
        rqueueMessageEnqueuer.enqueue(telcoRequestQueueName, new TelcoRequest(MSISDN, startDate, endDate));
        return "CDR Request processing done.";
    }

    /// prime limit
    @GetMapping("prime")
    public String postPrimeGen(@RequestParam Integer from, @RequestParam Integer to) {
        System.out.println("Prime Request Proccessing...");
        rqueueMessageEnqueuer.enqueue("primeGenQueueName", new PrimeRequest(from, to));
        return "Prime Gen Request processing done.";
    }
}
