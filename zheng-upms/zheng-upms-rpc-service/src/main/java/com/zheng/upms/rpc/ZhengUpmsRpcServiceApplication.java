package com.zheng.upms.rpc;

/**
 * 服务启动类
 * Created by ZhangShuzheng on 2017/2/3.
 */
public class ZhengUpmsRpcServiceApplication {

	public static void main(String[] args) {
		/*
		按照dubbo官网解说，要使得Main能正确的启用Spring容器，要求spring配置文件存放至classpath*:META-INF/spring/*.xml路径底下
		 */
		com.alibaba.dubbo.container.Main.main(args);
	}

}
