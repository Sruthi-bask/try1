package com.mnp.audit.controller;

import com.mnp.audit.entity.AuditLog;
import com.mnp.audit.service.AuditLogManager;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class AuditController {

    private final AuditLogManager auditLogManager;

    public AuditController(AuditLogManager auditLogManager) {
        this.auditLogManager = auditLogManager;
    }

    @PostMapping("/{requestId}")
    public AuditLog logAction(@PathVariable Long requestId, @RequestParam String action) {
        return auditLogManager.logAction(requestId, action);
    }

    @GetMapping("/{requestId}")
    public List<AuditLog> getAuditLogs(@PathVariable Long requestId) {
        return auditLogManager.getLogsForRequest(requestId);
    }
}

