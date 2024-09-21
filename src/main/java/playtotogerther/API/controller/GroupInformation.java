package playtotogerther.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import playtotogerther.API.model.GroupInfo;
import playtotogerther.API.repository.GroupInfoRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GroupInformation {

    @Autowired
    private GroupInfoRepository groupInfoRepository;

    // 특정 멤버가 속한 그룹 정보 가져오기
    @GetMapping("/Myroom/groups")
    @ResponseBody
    public List<GroupInfo> getGroupInfo(@RequestParam("member_id") int member_id) {
        return groupInfoRepository.findGroupsByMemberId(member_id);
    }
}
