package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example6;
/**
 * ������󣬱�����Ѽ
 */
public class DuckCommand implements Command{
	private CookApi cookApi = null;
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	private int tableNum;
	public DuckCommand(int tableNum){
		this.tableNum = tableNum;
	}
	public int getTableNum(){
		return this.tableNum;
	}
	
	public void execute() {
		this.cookApi.cook(tableNum,"������Ѽ");
	}
}
