package playtotogerther.API.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "group_member_match")
public class GroupMemberMatch {
    @Id
    private Integer member_id;
    private Integer group_id;

    public GroupMemberMatch() {
    }

    public GroupMemberMatch(Integer member_id, Integer group_id) {
        this.member_id = member_id;
        this.group_id = group_id;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }
}
