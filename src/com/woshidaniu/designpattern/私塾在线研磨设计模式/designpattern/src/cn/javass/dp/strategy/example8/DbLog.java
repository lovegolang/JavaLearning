package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.strategy.example8;
/**
 * ����־��¼�����ݿ�
 */
public class DbLog extends LogStrategyTemplate{
	public void doLog(String msg) {		
		//�������
		if(msg!=null && msg.trim().length()>5){
			int a = 5/0;
		}
		System.out.println("���ڰ� '"+msg+"' ��¼�����ݿ���");
	}
}
