/**
 * Copyright (c) Experian, 2017. All rights reserved.
 */
package ir.amv.snippets.felix.hast.test.service;

import ir.amv.snippets.felix.hastx.jpa.model.TestEntity;
import ir.amv.snippets.felix.hastx.service.api.ITestService;

import java.util.Date;
import java.util.Map;

/**
 * @author Amir
 */
public class ServiceTester {

    private ITestService testService;

    public void init() {
        System.out.println("Hi");
    }

    public void setTestService(ITestService testService) {
        this.testService = testService;
        bind(testService, null);
    }

    public void unbind(ITestService testService, Map<?, ?> props) {
    }

    public void bind(ITestService testService, Map<?, ?> props) {
        TestEntity testEnt = new TestEntity();
        testEnt.setDescription("Amir");
        testEnt.setDueDate(new Date());
        testEnt.setFinished(false);
        testEnt.setTitle("AMV");
        testService.saveTest(testEnt);
    }

}
