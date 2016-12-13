
package model;

public class User {

    private long UserID;
    private String UserName;
    private String UserPass;
    private String UserEmail;

    public User() {
    }

    public User(long UserID, String UserName, String UserPass, String UserEmail) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.UserPass = UserPass;
        this.UserEmail = UserEmail;
    }

    public long getUserID() {
        return UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserPass() {
        return UserPass;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserID(long UserID) {
        this.UserID = UserID;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setUserPass(String UserPass) {
        this.UserPass = UserPass;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }
}
