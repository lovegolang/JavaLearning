package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example5;
/**
 * ʵ���ܾ�����Ԥ֧���÷�������Ķ��� 
 */
public class GeneralManager2 extends GeneralManager{
	public Object handleRequest(RequestModel rm){
		if(PreFeeRequestModel.FEE_TYPE.equals(rm.getType())){
			//��ʾԤ֧���÷�������
			return myHandler(rm);
		}else{
			//�������ø���ȥ����
			return super.handleRequest(rm);
		}
	}
	private Object myHandler(RequestModel rm) {
		//�Ȱ�ͨ�õĶ������ͻ���
		PreFeeRequestModel frm = (PreFeeRequestModel)rm;
		if(frm.getFee() >= 5000){
			//������Ҫ�ͳͳͬ��
			System.out.println("�ܾ���ͬ��"+frm.getUser()+"Ԥ֧���÷���"+frm.getFee()+"Ԫ������");
			return true;
		}else{
			//������к�̵Ĵ�����󣬼�������
			if(this.successor!=null){
				return this.successor.handleRequest(rm);
			}
		}
		return false;
	}
}
