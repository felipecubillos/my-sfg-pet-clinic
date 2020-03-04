package com.billoscu.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.billoscu.sfgpetclinic.model.Pet;
import com.billoscu.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save( object);
	}

}
