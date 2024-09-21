package playtotogerther.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "member_info")
public class MemberInfo {

    @Id

    private Integer member_id;
    private String member_email;
    private String member_pw;
    private String member_2nd_email;
    private String member_nickname;
    private String member_phone;
    private String member_address;
    private  String member_anniversary;
    private Integer member_1st_group_id;
    private Integer member_2nd_group_id;
    private   Integer member_3rd_group_id;
    private Integer profile_image_id;

    public MemberInfo() {
    }

    public MemberInfo(Integer member_id, String member_email, String member_pw, String member_2nd_email, String member_nickname, String member_phone, String member_address, String member_anniversary, Integer member_1st_group_id, Integer member_2nd_group_id, Integer member_3rd_group_id, Integer profile_image_id) {
        this.member_id = member_id;
        this.member_email = member_email;
        this.member_pw = member_pw;
        this.member_2nd_email = member_2nd_email;
        this.member_nickname = member_nickname;
        this.member_phone = member_phone;
        this.member_address = member_address;
        this.member_anniversary = member_anniversary;
        this.member_1st_group_id = member_1st_group_id;
        this.member_2nd_group_id = member_2nd_group_id;
        this.member_3rd_group_id = member_3rd_group_id;
        this.profile_image_id = profile_image_id;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }

    public String getMember_pw() {
        return member_pw;
    }

    public void setMember_pw(String member_pw) {
        this.member_pw = member_pw;
    }

    public String getMember_2nd_email() {
        return member_2nd_email;
    }

    public void setMember_2nd_email(String member_2nd_email) {
        this.member_2nd_email = member_2nd_email;
    }

    public String getMember_nickname() {
        return member_nickname;
    }

    public void setMember_nickname(String member_nickname) {
        this.member_nickname = member_nickname;
    }

    public String getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(String member_phone) {
        this.member_phone = member_phone;
    }

    public String getMember_address() {
        return member_address;
    }

    public void setMember_address(String member_address) {
        this.member_address = member_address;
    }

    public String getMember_anniversary() {
        return member_anniversary;
    }

    public void setMember_anniversary(String member_anniversary) {
        this.member_anniversary = member_anniversary;
    }

    public Integer getMember_1st_group_id() {
        return member_1st_group_id;
    }

    public void setMember_1st_group_id(Integer member_1st_group_id) {
        this.member_1st_group_id = member_1st_group_id;
    }

    public Integer getMember_2nd_group_id() {
        return member_2nd_group_id;
    }

    public void setMember_2nd_group_id(Integer member_2nd_group_id) {
        this.member_2nd_group_id = member_2nd_group_id;
    }

    public Integer getMember_3rd_group_id() {
        return member_3rd_group_id;
    }

    public void setMember_3rd_group_id(Integer member_3rd_group_id) {
        this.member_3rd_group_id = member_3rd_group_id;
    }

    public Integer getProfile_image_id() {
        return profile_image_id;
    }

    public void setProfile_image_id(Integer profile_image_id) {
        this.profile_image_id = profile_image_id;
    }
}
