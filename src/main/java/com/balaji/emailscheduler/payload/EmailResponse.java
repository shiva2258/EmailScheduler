package com.balaji.emailscheduler.payload;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
@ToString
public class EmailResponse {
	
	private boolean success;
	
	private String jobId;
	
	private String jobGroup;
	
	private String message;
	
	public EmailResponse(boolean success, String message) {
		this.success = success;
		this.message = message;
	}
	
	public EmailResponse(boolean success, String jobId, String jobGroup, String message) {
		this.success = success;
		this.jobId = jobId;
		this.jobGroup = jobGroup;
		this.message = message;
	}

}
