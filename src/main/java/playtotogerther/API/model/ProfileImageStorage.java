package playtotogerther.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile_image_storage")
public class ProfileImageStorage {
    @Id
    private Integer profile_image_id;

    private Integer member_id;

    private String member_image_url;

    public ProfileImageStorage() {}

    public ProfileImageStorage(Integer profile_image_id, Integer member_id, String member_image_url) {
        this.profile_image_id = profile_image_id;
        this.member_id = member_id;
        this.member_image_url = member_image_url;
    }

    public Integer getProfile_image_id() {
        return profile_image_id;
    }

    public void setProfile_image_id(Integer profile_image_id) {
        this.profile_image_id = profile_image_id;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public String getMember_image_url() {
        return member_image_url;
    }

    public void setMember_image_url(String member_image_url) {
        this.member_image_url = member_image_url;
    }
}
