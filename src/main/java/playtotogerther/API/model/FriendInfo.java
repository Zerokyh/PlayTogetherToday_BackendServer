package playtotogerther.API.model;

public class FriendInfo {
    private String friend_nickname;
    private String member_anniversary;
    private String group_name;

    public FriendInfo() {
    }

    public FriendInfo(String friend_nickname, String member_anniversary, String group_name) {
        this.friend_nickname = friend_nickname;
        this.member_anniversary = member_anniversary;
        this.group_name=group_name;
    }

    public String getFriend_nickname() {
        return friend_nickname;
    }

    public void setFriend_nickname(String friend_nickname) {
        this.friend_nickname = friend_nickname;
    }

    public String getMember_anniversary() {
        return member_anniversary;
    }

    public void setMember_anniversary(String member_anniversary) {
        this.member_anniversary = member_anniversary;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }
}
