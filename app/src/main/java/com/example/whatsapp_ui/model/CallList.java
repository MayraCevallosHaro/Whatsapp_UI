package com.example.whatsapp_ui.model;

public class CallList {
    private String userID;
    private String userName;
    private String date;
    private String urlProfile;
    private String callType;
    private String inout;
    private String acceptordeclined;
    public CallList() {
    }

    public CallList(String userID, String userName, String date, String urlProfile, String callType,String inout,String acceptordeclined) {
        this.userID = userID;
        this.userName = userName;
        this.date = date;
        this.urlProfile = urlProfile;
        this.callType = callType;
        this.inout = inout;
        this.acceptordeclined = acceptordeclined;

    }

    public String getAcceptordeclined() {
        return acceptordeclined;
    }

    public void setAcceptordeclined(String acceptordeclined) {
        this.acceptordeclined = acceptordeclined;
    }

    public String getInout() {
        return inout;
    }

    public void setInout(String inout) {
        this.inout = inout;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrlProfile() {
        return urlProfile;
    }

    public void setUrlProfile(String urlProfile) {
        this.urlProfile = urlProfile;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }
}
