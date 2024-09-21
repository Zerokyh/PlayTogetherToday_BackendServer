package playtotogerther.API.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import playtotogerther.API.model.MemberBasicInfoAccess;
import playtotogerther.API.repository.MemberBasicInfoAccessRepository;

import java.util.Map;
import java.util.Optional;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://victorious-pond-07ef29800.5.azurestaticapps.net")
public class MemberInfoAccess {

    private final MemberBasicInfoAccessRepository memberBasicInfoAccessRepository;

    public MemberInfoAccess(MemberBasicInfoAccessRepository memberBasicInfoAccessRepository) {
        this.memberBasicInfoAccessRepository = memberBasicInfoAccessRepository;
    }

    @PutMapping("/{memberId}/update-access")
    public ResponseEntity<String> updateMemberAccess(
            @PathVariable int memberId,
            @RequestBody Map<String, Boolean> request) {
        Optional<MemberBasicInfoAccess> member = memberBasicInfoAccessRepository.findById(memberId);

        if (member.isPresent()) {
            MemberBasicInfoAccess memberAccess = member.get();

            // 필드명에 따라 업데이트할 값을 설정
            request.forEach((field, value) -> {
                switch (field) {
                    case "phoneAccess":
                        memberAccess.setMember_phone_access(value);
                        break;
                    case "emailAccess":
                        memberAccess.setMember_email_access(value);
                        break;
                    case "addressAccess":
                        memberAccess.setMember_address_access(value);
                        break;
                    case "groupPositionAccess":
                        memberAccess.setMember_group_position_access(value);
                        break;
                    case "personalAnniversaryAccess":
                        memberAccess.setMember_personal_anniversary_access(value);
                        break;
                    case "groupAnniversaryAccess":
                        memberAccess.setMember_group_anniversary_access(value);
                        break;
                }
            });

            memberBasicInfoAccessRepository.save(memberAccess);
            return ResponseEntity.ok("Member access updated");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Member not found");
        }
    }
}

