package playtotogerther.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import playtotogerther.API.model.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, String> {
    UserLogin findByMemberEmail(String memberEmail);
}
