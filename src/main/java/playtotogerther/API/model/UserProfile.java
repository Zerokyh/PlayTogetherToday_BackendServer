package playtotogerther.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.time.LocalDate;

@Entity
@Table(name = "member_info")
public class UserProfile {
    @Id
    private Integer member_id;
    private String member_nickname;
    private String member_phone;
    private String member_address;
    private String member_email;
    private String member_2nd_email;
    private LocalDate member_anniversary;
    private Integer profile_image_id;

    @Transient // JPA에 의해 데이터베이스에 저장되지 않도록 설정
    private String profile_image_url; // 프로필 이미지 URL을 저장할 필드
    public UserProfile() {
    }

    public UserProfile(Integer member_id, String member_nickname, String member_phone, String member_address, String member_email, String member_2nd_email, LocalDate member_anniversary, Integer profile_image_id, String profile_image_url) {
        this.member_id = member_id;
        this.member_nickname = member_nickname;
        this.member_phone = member_phone;
        this.member_address = member_address;
        this.member_email = member_email;
        this.member_2nd_email = member_2nd_email;
        this.member_anniversary = member_anniversary;
        this.profile_image_id = profile_image_id;
        this.profile_image_url = profile_image_url;
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

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }

    public String getMember_2nd_email() {
        return member_2nd_email;
    }

    public void setMember_2nd_email(String member_2nd_email) {
        this.member_2nd_email = member_2nd_email;
    }

    public LocalDate getMember_anniversary() {
        return member_anniversary;
    }

    public void setMember_anniversary(LocalDate member_anniversary) {
        this.member_anniversary = member_anniversary;
    }

    public Integer getProfile_image_id() {
        return profile_image_id;
    }

    public void setProfile_image_id(Integer profile_image_id) {
        this.profile_image_id = profile_image_id;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }
}
