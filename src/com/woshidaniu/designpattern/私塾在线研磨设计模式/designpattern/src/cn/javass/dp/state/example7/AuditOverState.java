package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example7;

import java.util.Scanner;
/**
 * ������˽�������
 */
public class AuditOverState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();

		//ҵ���������������¼�������̽���		
	}
}
