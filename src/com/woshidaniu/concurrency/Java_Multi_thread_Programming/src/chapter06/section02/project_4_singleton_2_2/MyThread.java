package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter06.section02.project_4_singleton_2_2;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
