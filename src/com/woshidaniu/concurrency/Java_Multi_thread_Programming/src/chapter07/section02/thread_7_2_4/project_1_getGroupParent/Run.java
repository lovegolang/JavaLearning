package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter07.section02.thread_7_2_4.project_1_getGroupParent;

public class Run {
	
	public static void main(String[] args) {
		System.out.println("线程：" + Thread.currentThread().getName()
				+ " 所在的线程组名为："
				+ Thread.currentThread().getThreadGroup().getName());
		System.out
				.println("main线程所在的线程组的父线程组的名称是："
						+ Thread.currentThread().getThreadGroup().getParent()
								.getName());
		System.out.println("main线程所在的线程组的父线程组的父线程组的名称是："
				+ Thread.currentThread().getThreadGroup().getParent()
						.getParent().getName());
	}

}
