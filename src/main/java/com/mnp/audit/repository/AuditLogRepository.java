package com.mnp.audit.repository;

import com.mnp.audit.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
    List<AuditLog> findByPortRequest_RequestId(Long requestId);
}
