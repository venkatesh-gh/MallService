package com.project.MallService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class MallClass {
	private Integer emp_id;
	private String emp_name;
	private String emp_dep;
	private float emp_salary;
	private String emp_city;
	private Integer shop_id;
	public MallClass(Integer emp_id, String emp_name, String emp_dep, float emp_salary, String emp_city,Integer shop_id) {
		
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dep = emp_dep;
		this.emp_salary = emp_salary;
		this.emp_city = emp_city;
		this.shop_id=shop_id;
	}
	public MallClass() {
		super();
		
	}
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_dep() {
		return emp_dep;
	}
	public void setEmp_dep(String emp_dep) {
		this.emp_dep = emp_dep;
	}
	public float getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_city() {
		return emp_city;
	}
	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}
	public void setShop_id_city(Integer shop_id) {
		this.shop_id = shop_id;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_dep=" + emp_dep + ", emp_salary="
				+ emp_salary + ", emp_city=" + emp_city + ", shop_id=" + shop_id + "]";
	}
	
	
}

