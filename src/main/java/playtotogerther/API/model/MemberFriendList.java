package playtotogerther.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "member_friend_list")
public class MemberFriendList {

    @Id
    private Integer member_id;
    private Integer friend_member_id;
    private String friend_nickname;
    private Integer friend_1st_group_id;

    public MemberFriendList() {
    }

    public MemberFriendList(Integer member_id, Integer friend_member_id, String friend_nickname, Integer friend_1st_group_id) {
        this.member_id = member_id;
        this.friend_member_id = friend_member_id;
        this.friend_nickname = friend_nickname;
        this.friend_1st_group_id = friend_1st_group_id;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getFriend_member_id() {
        return friend_member_id;
    }

    public void setFriend_member_id(Integer friend_member_id) {
        this.friend_member_id = friend_member_id;
    }

    public String getFriend_nickname() {
        return friend_nickname;
    }

    public void setFriend_nickname(String friend_nickname) {
        this.friend_nickname = friend_nickname;
    }

    public Integer getFriend_1st_group_id() {
        return friend_1st_group_id;
    }

    public void setFriend_1st_group_id(Integer friend_1st_group_id) {
        this.friend_1st_group_id = friend_1st_group_id;
    }
}
