package com.codebyamir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, unique = true)
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message = "Please provide an e-mail")
	private String email;

	private String phone;

	@Transient
	private String password;

	@NotEmpty(message = "Please provide your name")
	private String name;

	@NotEmpty(message = "Please provide your name in Bengali")
	private String nameBangla;

	@NotEmpty(message = "Please Enter your occupation")
	private String occupation;

	@NotEmpty(message = "Please Enter your Pay Scale")
	private String payscale;

	@NotEmpty(message = "Please Enter Current Work Place")
	private String currentWorkplace;

	@NotEmpty(message = "Please Enter Current Work Place")
	private String fatherName;

	@NotEmpty(message = "Please Enter Current Work Place")
	private String motherName;

	@NotEmpty(message = "Please Enter Current Work Place")
	private String presentAddress;


	@NotEmpty(message = "Please Enter Permanent Address")
	private String permanentAddress;

	@NotEmpty(message = "Please Enter Religion")
	private String religion;

	@NotEmpty(message = "Please Enter Sex")
	private String sex;

	@NotEmpty(message = "Please Enter Marrital Status")
	private String mStatus;

	@NotEmpty(message = "Please Enter National ID No")
	private String NID;

	private String TIN;



	@NotEmpty(message = "Please Enter Date of Birth")
	private String dob;

	@NotEmpty(message = "Please Enter PRL Date")
	private String prlDate;

	@NotEmpty(message = "Please Enter Posting Status")
	private String postingStatus;

	@NotEmpty(message = "Please Enter Posted As")
	private String postedAs;

	@NotEmpty(message = "Please Enter Post ID")
	private String postId;

	private String HRISId;

	private String codeNo;

	private String bcsBatchNo;

	private String noStudyDept;

	private String originalDesignation;

	private String acrAvailability;

	private String profDiscipline;

	private String profCategory;

	private String jobStatus;

	private String tribe;

	private String isFreedomFighter;

	private String isLiveGovtQuarter;

	private String jdHealthService;

	private String jdCurrentPlace;

	private String jdCurrentDesignation;

	private String currentBasicPay;

	private String lastDesignation;

	private String lastGoNo;

	private String lastsSerialNo;

	private String lastPromoDate;

	private String bcsGo;

	private String bcsSerialNo;

	private String bcsDate;

	private String istSerialNo;

	private String istGo;

	private String istDate;

	private String serviceGo;

	private String serviceGoDate;

	private String serviceSerialNo;

	private String serviceDate;

	private String appointmentGo;

	private String appointmentSerialNo;

	private String appointmentDate;

	private String isSeniorScalePass;

	private String isVillageExp;

	private String mbbsYear;

	private String hscYear;

	private String sscYear;

	private boolean enabled;

	private String confirmationToken;

	public String getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getFatherName() {
		return fatherName;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean value) {
		this.enabled = value;
	}


	public String getNameBangla() {
		return nameBangla;
	}

	public void setNameBangla(String nameBangla) {
		this.nameBangla = nameBangla;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPayscale() {
		return payscale;
	}

	public void setPayscale(String payscale) {
		this.payscale = payscale;
	}

	public String getCurrentWorkplace() {
		return currentWorkplace;
	}

	public void setCurrentWorkplace(String currentWorkplace) {
		this.currentWorkplace = currentWorkplace;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getmStatus() {
		return mStatus;
	}

	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}

	public String getNID() {
		return NID;
	}

	public void setNID(String NID) {
		this.NID = NID;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPrlDate() {
		return prlDate;
	}

	public void setPrlDate(String prlDate) {
		this.prlDate = prlDate;
	}

	public String getPostingStatus() {
		return postingStatus;
	}

	public void setPostingStatus(String status) {
		this.postingStatus = status;
	}

	public String getPostedAs() {
		return postedAs;
	}

	public void setPostedAs(String postedAs) {
		this.postedAs = postedAs;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

	public String getBcsBatchNo() {
		return bcsBatchNo;
	}

	public void setBcsBatchNo(String bcsBatchNo) {
		this.bcsBatchNo = bcsBatchNo;
	}

	public String getNoStudyDept() {
		return noStudyDept;
	}

	public void setNoStudyDept(String noStudyDept) {
		this.noStudyDept = noStudyDept;
	}

	public String getOriginalDesignation() {
		return originalDesignation;
	}

	public void setOriginalDesignation(String originalDesignation) {
		this.originalDesignation = originalDesignation;
	}

	public String getAcrAvailability() {
		return acrAvailability;
	}

	public void setAcrAvailability(String acrAvailability) {
		this.acrAvailability = acrAvailability;
	}

	public String getProfDiscipline() {
		return profDiscipline;
	}

	public void setProfDiscipline(String profDiscipline) {
		this.profDiscipline = profDiscipline;
	}

	public String getProfCategory() {
		return profCategory;
	}

	public void setProfCategory(String profCategory) {
		this.profCategory = profCategory;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getTribe() {
		return tribe;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	}

	public String getIsFreedomFighter() {
		return isFreedomFighter;
	}

	public void setIsFreedomFighter(String isFreedomFighter) {
		this.isFreedomFighter = isFreedomFighter;
	}

	public String getIsLiveGovtQuarter() {
		return isLiveGovtQuarter;
	}

	public void setIsLiveGovtQuarter(String isLiveGovtQuarter) {
		this.isLiveGovtQuarter = isLiveGovtQuarter;
	}

	public String getJdHealthService() {
		return jdHealthService;
	}

	public void setJdHealthService(String jdHealthService) {
		this.jdHealthService = jdHealthService;
	}

	public String getJdCurrentDesignation() {
		return jdCurrentDesignation;
	}

	public void setJdCurrentDesignation(String jdCurrentDesignation) {
		this.jdCurrentDesignation = jdCurrentDesignation;
	}

	public String getCurrentBasicPay() {
		return currentBasicPay;
	}

	public void setCurrentBasicPay(String currentBasicPay) {
		this.currentBasicPay = currentBasicPay;
	}

	public String getJdCurrentPlace() {
		return jdCurrentPlace;
	}

	public void setJdCurrentPlace(String jdCurrentPlace) {
		this.jdCurrentPlace = jdCurrentPlace;
	}

	public String getLastDesignation() {
		return lastDesignation;
	}

	public void setLastDesignation(String lastDesignation) {
		this.lastDesignation = lastDesignation;
	}

	public String getLastGoNo() {
		return lastGoNo;
	}

	public void setLastGoNo(String lastGoNo) {
		this.lastGoNo = lastGoNo;
	}

	public String getLastsSerialNo() {
		return lastsSerialNo;
	}

	public void setLastsSerialNo(String lastsSerialNo) {
		this.lastsSerialNo = lastsSerialNo;
	}

	public String getLastPromoDate() {
		return lastPromoDate;
	}

	public void setLastPromoDate(String lastPromoDate) {
		this.lastPromoDate = lastPromoDate;
	}

	public String getBcsGo() {
		return bcsGo;
	}

	public void setBcsGo(String bcsGo) {
		this.bcsGo = bcsGo;
	}

	public String getBcsSerialNo() {
		return bcsSerialNo;
	}

	public void setBcsSerialNo(String bcsSerialNo) {
		this.bcsSerialNo = bcsSerialNo;
	}

	public String getBcsDate() {
		return bcsDate;
	}

	public void setBcsDate(String bcsDate) {
		this.bcsDate = bcsDate;
	}

	public String getIstSerialNo() {
		return istSerialNo;
	}

	public void setIstSerialNo(String istSerialNo) {
		this.istSerialNo = istSerialNo;
	}

	public String getIstGo() {
		return istGo;
	}

	public void setIstGo(String istGo) {
		this.istGo = istGo;
	}

	public String getIstDate() {
		return istDate;
	}

	public void setIstDate(String istDate) {
		this.istDate = istDate;
	}

	public String getServiceGo() {
		return serviceGo;
	}

	public void setServiceGo(String serviceGo) {
		this.serviceGo = serviceGo;
	}

	public String getServiceGoDate() {
		return serviceGoDate;
	}

	public void setServiceGoDate(String serviceGoDate) {
		this.serviceGoDate = serviceGoDate;
	}

	public String getServiceSerialNo() {
		return serviceSerialNo;
	}

	public void setServiceSerialNo(String serviceSerialNo) {
		this.serviceSerialNo = serviceSerialNo;
	}

	public String getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	public String getAppointmentGo() {
		return appointmentGo;
	}

	public void setAppointmentGo(String appointmentGo) {
		this.appointmentGo = appointmentGo;
	}

	public String getAppointmentSerialNo() {
		return appointmentSerialNo;
	}

	public void setAppointmentSerialNo(String appointmentSerialNo) {
		this.appointmentSerialNo = appointmentSerialNo;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getIsSeniorScalePass() {
		return isSeniorScalePass;
	}

	public void setIsSeniorScalePass(String isSeniorScalePass) {
		this.isSeniorScalePass = isSeniorScalePass;
	}

	public String getIsVillageExp() {
		return isVillageExp;
	}

	public void setIsVillageExp(String isVillageExp) {
		this.isVillageExp = isVillageExp;
	}

	public String getMbbsYear() {
		return mbbsYear;
	}

	public void setMbbsYear(String mbbsYear) {
		this.mbbsYear = mbbsYear;
	}

	public String getHscYear() {
		return hscYear;
	}

	public void setHscYear(String hscYear) {
		this.hscYear = hscYear;
	}

	public String getSscYear() {
		return sscYear;
	}

	public void setSscYear(String sscYear) {
		this.sscYear = sscYear;
	}

	public String getTIN() {
		return TIN;
	}

	public void setTIN(String TIN) {
		this.TIN = TIN;
	}

	public String getHRISId() {
		return HRISId;
	}

	public void setHRISId(String HRISId) {
		this.HRISId = HRISId;
	}
}