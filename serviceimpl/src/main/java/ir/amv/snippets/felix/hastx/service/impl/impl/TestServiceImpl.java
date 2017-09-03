/**
 * Copyright (c) Experian, 2017. All rights reserved.
 */
package ir.amv.snippets.felix.hastx.service.impl.impl;

import ir.amv.snippets.felix.hastx.dao.api.ITestDao;
import ir.amv.snippets.felix.hastx.jpa.model.TestEntity;
import ir.amv.snippets.felix.hastx.service.api.ITestService;

/**
 * @author Amir
 */
public class TestServiceImpl
        implements ITestService {

    private ITestDao testDao;

    public Long saveTest(TestEntity testEntity) {
        return testDao.save(testEntity);
    }

    public void updateTest(TestEntity testEntity) {
        testDao.update(testEntity);
    }

    public void deleteTest(Long testEntId) {
        testDao.delete(testEntId);
    }

    public void setTestDao(ITestDao testDao) {
        this.testDao = testDao;
    }
}
