package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	//@Query("select c.cno,c.cname,c.caddrs,ph.regNo,ph.mobileNo,ph.provider,ph.numberType from Customer c inner join  c.phonesInfo ph")
	//@Query("select c.cno,c.cname,c.caddrs,ph.regNo,ph.mobileNo,ph.provider,ph.numberType from Customer c right join  c.phonesInfo ph")
	//@Query("select c.cno,c.cname,c.caddrs,ph.regNo,ph.mobileNo,ph.provider,ph.numberType from Customer c left join  c.phonesInfo ph")
	@Query("select c.cno,c.cname,c.caddrs,ph.regNo,ph.mobileNo,ph.provider,ph.numberType from Customer c full outer join  c.phonesInfo ph")
	
	public  List<Object[]>  fetchParentsToChildsDataUsingJoins();   
}
