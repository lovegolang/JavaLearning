package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example2;


/**
 * ����ͻ�����Ȥ�Ľӿڣ�ͨ����ά��һ��State���͵Ķ���ʵ��
 */
public class Context {
	/**
	 * ����һ��State���͵Ķ���ʵ��
	 */
	private State state;
	/**
	 * ����ʵ��State�Ķ����ʵ�� 
	 * @param state ʵ��State�Ķ����ʵ�� 
	 */
	public void setState(State state) {
		this.state = state;
	}
	/**
	 * �û�����Ȥ�Ľӿڷ���
	 * @param sampleParameter ʾ�����
	 */
	public void request(String sampleParameter) {
		//�ڴ����У���ת��state������
		state.handle(sampleParameter);
	}


}