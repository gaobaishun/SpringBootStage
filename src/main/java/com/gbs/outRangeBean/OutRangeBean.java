package com.gbs.outRangeBean;


import com.gbs.staging.test.beanInjectionTest.PrintDataPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @SpringBootApplication 默认会扫描同级目录下所有bean，但是跟该注解不在同级目录下的bean需要添加@ComponentScan
 */
@Component
public class OutRangeBean {
    private String name="@Component 注解注入";
    private String remark="注意需要配合@ComponentScan 注解使用";

    private PrintDataPojo printDataPojoPro;

    @Autowired
    public OutRangeBean(PrintDataPojo printDataPojoPro){
        this.printDataPojoPro=printDataPojoPro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "OutRangeBean{" +
                "name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", printDataPojoPro=" + printDataPojoPro +
                '}';
    }
}
