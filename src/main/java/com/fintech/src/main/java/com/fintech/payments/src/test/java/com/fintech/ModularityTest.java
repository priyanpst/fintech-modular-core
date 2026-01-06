package com.fintech;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModularityTest {
    @Test
    void verifyModularity() {
        // This test ensures modules (like payments) don't have messy dependencies.
        ApplicationModules.of(FintechApplication.class).verify();
    }
}
