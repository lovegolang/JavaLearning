package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter07.section03.project_1_threadRunSyn;

public class Run {
	public static void main(String[] args) {

		Object lock = new Object();

		MyThread a = new MyThread(lock, "A", 1);
		MyThread b = new MyThread(lock, "B", 2);
		MyThread c = new MyThread(lock, "C", 0);

		a.start();
		b.start();
		c.start();

	}
}
