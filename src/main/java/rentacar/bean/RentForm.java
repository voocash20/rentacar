package rentacar.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

	
public class RentForm {
	
	
	@NotNull
	private Long customerId;
	@NotNull
	private Long carId;
	@NotNull
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date begin;
	@NotNull
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date end;
	
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
	
	
	
	
	
	
	
	
	
	
}
