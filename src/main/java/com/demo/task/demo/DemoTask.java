package com.demo.task.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoTask {

//	@Scheduled 参数可以接受两种定时的设置，一种是我们常用的cron="*/5 * * * * ?",一种是 fixedRate = 5000，两种都表示每隔六秒打印一下内容。
//	fixedRate 说明
//	@Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
//	@Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
//	@Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
	@Scheduled(cron = "*/5 * * * * ?")
	public void start() {
		System.out.println(
				"定时任务，打印当前时间： " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	}
}
