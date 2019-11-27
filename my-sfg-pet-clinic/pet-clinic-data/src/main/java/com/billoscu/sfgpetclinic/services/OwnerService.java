package com.billoscu.sfgpetclinic.services;



import com.billoscu.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastname(String lastName);

}
