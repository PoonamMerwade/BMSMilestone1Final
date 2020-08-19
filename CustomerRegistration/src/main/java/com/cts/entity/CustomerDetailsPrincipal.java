//package com.cts.entity;
//
//import java.util.Collection;
//import java.util.Collections;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class CustomerDetailsPrincipal implements UserDetails {
//
//	private Customer customer;
//	
//	public CustomerDetailsPrincipal(Customer customer) {
//		super();
//		this.customer = customer;
//	}
//
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return Collections.singleton(new SimpleGrantedAuthority("CUSTOMER"));
//	}
//
//	public String getPassword() {
//		return customer.getPassword();
//	}
//
//	public String getUsername() {
//		return customer.getUserName();
//	}
//
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//	
//
//}
