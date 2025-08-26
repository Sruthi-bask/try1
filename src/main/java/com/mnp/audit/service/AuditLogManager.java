package com.mnp.audit.service;

import com.mnp.audit.entity.AuditLog;
import com.mnp.audit.entity.PortRequest;
import com.mnp.audit.repository.AuditLogRepository;
import com.mnp.audit.repository.PortRequestRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuditLogManager {

    private final AuditLogRepository auditLogRepository;
    private final PortRequestRepository portRequestRepository;

    public AuditLogManager(AuditLogRepository auditLogRepository, PortRequestRepository portRequestRepository) {
        this.auditLogRepository = auditLogRepository;
        this.portRequestRepository = portRequestRepository;
    }
    public List<AuditLog> getLogsForRequest(Long requestId) {
        return auditLogRepository.findByPortRequest_RequestId(requestId);
    }


    public AuditLog logAction(Long requestId, String action) {
        // Fetch PortRequest using requestId
        PortRequest portRequest = portRequestRepository.findById(requestId)
                .orElseThrow(() -> new RuntimeException("PortRequest not found with id " + requestId));

        // Create AuditLog entry
        AuditLog log = new AuditLog(portRequest, action, LocalDateTime.now());
        return auditLogRepository.save(log);
    }
}
