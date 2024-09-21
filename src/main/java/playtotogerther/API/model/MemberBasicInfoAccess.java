package playtotogerther.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "member_basic_info_access")
public class MemberBasicInfoAccess {
    @Id
    private Integer member_id;
    private String member_nickname;
    private Boolean member_phone_access;
    private Boolean member_email_access;
    private Boolean member_address_access;
    private Boolean member_group_position_access;
    private Boolean member_personal_anniversary_access;
    private Boolean member_group_anniversary_access;
    private Boolean member_profile_image_access;

    public MemberBasicInfoAccess() {
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public String getMember_nickname() {
        return member_nickname;
    }

    public void setMember_nickname(String member_nickname) {
        this.member_nickname = member_nickname;
    }

    public Boolean getMember_phone_access() {
        return member_phone_access;
    }

    public void setMember_phone_access(Boolean member_phone_access) {
        this.member_phone_access = member_phone_access;
    }

    public Boolean getMember_email_access() {
        return member_email_access;
    }

    public void setMember_email_access(Boolean member_email_access) {
        this.member_email_access = member_email_access;
    }

    public Boolean getMember_address_access() {
        return member_address_access;
    }

    public void setMember_address_access(Boolean member_address_access) {
        this.member_address_access = member_address_access;
    }

    public Boolean getMember_group_position_access() {
        return member_group_position_access;
    }

    public void setMember_group_position_access(Boolean member_group_position_access) {
        this.member_group_position_access = member_group_position_access;
    }

    public Boolean getMember_personal_anniversary_access() {
        return member_personal_anniversary_access;
    }

    public void setMember_personal_anniversary_access(Boolean member_personal_anniversary_access) {
        this.member_personal_anniversary_access = member_personal_anniversary_access;
    }

    public Boolean getMember_group_anniversary_access() {
        return member_group_anniversary_access;
    }

    public void setMember_group_anniversary_access(Boolean member_group_anniversary_access) {
        this.member_group_anniversary_access = member_group_anniversary_access;
    }

    public Boolean getMember_profile_image_access() {
        return member_profile_image_access;
    }

    public void setMember_profile_image_access(Boolean member_profile_image_access) {
        this.member_profile_image_access = member_profile_image_access;
    }
}
