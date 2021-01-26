package com.lagou.client;

import com.lagou.demo.IHelloService;
import com.lagou.pojo.User;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

    //在RMI服务注册表中查找服务
        IHelloService helloService = (IHelloService)Naming.lookup("//127.0.0.1:8888/zm");
        User user = new User();
        user.setAge(20);
        user.setName("Zero");
        String sayHello = helloService.sayHello(user);
        System.out.println(sayHello);
    }
}
