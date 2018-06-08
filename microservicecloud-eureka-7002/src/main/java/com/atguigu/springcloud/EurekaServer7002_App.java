package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * 注意：
 *  修改 C:\Windows\System32\drivers\etc路径下的hosts文件：
 *  127.0.0.1 eureka7001.com
 	127.0.0.1 eureka7002.com
 	127.0.0.1 eureka7003.com
 *
 *  集群： 是指  在不同的机器或者服务器上配置相同的服务， 对外做一个超大运算的整体。
 *
 *
 *
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7002_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaServer7002_App.class, args);
	}
}
