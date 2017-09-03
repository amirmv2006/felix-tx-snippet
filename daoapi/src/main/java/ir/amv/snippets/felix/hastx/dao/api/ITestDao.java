/**
 * Copyright (c) Experian, 2017. All rights reserved.
 */
package ir.amv.snippets.felix.hastx.dao.api;

import ir.amv.snippets.felix.hastx.jpa.model.TestEntity;

/**
 * @author Amir
 */
public interface ITestDao {

    Long save(TestEntity testEntity);
    void update(TestEntity testEntity);
    void delete(Long testEntId);
}
