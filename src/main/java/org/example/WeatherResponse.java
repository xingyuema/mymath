package org.example;

import java.io.Serializable;

public class WeatherResponse implements Serializable {

	private static final long serialVersionUID = 1L;
    private Weather data;
    private String status;
    private String desc;
   
	public Weather getData() {
		return data;
	}
	public void setData(Weather data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
