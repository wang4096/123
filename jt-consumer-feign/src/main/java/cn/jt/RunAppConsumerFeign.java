package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication		//Feign不能使用boot，它使用cloud
@EnableFeignClients	//Feign的客户端程序
public class RunAppConsumerFeign {
	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerFeign.class, args);
	}
}
