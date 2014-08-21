/**
 * 
 */
package com.test.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

/**
 * Sample Service task.
 * 
 * @author SwapnilB
 *
 */
public class ServiceTestTask implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("in ServiceTestTask");
		Object name = execution.getVariable("name");
		System.out.println(name);
		execution.setVariable("fromServiceTask", "came from Service task");
	}

}
