package com.brijframework.useraccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.brijframework.useraccount.constant.UserRole;
import com.brijframework.useraccount.entities.global.EORoleDetail;
import com.brijframework.useraccount.repository.global.RoleDetailRepository;

@Component
public class UserAccountContextListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private RoleDetailRepository roleDetailRepository;
	
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
    	for(UserRole userRole : UserRole.values()) {
    		if(roleDetailRepository.findByPosition(userRole.getPosition()) ==null) {
    			roleDetailRepository.saveAndFlush(new EORoleDetail(userRole.getPosition(),userRole.getRole(),userRole.getRole()));
    		}
    	}
    
    }
}