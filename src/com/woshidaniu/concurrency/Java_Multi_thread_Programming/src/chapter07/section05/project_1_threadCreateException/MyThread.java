package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter07.section05.project_1_threadCreateException;

public class MyThread extends Thread {
	@Override
	public void run() {
		String username = null;
		System.out.println(username.hashCode());
	}

}
