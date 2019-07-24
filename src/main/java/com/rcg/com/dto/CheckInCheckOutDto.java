package com.rcg.com.dto;

import java.util.Date;
import java.util.Set;
import com.rcg.com.dao.AuthorizedRelation;
import com.rcg.com.dao.Language;
import com.rcg.com.dao.MedicalDetails;
import com.rcg.com.dao.YoungGust;
import com.rcg.com.dao.YoungGustNotes;

public class CheckInCheckOutDto 
{
	
	private int checkinCheckoutId;
	private int tagId;
	private String event;
	private Date entryTime;
	private Date exitTime;
	private YoungGustDto youngGust;
	private LanguageDto language;
	private String nickName;
	private String contactNumber;
	
	private Set<YoungGustNotesDto> youngGustNotes;
	private MedicalDetailsDto medicalDetails;
	private Set<AuthorizedRelationDto> autorizedRelation;
	
	private Date created;
	private Date updated;
	private int createdBy;
	private int updatedBy;
	private Boolean isActive;
	private boolean checkinStatus;
	private String guardianLocation;
	private String kidLocation;
	private String ageGroup;
	private String securePassword;
	private Boolean isSelfCheckout;

	
	public String getSecurePassword() {
		return securePassword;
	}
	public void setSecurePassword(String securePassword) {
		this.securePassword = securePassword;
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
	public YoungGustDto getYoungGust() {
		return youngGust;
	}
	public void setYoungGust(YoungGustDto youngGust) {
		this.youngGust = youngGust;
	}
	public LanguageDto getLanguage() {
		return language;
	}
	public void setLanguage(LanguageDto language) {
		this.language = language;
	}
	public Set<YoungGustNotesDto> getYoungGustNotes() {
		return youngGustNotes;
	}
	public void setYoungGustNotes(Set<YoungGustNotesDto> youngGustNotes) {
		this.youngGustNotes = youngGustNotes;
	}
	public MedicalDetailsDto getMedicalDetails() {
		return medicalDetails;
	}
	public void setMedicalDetails(MedicalDetailsDto medicalDetails) {
		this.medicalDetails = medicalDetails;
	}
	public Set<AuthorizedRelationDto> getAutorizedRelation() {
		return autorizedRelation;
	}
	public void setAutorizedRelation(Set<AuthorizedRelationDto> autorizedRelation) {
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
	
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public String getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
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

	public String getGuardianLocation() {
		return guardianLocation;
	}
	public void setGuardianLocation(String guardianLocation) {
		this.guardianLocation = guardianLocation;
	}
	public String getKidLocation() {
		return kidLocation;
	}
	public void setKidLocation(String kidLocation) {
		this.kidLocation = kidLocation;
	}
	public Boolean getIsSelfCheckout() {
		return isSelfCheckout;
	}
	public void setIsSelfCheckout(Boolean isSelfCheckout) {
		this.isSelfCheckout = isSelfCheckout;
	}

}
