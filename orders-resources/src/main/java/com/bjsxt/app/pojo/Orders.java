package com.bjsxt.app.pojo;

import java.io.Serializable;
import java.util.Date;

/***
 * 订单实体类
 * @author EDZ
 */
public class Orders implements Serializable{
	//这是文件修改
	//
	private Integer id;
	private String remark;
	private Date odate;
	private Integer total;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getOdate() {
		return odate;
	}
	public void setOdate(Date odate) {
		this.odate = odate;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public void show() {
		
	}
	
}
