package kr.java.dao.service;

import kr.java.dao.model.dao.UserAccountDAO;
import kr.java.dao.model.dto.UserAccountDTO;
import kr.java.dao.model.entity.UserAccount;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {
    private final UserAccountDAO userAccountDAO;

    public UserAccountService(UserAccountDAO userAccountDAO) {
        this.userAccountDAO = userAccountDAO;
    }

    public void signup(UserAccountDTO dto) {
        UserAccount account = new UserAccount();
        account.setUsername(dto.getUsername());
        account.setPassword(dto.getPassword());
        userAccountDAO.insertUserAccount(account);
    }
}
