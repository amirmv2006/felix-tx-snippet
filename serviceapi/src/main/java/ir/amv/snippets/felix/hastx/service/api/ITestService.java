/**
 * Copyright (c) Experian, 2017. All rights reserved.
 */
package ir.amv.snippets.felix.hastx.service.api;

import ir.amv.snippets.felix.hastx.jpa.model.TestEntity;

/**
 * @author Amir
 */
public interface ITestService {

    Long saveTest(TestEntity testEntity);
    void updateTest(TestEntity testEntity);
    void deleteTest(Long testEntId);
}
