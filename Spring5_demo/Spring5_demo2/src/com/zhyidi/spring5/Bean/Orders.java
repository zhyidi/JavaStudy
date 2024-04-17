package com.zhyidi.spring5.Bean;

import java.security.PublicKey;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 16:58
 * @Version 1.0
 */
public class Orders {
    private String Oname;

    public Orders() {
        System.out.println("无参构造方法");
    }

    public void setOname(String oname) {
        Oname = oname;
        System.out.println("Set方法");
    }

    //初始化方法
    public void initial(){
        System.out.println("初始化");
    }
    //销毁方法
    public void destory(){
        System.out.println("销毁");
    }
}
