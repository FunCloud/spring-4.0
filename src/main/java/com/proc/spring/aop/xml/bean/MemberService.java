package com.proc.spring.aop.xml.bean;

/**
 * Created by fangjianhui on 2020/6/15.
 */
public class MemberService {

    public int addMember(){
        System.out.println("新增成员!");
        return 1;
    }

    public void updateMember(){
        System.out.println("修改成员!");
    }

    public void deleteMember() throws Exception{
        System.out.println("删除成员!");
        throw new Exception("内部错误");
    }
}
