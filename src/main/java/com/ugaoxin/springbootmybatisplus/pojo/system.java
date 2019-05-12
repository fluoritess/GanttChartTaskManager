package com.ugaoxin.springbootmybatisplus.pojo;

public class system {
    private Integer systemId;

    private String adminName;

    private String adminPassword;

    private String salt;

    public system(Integer systemId, String adminName, String adminPassword, String salt) {
        this.systemId = systemId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.salt = salt;
    }

    public system() {
        super();
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}