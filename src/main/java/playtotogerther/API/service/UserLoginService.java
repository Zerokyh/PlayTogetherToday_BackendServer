package playtotogerther.API.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import playtotogerther.API.model.UserLogin;
import playtotogerther.API.repository.UserLoginRepository;

import java.util.Optional;

@Service
public class UserLoginService {

    private final UserLoginRepository userLoginRepository;

    @Autowired
    public UserLoginService(UserLoginRepository userLoginRepository){this.userLoginRepository = userLoginRepository;}

    public UserLogin login(String member_email, String member_pw) {
        UserLogin user = userLoginRepository.findByMemberEmail(member_email);

        if (user == null) {
            System.out.println("사용자를 찾을 수 없습니다. 입력한 이메일: " + member_email);
            return null;
        }

        System.out.println("저장된 비밀번호: " + user.getMemberPw());
        System.out.println("입력한 비밀번호: " + member_pw);

        return user.getMemberPw().equals(member_pw) ? user : null;
    }


}
