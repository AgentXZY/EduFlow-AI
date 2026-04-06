package com.vinam.edunotes_backend;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Notes {

	@Id
	@GeneratedValue
	private Integer id;

	private Integer UserId;
	public String title;
	public String content;
	private String original_file_url;
	private String ai_processed_url;
	public LocalDateTime created_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOriginal_file_url() {
		return original_file_url;
	}

	public void setOriginal_file_url(String original_file_url) {
		this.original_file_url = original_file_url;
	}

	public String getAi_processed_url() {
		return ai_processed_url;
	}

	public void setAi_processed_url(String ai_processed_url) {
		this.ai_processed_url = ai_processed_url;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

}
