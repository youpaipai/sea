package com.hzw.du.web.util;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.junit.Test;

public class ActivitiTest {
	
 private RepositoryService repositorySerivce;
	
 ProcessEngine processEngine=ProcessEngines.getDefaultProcessEngine();//工作流引擎
 
 	@Test
 	public  void deployProcess(){//
 		
 		
 		processEngine.getRepositoryService();
 		
 		
 		
 		
 	}

	
	
	

}
