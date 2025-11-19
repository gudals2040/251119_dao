package kr.java.dao.model.dao;

import kr.java.dao.model.entity.UserAccount;
import kr.java.dao.util.DBUtil;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class UserAccountDAOImpl implements UserAccountDAO {
    private final Connection connection = DBUtil.getConnection();

    @Override
    public UserAccount selectByUsername(String username) {
        return null;
    }

    @Override
    public void insertUserAccount(UserAccount userAccount) {
        String sql = "INSERT INTO USER_ACCOUNT (username, password) VALUES (?, ?)";
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, userAccount.getUsername());
            pstmt.setString(2, userAccount.getPassword());
            pstmt.executeUpdate(); // 문제가 생기면 Exception이 남
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
