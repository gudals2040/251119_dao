package kr.java.dao.model.entity;

// DB 계층 <-> Service랑 데이터를 오고갈 때
public class UserAccount {
    private int accountId;
    private String username;
    private String password;
    private String createdAt;

    // getter, setter

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
