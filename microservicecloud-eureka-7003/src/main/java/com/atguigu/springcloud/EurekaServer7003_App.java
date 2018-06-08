package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * 注意：
 *  Eureka的自我保护：一句话：某时刻某一个微服务不可用了，eureka不会立刻清理，依旧会对该微服务的信息进行保存。
 *
 *  在自我保护模式中，Eureka Server会保护服务注册表中的信息，不再注销任何服务实例。当它收到的心跳数重新恢复到阈值以上时，该Eureka Server节点就会自动退出自我保护模式。
 *  它的设计哲学就是宁可保留错误的服务注册信息，也不盲目注销任何可能健康的服务实例。 一句话讲解： 好死不如赖活着
 *
 *  综上，自我保护模式是一种应对网络异常的安全保护措施。 它的架构哲学是宁可同时保留所有微服务（健康的微服务和不健康的微服务都会保留），也不盲目注销任何健康的微服务。
 *  使用自我保护模式，可以让Eureka集群更加的健壮、稳定。
 *
 * 在Spring Cloud中，可以使用eureka.server.enable-self-preservation=false  禁用自我保护模式。
 *
 *
 *  集群： 是指  在不同的机器或者服务器上配置相同的服务， 对外做一个超大运算的整体。
 *
 *
 *
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7003_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaServer7003_App.class, args);
	}
}
