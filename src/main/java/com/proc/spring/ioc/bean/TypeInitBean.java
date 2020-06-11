package com.proc.spring.ioc.bean;

/**
 * Created by fangjianhui on 2020/5/21.
 */
public class TypeInitBean {

    private InjectBean injectBean;

    public InjectBean getInjectBean() {
        return injectBean;
    }

    public void setInjectBean(InjectBean injectBean) {
        this.injectBean = injectBean;
    }
}
