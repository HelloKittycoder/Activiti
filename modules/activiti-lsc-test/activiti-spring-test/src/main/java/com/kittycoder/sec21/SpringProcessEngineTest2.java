package com.kittycoder.sec21;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

/**
 * Created by shucheng on 2019-8-15 上午 8:57
 * activiti与spring框架整合测试
 *
 * 说明：
 * 运行test方法时，把activiti-context.xml（在test/resources下）中id="entityManagerFactory"的bean注释掉，
 * 把id="processEngineConfiguration"的bean中的jpaEntityManagerFactory和jpaHandleTransaction属性注释掉
 */
public class SpringProcessEngineTest2 {

    @Test
    public void test() {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        System.out.println(defaultProcessEngine);
    }
}
