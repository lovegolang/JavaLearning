package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter01.section02.thread_1_2_3.project_3_t4threadsafe;

public class BLogin extends Thread {
	
	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
