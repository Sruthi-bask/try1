package com.mnp.audit.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "audit_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AuditLog {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "log_id")
	    private Long logId;

	    private String action;

	    @Column(name = "request_id")
	    private Long requestId;

	    private LocalDateTime timestamp;

		public static Object builder() {
			// TODO Auto-generated method stub
			return null;
		}
	}


}
