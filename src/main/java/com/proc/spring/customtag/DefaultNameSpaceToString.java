/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.customtag;

/**
 * @Auther: 方建辉
 * @Date: 2020/6/16 11:53
 * @Description:
 */
public class DefaultNameSpaceToString {

    public static void main(String[] args) {
        DebugThenHasThreadToString debug = new DebugThenHasThreadToString();
        //debug this out print, and find debug.display has been init
        System.out.println(debug.getDisplay());
    }

    static class DebugThenHasThreadToString{

        private String display = null;

        public String getDisplay(){
            if (display == null) {
                synchronized (this){
                    if (display == null) {
                        display = "display";
                    }
                }
            }

            return display;
        }

        @Override
        public String toString() {
            return "debug this class and init display attribute : " + getDisplay();
        }
    }
}
