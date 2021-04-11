package io.study.springbootsecurity;

import java.util.ArrayList;
import java.util.Collection;

import org.assertj.core.util.Arrays;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {
	
	String userName;
	
	public MyUserDetails() {		
	}
	
	public MyUserDetails (String userName) {
		this.userName=userName;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return  (Collection<? extends GrantedAuthority>) Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		return "pass";
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
