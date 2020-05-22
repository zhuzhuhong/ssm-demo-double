package com.bdqn.service.impl.test;

import com.bdqn.SmbmsUser;
import org.springframework.stereotype.Service;

/**
 * @author mo
 * @Description:
 * @date 2020-05-22 18:30
 */

@Service
public class TestAspect {

    public SmbmsUser getUser() {
        return new SmbmsUser();
    }

}
