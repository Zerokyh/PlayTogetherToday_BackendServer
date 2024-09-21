package playtotogerther.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import playtotogerther.API.model.FriendInfo;
import playtotogerther.API.model.MemberFriendList;
import playtotogerther.API.repository.MemberFriendListRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://victorious-pond-07ef29800.5.azurestaticapps.net")
public class FriendList {

    @Autowired
    private MemberFriendListRepository memberFriendListRepository;

    // 특정 멤버의 친구리스트 가져오기
    @GetMapping("/Myroom/friends")
    @ResponseBody
    public List<FriendInfo> getFriendList(@RequestParam("member_id") int member_id) {
//        return memberFriendListRepository.findFriendsByMemberId(member_id);
        //[[{"member_id":1,"friend_member_id":2,"friend_nickname":"김영희","friend_1st_group_id":1},"2024-06-10"]] 리턴
        List<Object[]> result = memberFriendListRepository.findFriendsByMemberId(member_id);

        List<FriendInfo> friends = new ArrayList<>();
        for (Object[] row : result) {
            MemberFriendList friend = (MemberFriendList) row[0];
            String member_anniversary = (String) row[1];
            String group_name = (String) row[2];

            friends.add(new FriendInfo(friend.getFriend_nickname(), member_anniversary,group_name));
        }
        return friends;


    }



}
