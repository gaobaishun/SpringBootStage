package com.gbs.staging.test.beanInjectionTest;

public class PrintDataPojo {
    private String name;
    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "PrintDataPojo{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
