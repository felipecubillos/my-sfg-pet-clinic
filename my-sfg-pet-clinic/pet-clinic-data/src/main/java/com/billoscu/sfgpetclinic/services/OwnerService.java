package com.billoscu.sfgpetclinic.services;

import java.util.Set;

import com.billoscu.sfgpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByid(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
