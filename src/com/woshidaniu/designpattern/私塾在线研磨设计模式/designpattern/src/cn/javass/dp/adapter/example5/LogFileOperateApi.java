package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.adapter.example5;

import java.util.List;
/**
 * ��־�ļ������ӿ�
 */
public interface LogFileOperateApi {
	/**
	 * ��ȡ��־�ļ������ļ������ȡ�洢����־�б����
	 * @return �洢����־�б����
	 */
	public List<LogModel> readLogFile();
	/**
	 * д��־�ļ�������־�б�д������־�ļ���ȥ
	 * @param list Ҫд����־�ļ�����־�б�
	 */
	public void writeLogFile(List<LogModel> list);
}
