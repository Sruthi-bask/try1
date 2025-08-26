package com.mnp.audit.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "audit_log")
public class AuditLog {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "log_id")
	    private Long logId;

	    @Column(name = "action", nullable = false)
	    private String action;

	    // Foreign Key mapping to port_request table
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "request_id", referencedColumnName = "request_id", nullable = false)
	    private PortRequest portRequest;

	    @Column(name = "timestamp", nullable = false)
	    private LocalDateTime timestamp;

	    // Default constructor
	    public AuditLog() {}
	    public AuditLog(PortRequest portRequest, String action, LocalDateTime timestamp) {
	        this.portRequest = portRequest;
	        this.action = action;
	        this.timestamp = timestamp;
	    }

	    // Getters and Setters
	    public Long getLogId() {
	        return logId;
	    }

	    public void setLogId(Long logId) {
	        this.logId = logId;
	    }

	    public String getAction() {
	        return action;
	    }

	    public void setAction(String action) {
	        this.action = action;
	    }

	    public PortRequest getPortRequest() {
	        return portRequest;
	    }

	    public void setPortRequest(PortRequest portRequest) {
	        this.portRequest = portRequest;
	    }

	    public LocalDateTime getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(LocalDateTime timestamp) {
	        this.timestamp = timestamp;
	    }
	}

