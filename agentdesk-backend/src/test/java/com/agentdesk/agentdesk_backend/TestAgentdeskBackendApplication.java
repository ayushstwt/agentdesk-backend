package com.agentdesk.agentdesk_backend;

import org.springframework.boot.SpringApplication;

public class TestAgentdeskBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(AgentdeskBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
