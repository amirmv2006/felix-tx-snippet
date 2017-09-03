/**
 * Copyright (c) Experian, 2017. All rights reserved.
 */
package ir.amv.snippets.felix.hastx.dao.jpa.impl;

import ir.amv.snippets.felix.hastx.dao.api.ITestDao;
import ir.amv.snippets.felix.hastx.jpa.model.TestEntity;

import javax.persistence.EntityManager;

/**
 * @author Amir
 */
public class TestDaoJPAImpl
        implements ITestDao {

    private EntityManager getEm() {
        return null;
    }

    public Long save(TestEntity testEntity) {
        getEm().persist(testEntity);
        return testEntity.getId();
    }

    public void update(TestEntity testEntity) {
        getEm().merge(testEntity);
    }

    public void delete(Long testEntId) {
        TestEntity entity = new TestEntity();
        entity.setId(testEntId);
        getEm().remove(entity);
    }
}
