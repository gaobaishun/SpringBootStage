package com.gbs.staging.test.beanInjectionTest.xml;

import com.gbs.staging.test.beanInjectionTest.PrintDataPojo;

public class XmlBeanInjectionSet {
    private PrintDataPojo printDataPojoPro;

    public PrintDataPojo getPrintDataPojoPro() {
        return printDataPojoPro;
    }

    public void setPrintDataPojoPro(PrintDataPojo printDataPojoPro) {
        this.printDataPojoPro = printDataPojoPro;
    }

    @Override
    public String toString() {
        return "XmlBeanInjectionSet{" +
                "printDataPojoPro=" + printDataPojoPro +
                '}';
    }
}
