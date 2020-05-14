package com.bdqn;

import java.util.List;

/**
 * @author mo
 * @Description:
 * @date 2020-05-14 17:43
 */

public interface SmbmsUserMapper {

    /**
     * 查询所有用户的数量
     * @return
     */
    int selectCount();

    /**
     * 查询所有的用户
     * @return
     */
    List<SmbmsUser> selectUserList();

    /**
     * 查询自定义用户信息
     * @return
     */
    List<CustomUser> selectCostomeUser();

}
