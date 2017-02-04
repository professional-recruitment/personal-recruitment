package personal.common.api.implement.result;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by isenhome on 2017/1/29.
 */
public class ResumeResult implements Serializable {

    private Long id;
    private String name;
    private int status;
    private Date createTime;
    private Date lastModTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModTime() {
        return lastModTime;
    }

    public void setLastModTime(Date lastModTime) {
        this.lastModTime = lastModTime;
    }
}
