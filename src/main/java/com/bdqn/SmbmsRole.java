package com.bdqn;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author mo
 * @Description:
 * @date 2020-05-14 18:58
 */
@Component
public class SmbmsRole {

    /*  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `role_code` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色编码',
  `role_name` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色名称',
  `created_by` bigint(20) DEFAULT NULL COMMENT '创建者',
  `creation_date` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_by` bigint(20) DEFAULT NULL COMMENT '修改者',
  `modify_date` datetime DEFAULT NULL COMMENT '修改时间',*/

    private Long id;
    private String roleCode;
    private String roleName;
    private Long createdBy;
    private Date creationDate;
    private Long modifyBy;
    private Date modifyDate;

    public SmbmsRole() {
    }

    public SmbmsRole(Long id,String roleCode, String roleName) {
        this.id = id;
        this.roleCode = roleCode;
        this.roleName = roleName;
//        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "SmbmsRole{" +
                "id=" + id +
                ", roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
