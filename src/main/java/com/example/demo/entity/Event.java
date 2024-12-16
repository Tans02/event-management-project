	package com.example.demo.entity;

	import jakarta.persistence.*;
	import java.sql.Date;
	import java.sql.Time;

	@Entity
	@Table(name = "events")
	public class Event {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String title;

	    @Column(columnDefinition = "TEXT")
	    private String description;

	    private Date date;

	    private Time time;

	    private String location;

	    @ManyToOne
	    @JoinColumn(name = "created_by")
	    private User createdBy;

	    private java.sql.Timestamp updatedAt;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Time getTime() {
			return time;
		}

		public void setTime(Time time) {
			this.time = time;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public User getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(User createdBy) {
			this.createdBy = createdBy;
		}

		public java.sql.Timestamp getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(java.sql.Timestamp updatedAt) {
			this.updatedAt = updatedAt;
		}

	    // Getters and Setters
}
