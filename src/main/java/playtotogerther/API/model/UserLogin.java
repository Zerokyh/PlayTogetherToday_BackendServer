package playtotogerther.API.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "member_info")
public class UserLogin {
    @Id
    @Column(name = "member_email")
    @JsonProperty("member_email")
    private String memberEmail;

    @Column(name = "member_pw")
    @JsonProperty("member_pw")
    private String memberPw;

    @Column(name = "member_id")
    @JsonProperty("member_id")
    private Integer memberId;

    public UserLogin() {}

    public UserLogin(String memberEmail, String memberPw, Integer memberId) {
        this.memberEmail = memberEmail;
        this.memberPw = memberPw;
        this.memberId = memberId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}
