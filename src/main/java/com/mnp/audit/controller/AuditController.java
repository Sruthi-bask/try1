package com.mnp.audit.controller;

import com.mnp.audit.entity.AuditLog;
import com.mnp.audit.service.AuditLogManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class AuditController {
    private final AuditLogManager logManager;

    public AuditController(AuditLogManager logManager) {
        this.logManager = logManager;
    }

    @PostMapping("/{requestId}")
    public AuditLog addLog(@PathVariable Long requestId, @RequestParam String action) {
        return logManager.logAction(requestId, action);
    }

    @GetMapping("/{requestId}")
    public List<AuditLog> getLogs(@PathVariable Long requestId) {
        return logManager.getLogs(requestId);
    }

}
