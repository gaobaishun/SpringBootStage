package com.gbs.staging.pojo;

import java.io.Serializable;


//如果直接存入redis要进行序列化
public class SerProject implements Serializable {

    private Integer pId;

    private String pName;

    public SerProject(Integer pId, String pName) {
        this.pId = pId;
        this.pName = pName;
    }

    public SerProject() {
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "SerProject{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                '}';
    }
}
