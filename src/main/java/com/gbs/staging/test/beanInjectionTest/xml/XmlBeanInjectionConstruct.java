package com.gbs.staging.test.beanInjectionTest.xml;

import com.gbs.staging.test.beanInjectionTest.PrintDataPojo;
import org.springframework.beans.factory.annotation.Autowired;

public class XmlBeanInjectionConstruct {

    private PrintDataPojo printDataPojoPro;

    public XmlBeanInjectionConstruct(PrintDataPojo printDataPojoPro){
        this.printDataPojoPro=printDataPojoPro;
    }

    public PrintDataPojo getPrintDataPojoPro() {
        return printDataPojoPro;
    }

    public void setPrintDataPojoPro(PrintDataPojo printDataPojoPro) {
        this.printDataPojoPro = printDataPojoPro;
    }

    @Override
    public String toString() {
        return "XmlBeanInjectionConstruct{" +
                "printDataPojoPro=" + printDataPojoPro +
                '}';
    }
}
