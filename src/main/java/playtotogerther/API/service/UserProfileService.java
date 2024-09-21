package playtotogerther.API.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import playtotogerther.API.model.UserProfile;
import playtotogerther.API.repository.UserProfileImageRepository;
import playtotogerther.API.repository.UserProfileRepository;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class UserProfileService {
    private UserProfileRepository userProfileRepository;
    private UserProfileImageRepository userProfileImageRepository;

    @Autowired
    public UserProfileService(UserProfileRepository userProfileRepository, UserProfileImageRepository userProfileImageRepository) {
        this.userProfileRepository = userProfileRepository;
        this.userProfileImageRepository = userProfileImageRepository;
    }

    public UserProfile getUserProfile(Integer id) {
        Optional<UserProfile> userProfile = userProfileRepository.findById(id);
        if (userProfile.isPresent()) {
            UserProfile profile = userProfile.get();
            // 이미지 URL 가져오기
            String imageUrl = userProfileImageRepository.findImageUrlByMemberId(profile.getProfile_image_id());
            profile.setProfile_image_url(imageUrl); // 이미지 URL 설정
            return profile; // 이미지 URL을 포함한 프로필 반환
        } else {
            return new UserProfile(1, "없음", "없음", "없음", "없음", "없음", LocalDate.now(), 1, null);
        }
    }

    public boolean updateUserProfile(UserProfile updatedProfile) {
        if (userProfileRepository.existsById(updatedProfile.getMember_id())) {
            userProfileRepository.save(updatedProfile);
            return true;
        }
        return false;
    }

    @Transactional
    public void saveProfileImageUrl(Integer memberId, String imageUrl) {
        System.out.println("Saving profile image URL to database...");

        // 프로필 이미지 스토리지에 URL 업데이트
        userProfileImageRepository.updateImageUrlByMemberId(memberId, imageUrl);
        System.out.println("Profile image URL updated in storage: " + imageUrl);

        // 사용자 프로필의 profile_image_id 업데이트 (필요시)
        // userProfileRepository.updateProfileImageUrl(memberId, newProfileImageId);
    }
}