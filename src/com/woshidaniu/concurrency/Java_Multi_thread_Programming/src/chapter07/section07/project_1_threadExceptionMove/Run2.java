package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter07.section07.project_1_threadExceptionMove;

public class Run2 {
	public static void main(String[] args) {
		MyThreadGroup group = new MyThreadGroup("我的线程组");
		MyThread myThread = new MyThread(group, "我的线程");
		// 对象
		// myThread
		// .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		// 类
		// MyThread
		// .setDefaultUncaughtExceptionHandler(new
		// StateUncaughtExceptionHandler());
		myThread.start();

	}
}