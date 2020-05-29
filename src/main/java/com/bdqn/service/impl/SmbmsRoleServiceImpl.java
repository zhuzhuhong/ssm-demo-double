package com.bdqn.service.impl;

import com.bdqn.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author mo
 * @Description:
 * @date 2020-05-22 18:26
 */

@Service
public class SmbmsRoleServiceImpl {
    private static final Logger log = LogManager.getLogger(SmbmsRoleServiceImpl.class);

    @Resource
    private SmbmsProviderMapper providerMapper;
    @Resource
    private SmbmsBillMapper billMapper;


//    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class
//    ,transactionManager = "txManager")
    public void addProviderAndBill(SmbmsBill bill, SmbmsProvider provider) {
        providerMapper.insert(provider);

        int i = 1 / 0;
        log.info("执行其他的业务操作");
        billMapper.insert(bill);
    }

}
