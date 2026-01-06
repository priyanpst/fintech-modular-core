package com.fintech.payments;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class PaymentService {

    @Transactional
    public void processTransfer(String accountId, Double amount) {
        log.info("Processing transfer for {} in a virtual thread", accountId);
        
        // Java 21 Virtual Threads for high-performance I/O
        Thread.startVirtualThread(() -> {
            log.info("Logging transaction audit trail asynchronously...");
        });
    }
}
