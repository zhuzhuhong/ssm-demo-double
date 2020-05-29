package com.bdqn;

import com.bdqn.SmbmsBill;

public interface SmbmsBillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmbmsBill record);

    int insertSelective(SmbmsBill record);

    SmbmsBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmbmsBill record);

    int updateByPrimaryKey(SmbmsBill record);
}