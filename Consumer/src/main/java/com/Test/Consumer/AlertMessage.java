package com.Test.Consumer;

public class AlertMessage {
    private String bankCode;
    private String email;
    private String sms;
    private String phoneNumber;
    private String app;
    private String userId;

    // Constructors
    public AlertMessage() {}

    public AlertMessage(String bankCode, String email, String sms, String phoneNumber, String app, String userId) {
        this.bankCode = bankCode;
        this.email = email;
        this.sms = sms;
        this.phoneNumber = phoneNumber;
        this.app = app;
        this.userId = userId;
    }


    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "AlertMessage{" +
                "bankCode='" + bankCode + '\'' +
                ", email='" + email + '\'' +
                ", sms='" + sms + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", app='" + app + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
