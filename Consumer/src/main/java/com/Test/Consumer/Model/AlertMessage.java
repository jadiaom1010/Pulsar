package com.Test.Consumer.Model;

public class AlertMessage {
    private String BankCode; // User Bank code.
    private String UserId; // Used ensuring correct user's ID for sending or storing details.
    private String Typeofuser;// New user / old user.
    private String  Portal; // Type of portal used CSR,AGP.
    private String SMS; // Kind of SMS sent, example forgot password.
    private String Email; // Kind of Email sent, example forgot password.
    private String Notification; // Kind of promotion notification.


    public AlertMessage() {
    }


    public AlertMessage(String BankCode, String UserId, String Typeofuser, String Portal, String SMS,String Email,String Notification) {
        this.BankCode = BankCode;
        this.UserId = UserId;
        this.Typeofuser = Typeofuser;
        this.Portal = Portal;
        this.SMS = SMS;
        this.Email = Email;
        this.Notification = Notification;
    }


    public String getBankCode() {
        return BankCode;
    }

    public void setBankCode(String BankCode) {
        this.BankCode = BankCode;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getTypeofuser() {
        return Typeofuser;
    }

    public void setTypeofuser(String Typeofuser) {
        this.Typeofuser = Typeofuser;
    }

    public String getPortal() {
        return Portal;
    }

    public void setPortal(String Portal) {
        this.Portal = Portal;
    }

    public String getSMS() {
        return SMS;
    }

    public void setSMS(String SMS) {
        this.SMS = SMS;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getNotification() {
        return Notification;
    }

    public void setNotification(String notification) {
        this.Notification = Notification;
    }
}