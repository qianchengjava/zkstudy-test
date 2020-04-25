package com.bfxy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfxy.service.LisenterService;
import com.bfxy.zookeeper.api.ZookeeperClient;

@RestController
public class IndexController {

	@Autowired
	private ZookeeperClient client;
	
	
	@RequestMapping("/index")
	public String index() throws Exception {
		return "zk-test";
	}
	
	@RequestMapping("/insertparent")
	public String insertparent() throws Exception {
		client.addPersistentNode("/super", "parent node");
		return "insert success!";
	}
	
	@Autowired
	private LisenterService lisenterService;
	
	//第一件事情
	@RequestMapping("/watcher")
	public String watcher() throws Exception {
		client.listener4ChildrenPath("/super", lisenterService);
		return "wather success!";
	}
	
	//第二件事情 添加子节点
	@RequestMapping("/insertc1")
	public String insertc1() throws Exception {
		client.addPersistentNode("/super/c1", "c1 data");
		return "insert success!";
	}
	
	
}
