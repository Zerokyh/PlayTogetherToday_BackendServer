package playtotogerther.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import playtotogerther.API.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
    @Modifying
    @Transactional
    @Query("UPDATE UserProfile u SET u.profile_image_id = :profileImageId WHERE u.member_id = :memberId")
    void updateProfileImageUrl(@Param("memberId") Integer memberId, @Param("profileImageId") Integer profileImageId);
}
