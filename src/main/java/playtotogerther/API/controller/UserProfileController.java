package playtotogerther.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import playtotogerther.API.model.ProfileImageRequest;
import playtotogerther.API.model.UserProfile;
import playtotogerther.API.service.UserProfileService;
import playtotogerther.API.util.ApiResponse;
import playtotogerther.API.util.Code;
import playtotogerther.API.util.ResponseMessage;
import playtotogerther.API.util.Status;

@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "https://victorious-pond-07ef29800.5.azurestaticapps.net")
@RestController
public class UserProfileController {
    @Autowired
    private UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping("/MyInfoModify/{id}")
    public ApiResponse<UserProfile> getApiUserProfile(@PathVariable Integer id) {
        return new ApiResponse<>(Status.OK, Code.SUCCESS, ResponseMessage.SUCCESS, this.userProfileService.getUserProfile(id));
    }

    @PostMapping("/MyInfoModify")
    public ApiResponse<String> updateApiUserProfile(@RequestBody UserProfile updatedProfile) {
        boolean isUpdated = userProfileService.updateUserProfile(updatedProfile);
        if (isUpdated) {
            return new ApiResponse<>(Status.OK, Code.SUCCESS, ResponseMessage.SUCCESS, null);
        } else {
            return new ApiResponse<>(Status.ERROR, Code.FAILURE, ResponseMessage.FAILURE, null);
        }
    }

    @PostMapping("/MyInfoModify/{memberId}/saveProfileImage")
    public ResponseEntity<String> saveProfileImage(
            @PathVariable Integer memberId,
            @RequestBody ProfileImageRequest request) {
        // 로그: 요청 시작
        System.out.println("Received request to save profile image for memberId: " + memberId);

        // 프로필 이미지 URL 받기
        String profileImageUrl = request.getProfileImageUrl();
        System.out.println("Profile Image URL received: " + profileImageUrl);

        try {
            userProfileService.saveProfileImageUrl(memberId, profileImageUrl);
            System.out.println("Profile image URL saved successfully for memberId: " + memberId);
            return ResponseEntity.ok("Profile image URL saved successfully.");
        } catch (Exception e) {
            System.out.println("Error saving profile image URL: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error saving profile image URL: " + e.getMessage());
        }
    }
}

