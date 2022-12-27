package data;

import java.util.Date;

public class Reserve {
    private Teacher teacher;
    private String key;
    private String id;
    private String activity;
    private Date solicitation_hour;
    private Date devolution_hour;

    public Reserve() {
        this.teacher = null;
        this.key = null;
        this.activity = "";
        this.solicitation_hour = new Date(0);
        this.devolution_hour = new Date(0);
        this.id = "";
    }

    public Reserve(Teacher teacher, String key, String activity, Date solicitation_hour, Date devolution_hour, String id) {
        this.teacher = teacher;
        this.key = key;
        this.activity = activity;
        this.solicitation_hour = solicitation_hour;
        this.devolution_hour = devolution_hour;
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public String getId() {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Date getSolicitation_hour() {
        return solicitation_hour;
    }

    public void setSolicitation_hour(Date solicitation_hour) {
        this.solicitation_hour = solicitation_hour;
    }

    public Date getDevolution_hour() {
        return devolution_hour;
    }

    public void setDevolution_hour(Date devolution_hour) {
        this.devolution_hour = devolution_hour;
    }
}
