package com.mnp.audit.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "port_request")
public class PortRequest {

    @Id
    @Column(name = "request_id")
    private Long requestId;

    @Column(name = "msisdn", nullable = false)
    private Long msisdn;

    @Column(name = "current_provider_id", nullable = false)
    private Integer currentProviderId;

    @Column(name = "recipient_provider_id", nullable = false)
    private Integer recipientProviderId;

    @Column(name = "request_date", nullable = false)
    private LocalDateTime requestDate;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "reason_code")
    private Integer reasonCode;

    @Column(name = "activation_date")
    private LocalDateTime activationDate;

    // Default constructor
    public PortRequest() {}

    // Getters and Setters
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Long msisdn) {
        this.msisdn = msisdn;
    }

    public Integer getCurrentProviderId() {
        return currentProviderId;
    }

    public void setCurrentProviderId(Integer currentProviderId) {
        this.currentProviderId = currentProviderId;
    }

    public Integer getRecipientProviderId() {
        return recipientProviderId;
    }

    public void setRecipientProviderId(Integer recipientProviderId) {
        this.recipientProviderId = recipientProviderId;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Integer reasonCode) {
        this.reasonCode = reasonCode;
    }

    public LocalDateTime getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(LocalDateTime activationDate) {
        this.activationDate = activationDate;
    }
}

