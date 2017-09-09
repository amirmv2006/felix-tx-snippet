/**
 * Copyright (c) Experian, 2017. All rights reserved.
 */
package ir.amv.snippets.felix.hastx.service.impl.impl;

import ir.amv.snippets.felix.hastx.dao.api.ITestDao;
import ir.amv.snippets.felix.hastx.jpa.model.TestEntity;
import ir.amv.snippets.felix.hastx.service.api.ITestService;

import javax.transaction.Transactional;

/**
 * @author Amir
 */
public class TestServiceImpl
        implements ITestService {

    private ITestDao testDao;

    @Transactional(Transactional.TxType.REQUIRED)
    public Long saveTest(TestEntity testEntity) {
        return testDao.save(testEntity);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void updateTest(TestEntity testEntity) {
        testDao.update(testEntity);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void deleteTest(Long testEntId) {
        testDao.delete(testEntId);
    }

    public void setTestDao(ITestDao testDao) {
        this.testDao = testDao;
    }
}
