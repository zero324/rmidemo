package com.lagou.server;

import com.lagou.demo.IHelloService;
import com.lagou.demo.HelloServiceImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        //创建远程调用对象 同时创建stub(客户端的存根)对象 以及skeleton(服务端的存根)对象
        try {
            IHelloService iHelloService = new HelloServiceImpl();

        //启动注册服务:创建了远程服务对象的注册表Registry的实例,并指定端口为8888
            LocateRegistry.createRegistry(8888);

        //真正注册:绑定URL的标准格式:rmi://host:port/name   rmi可以省略
            try {
                Naming.bind("//127.0.0.1:8888/zm",iHelloService);
            } catch (AlreadyBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            System.out.println("注册成功");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
