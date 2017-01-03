package com.hzw.du.web.activiti;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.restlet.resource.Put;


public class TestLiucheng {
	
	
	ProcessEngine processEngine= ProcessEngines.getDefaultProcessEngine();
	
	@Test
	public void deployProcess(){
		/**
		 * 流程部署
		 */
	    System.out.println(processEngine==null);
		InputStream  inBpmn= this.getClass().getResourceAsStream("MyProcessTest.bpmn");//bpmn文件
		InputStream  inPng= this.getClass().getResourceAsStream("MyProcessTest.png");//对应的图片文件
		
		RepositoryService repositoryService = processEngine.getRepositoryService();//流程仓库service
		Deployment deployment =repositoryService.createDeployment()
						 .name("公告审批流程")
						 .addInputStream("MyProcessTest.bpmn", inBpmn)
						 .addInputStream("MyProcessTest.png",inPng)
						 .deploy();
		System.out.println("！！！！部署流程！！！！！");
		System.out.println("流程ID   "+deployment.getId());
		System.out.println("流程名称       "+deployment.getName());
		
	}
	
	/**
	 * 流程启动
	 */
	@Test
	public void startProcess(){
		//流程key
		String  processDefinitionId="myProcess";
		RuntimeService  runtimeserivce = processEngine.getRuntimeService();
		TaskService   taskSerivce = processEngine.getTaskService();
		Map<String,Object> variables = new HashMap<String,Object>();
		variables.put("sysuser", "郭靖");//流程变量:任务办理人  
		//启动流程实例设置任务办理流程变量
		ProcessInstance processInstance = runtimeserivce.startProcessInstanceByKey(processDefinitionId, variables);		
		System.out.println("流程实例ID : "+processInstance.getId());
		System.out.println("流程定义ID :"+processInstance.getProcessInstanceId());
		
	}
	
	
	/**
	 * 查询个人任务
	 */
	@Test
	public void queryPersonalTask(){
		//任务办理人
		String assignee="郭靖";
		List<Task>  list =  processEngine.getTaskService().createTaskQuery().taskAssignee(assignee).list();
		// 遍历当前人的任务 
		for(Task task:list){
			
			System.out.println("任务名称 :  "+task.getName());
			System.out.println("任务Id:  "+task.getId());
		}
	}
	
	/**
	 * 完成个人任务
	 */
	@Test
	public  void  completePersonalTask(){
		
		String assignee="郭靖";
		List<Task>  list =  processEngine.getTaskService().createTaskQuery().taskAssignee(assignee).list();
		// 遍历当前人的任务 
		for(Task task:list){
			
			String  taskId = task.getId();
			
			System.out.println("任务: "+task.getName()+"----完成!!!");
			
			
			Map<String,Object> variables = new HashMap<String,Object>();
			
			variables.put("level",1);//流程变量  是否通过审批
			
			// 通过任务ID 完成任务
			processEngine.getTaskService().complete(taskId, variables);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
