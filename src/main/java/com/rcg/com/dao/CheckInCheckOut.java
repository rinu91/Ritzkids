package com.rcg.com.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="ryg_checkin_checkout")
public class CheckInCheckOut 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="checkin_checkout_id")
	private int checkinCheckoutId;
	
	@Column(name="tag_id")
	private int tagId;
	
	private String event;
	
	@Column(name="entry_time")
	private Date entryTime;
	
	@Column(name="exit_time")
	private Date exitTime;
	
	
	@ManyToOne
	private YoungGust youngGust;
	
	@ManyToOne
	private Language language;
	
	@OneToMany(mappedBy = "checkinCheckout")
	@Column(name="young_gust_notes")
	private Set<YoungGustNotes> youngGustNotes;
	
	@OneToMany(mappedBy ="checkinCheckout")
	private Set<MedicalDetails> medicalDetails;
	
	@OneToMany(mappedBy = "checkinCheckout")
	private Set<AuthorizedRelation> autorizedRelation;
	
	
	private Date created;
	private Date updated;
	
	@Column(name="created_by")
	private int createdBy;
	
	@Column(name="updated_by")
	private int updatedBy;
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="checkin_status")
	private boolean checkinStatus;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	

	public CheckInCheckOut() 
	{
		super();
	}



	public CheckInCheckOut(int checkinCheckoutId,int tagId, YoungGust youngGust, Language language,
			 Set<AuthorizedRelation> autorizedRelation, int createdby) {
		super();
		this.checkinCheckoutId = checkinCheckoutId;
		this.tagId = tagId;
		this.youngGust = youngGust;
		this.language = language;
		this.autorizedRelation = autorizedRelation;
	}


	public CheckInCheckOut(int checkinCheckoutId) 
	{
		super();
		this.checkinCheckoutId = checkinCheckoutId;
	}


	public int getCheckinCheckoutId() {
		return checkinCheckoutId;
	}



	public void setCheckinCheckoutId(int checkinCheckoutId) {
		this.checkinCheckoutId = checkinCheckoutId;
	}



	public int getTagId() {
		return tagId;
	}



	public void setTagId(int tagId) {
		this.tagId = tagId;
	}



	public String getEvent() {
		return event;
	}



	public void setEvent(String event) {
		this.event = event;
	}



	public Date getEntryTime() {
		return entryTime;
	}



	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}



	public Date getExitTime() {
		return exitTime;
	}



	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}



	public YoungGust getYoungGust() {
		return youngGust;
	}



	public void setYoungGust(YoungGust youngGust) {
		this.youngGust = youngGust;
	}



	public Language getLanguage() {
		return language;
	}



	public void setLanguage(Language language) {
		this.language = language;
	}



	public Set<YoungGustNotes> getYoungGustNotes() {
		return youngGustNotes;
	}



	public void setYoungGustNotes(Set<YoungGustNotes> youngGustNotes) {
		this.youngGustNotes = youngGustNotes;
	}



	public Set<MedicalDetails> getMedicalDetails() {
		return medicalDetails;
	}



	public void setMedicalDetails(Set<MedicalDetails> medicalDetails) {
		this.medicalDetails = medicalDetails;
	}



	public Set<AuthorizedRelation> getAutorizedRelation() {
		return autorizedRelation;
	}



	public void setAutorizedRelation(Set<AuthorizedRelation> autorizedRelation) {
		this.autorizedRelation = autorizedRelation;
	}



	public Date getCreated() {
		return created;
	}



	public void setCreated(Date created) {
		this.created = created;
	}



	public Date getUpdated() {
		return updated;
	}



	public void setUpdated(Date updated) {
		this.updated = updated;
	}



	public int getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}



	public int getUpdatedBy() {
		return updatedBy;
	}



	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}



	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public String getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	public boolean isCheckinStatus() {
		return checkinStatus;
	}



	public void setCheckinStatus(boolean checkinStatus) {
		this.checkinStatus = checkinStatus;
	}

	
	
}