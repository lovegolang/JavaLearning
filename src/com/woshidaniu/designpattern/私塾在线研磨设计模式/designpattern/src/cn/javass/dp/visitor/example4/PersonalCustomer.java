package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example4;
/**
 * ���˿ͻ�
 */
public class PersonalCustomer extends Customer{
	/**
	 * ��ϵ�绰
	 */
	private String telephone;
	/**
	 * ����
	 */
	private int age;
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitPersonalCustomer(this);
	}
}