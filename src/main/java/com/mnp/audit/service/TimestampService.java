package com.mnp.audit.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TimestampService {
	 public LocalDateTime now() {
	        return LocalDateTime.now(ZoneOffset.UTC);
	 }

}
