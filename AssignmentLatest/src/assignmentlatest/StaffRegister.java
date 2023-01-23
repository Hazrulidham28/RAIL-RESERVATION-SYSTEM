/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentlatest;

/**
 *
 * @author Zerickha
 */
public class StaffRegister {
    private String staffName;
    private String staffID;
    private String staffEmail;
    private String staffPhoneNum;
    private String staffUsername;
    private String staffPassword;

    public StaffRegister(String staffName, String staffID, String staffEmail, String staffPhoneNum, String staffUsername, String staffPassword) {
        this.staffName = staffName;
        this.staffID = staffID;
        this.staffEmail = staffEmail;
        this.staffPhoneNum = staffPhoneNum;
        this.staffUsername = staffUsername;
        this.staffPassword = staffPassword;
    }

    StaffRegister() {
        
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffPhoneNum() {
        return staffPhoneNum;
    }

    public void setStaffPhoneNum(String staffPhoneNum) {
        this.staffPhoneNum = staffPhoneNum;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
