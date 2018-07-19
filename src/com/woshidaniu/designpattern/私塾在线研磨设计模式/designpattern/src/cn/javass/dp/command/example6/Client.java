package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example6;

public class Client {
	public static void main(String[] args) {
		//��Ҫ������̨��������������������
		CookManager.runCookManager();
		
		//Ϊ�˼򵥣�ֱ����ѭ��ģ�������ŵ��
		for(int i = 0;i<5;i++){
			//��������Ա
			Waiter waiter = new Waiter();
			//����������󣬾���Ҫ��Ĳ�
			Command chop = new ChopCommand(i);
			Command duck = new DuckCommand(i);
			//��ˣ����ǰ���Щ���÷���Ա��¼����
			waiter.orderDish(chop);
			waiter.orderDish(duck);
			//������
			waiter.orderOver();
		}		
	}
}

/*
������ʦ����Ϊ0���������̶��Ź���
������ʦΪ0���������ˣ��̶��Ź���,���ƺ�ʱ=13��
�����ʦ����Ϊ0��������������Ѽ
���ĳ�ʦ����Ϊ1���������̶��Ź���
���ĳ�ʦΪ1���������ˣ��̶��Ź���,���ƺ�ʱ=5��
�����ʦΪ0���������ˣ�������Ѽ,���ƺ�ʱ=18��
������ʦ����Ϊ1��������������Ѽ
������ʦΪ1���������ˣ�������Ѽ,���ƺ�ʱ=1��
���ĳ�ʦ����Ϊ2���������̶��Ź���
���ĳ�ʦΪ2���������ˣ��̶��Ź���,���ƺ�ʱ=12��
�����ʦ����Ϊ2��������������Ѽ
�����ʦΪ2���������ˣ�������Ѽ,���ƺ�ʱ=7��
������ʦ����Ϊ3���������̶��Ź���
������ʦΪ3���������ˣ��̶��Ź���,���ƺ�ʱ=15��
���ĳ�ʦ����Ϊ3��������������Ѽ
�����ʦ����Ϊ4���������̶��Ź���
���ĳ�ʦΪ3���������ˣ�������Ѽ,���ƺ�ʱ=17��
�����ʦΪ4���������ˣ��̶��Ź���,���ƺ�ʱ=16��
������ʦ����Ϊ4��������������Ѽ
������ʦΪ4���������ˣ�������Ѽ,���ƺ�ʱ=0��
*/