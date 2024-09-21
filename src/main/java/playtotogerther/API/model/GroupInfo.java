package playtotogerther.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class GroupInfo {
    @Id
    private Integer group_id;
    private Integer group_type_id;
    private String group_name;
    private String group_join_pw;
    private Date group_anniversary;
    private Integer group_event_id;
    private Integer group_image_id;

    public GroupInfo() {
    }

    public GroupInfo(Integer group_id, Integer group_type_id, String group_name, String group_join_pw, Date group_anniversary, Integer group_event_id, Integer group_image_id) {
        this.group_id = group_id;
        this.group_type_id = group_type_id;
        this.group_name = group_name;
        this.group_join_pw = group_join_pw;
        this.group_anniversary = group_anniversary;
        this.group_event_id = group_event_id;
        this.group_image_id = group_image_id;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public Integer getGroup_type_id() {
        return group_type_id;
    }

    public void setGroup_type_id(Integer group_type_id) {
        this.group_type_id = group_type_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getGroup_join_pw() {
        return group_join_pw;
    }

    public void setGroup_join_pw(String group_join_pw) {
        this.group_join_pw = group_join_pw;
    }

    public Date getGroup_anniversary() {
        return group_anniversary;
    }

    public void setGroup_anniversary(Date group_anniversary) {
        this.group_anniversary = group_anniversary;
    }

    public Integer getGroup_event_id() {
        return group_event_id;
    }

    public void setGroup_event_id(Integer group_event_id) {
        this.group_event_id = group_event_id;
    }

    public Integer getGroup_image_id() {
        return group_image_id;
    }

    public void setGroup_image_id(Integer group_image_id) {
        this.group_image_id = group_image_id;
    }
}
