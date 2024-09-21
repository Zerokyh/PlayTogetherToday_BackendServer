package playtotogerther.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import playtotogerther.API.model.ProfileImageStorage;

import java.util.Optional;

public interface UserProfileImageRepository extends JpaRepository<ProfileImageStorage, Integer> {

    @Query("SELECT pis.member_image_url FROM ProfileImageStorage pis WHERE pis.member_id = :memberId")
    String findImageUrlByMemberId(@Param("memberId") Integer memberId);

    @Modifying
    @Transactional
    @Query("UPDATE ProfileImageStorage pis SET pis.member_image_url = :imageUrl WHERE pis.member_id = :memberId")
    void updateImageUrlByMemberId(@Param("memberId") Integer memberId, @Param("imageUrl") String imageUrl);
}