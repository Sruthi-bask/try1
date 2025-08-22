package com.mnp.audit.service;


import com.mnp.audit.entity.AuditLog;
import com.mnp.audit.repository.AuditLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogManager {
	 private final AuditLogRepository repository;
	    private final TimestampService timestampService;

	    public AuditLogManager(AuditLogRepository repository, TimestampService timestampService) {
	        this.repository = repository;
	        this.timestampService = timestampService;
	    }

	    public AuditLog logAction(Long requestId, String action) {
	        AuditLog log = AuditLog.builder()
	                .requestId(requestId)
	                .action(action)
	                .timestamp(timestampService.now())
	                .build();
	        return repository.save(log);
	    }

	    public List<AuditLog> getLogs(Long requestId) {
	        return repository.findByRequestId(requestId);
	    }

}
