/**
 * 
 */
package com.test.activiti;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * Sample User task.
 * 
 * @author SwapnilB
 *
 */
public class UserTestTask implements TaskListener {

	private static final long serialVersionUID = -1689193441786569253L;

	@Override
	public void notify(DelegateTask delegateTask) {
		System.out.println("in UserTestTask");
		Object fromServiceTask = delegateTask.getVariable("fromServiceTask");
		System.out.println(fromServiceTask);
	}

}
