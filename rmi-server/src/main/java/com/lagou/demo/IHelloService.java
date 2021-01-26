package com.lagou.demo;

import com.lagou.pojo.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
    远程服务对象接口必须要继承Remote接口的,
    同时方法必须抛出RemoteException异常
 */
public interface IHelloService extends Remote {
    String sayHello(User user) throws RemoteException;
}
