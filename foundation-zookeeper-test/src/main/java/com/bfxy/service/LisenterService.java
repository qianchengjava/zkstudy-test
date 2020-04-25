package com.bfxy.service;

import org.springframework.stereotype.Component;

import com.bfxy.zookeeper.api.ChangedEvent;
import com.bfxy.zookeeper.api.NodeListener;
import com.bfxy.zookeeper.api.ZookeeperClient;

@Component
public class LisenterService implements NodeListener {

	@Override
	public void nodeChanged(ZookeeperClient client, ChangedEvent event) throws Exception {
		System.err.println("收到通知, 节点路径: " + event.getPath() + ", 节点内容: " + event.getData() + ", 变更操作: " + event.getType());
	}

	
}
