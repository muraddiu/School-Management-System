package com.model;

public class Student  {

    private String fName;
    private String lName;
    private String fatherName;
    private String motherName;
    private String mobile;
    private String eMail;
    private String birthDate;
    private String sex;
    private String sClass;
    private String roll;

    private String image;

    public Student() {
    }

    public Student(String fName, String lName, String fatherName, String motherName, String mobile, String eMail, String birthDate, String sex, String sClass, String roll, String image) {
        this.fName = fName;
        this.lName = lName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.mobile = mobile;
        this.eMail = eMail;
        this.birthDate = birthDate;
        this.sex = sex;
        this.sClass = sClass;
        this.roll = roll;
     
        this.image = image;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getFatherName() {
        return fatherName;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

  

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
}
