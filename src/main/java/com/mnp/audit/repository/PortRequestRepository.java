package com.mnp.audit.repository;

import com.mnp.audit.entity.PortRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortRequestRepository extends JpaRepository<PortRequest, Long> {
}
