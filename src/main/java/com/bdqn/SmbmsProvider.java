package com.bdqn;

import java.util.Date;

public class SmbmsProvider {
    /**
    * 主键ID
    */
    private Long id;

    /**
    * 供应商编码
    */
    private String proCode;

    /**
    * 供应商名称
    */
    private String proNme;

    /**
    * 供应商详细描述
    */
    private String proDesc;

    /**
    * 供应商联系人
    */
    private String proContact;

    /**
    * 联系电话
    */
    private String proPhone;

    /**
    * 地址
    */
    private String proAddress;

    /**
    * 传真
    */
    private String proFax;

    /**
    * 创建者（userId）
    */
    private Long createdBy;

    /**
    * 创建时间
    */
    private Date creationDate;

    /**
    * 更新时间
    */
    private Date modifyDate;

    /**
    * 更新者（userId）
    */
    private Long modifyBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProNme() {
        return proNme;
    }

    public void setProNme(String proNme) {
        this.proNme = proNme;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public String getProContact() {
        return proContact;
    }

    public void setProContact(String proContact) {
        this.proContact = proContact;
    }

    public String getProPhone() {
        return proPhone;
    }

    public void setProPhone(String proPhone) {
        this.proPhone = proPhone;
    }

    public String getProAddress() {
        return proAddress;
    }

    public void setProAddress(String proAddress) {
        this.proAddress = proAddress;
    }

    public String getProFax() {
        return proFax;
    }

    public void setProFax(String proFax) {
        this.proFax = proFax;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }
}