package rentacar.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity	
public class Rent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Customer customer;
	@ManyToOne
	private LuxuryCar car;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date begin;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date end;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LuxuryCar getCar() {
		return car;
	}
	public void setCar(LuxuryCar car) {
		this.car = car;
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
	public Rent(Customer customer, LuxuryCar car, Date begin, Date end) {
		this.customer = customer;
		this.car = car;
		this.begin = begin;
		this.end = end;
	}
	public Rent() {
	}
	
	
	
	
	
	
	
	
	
}
