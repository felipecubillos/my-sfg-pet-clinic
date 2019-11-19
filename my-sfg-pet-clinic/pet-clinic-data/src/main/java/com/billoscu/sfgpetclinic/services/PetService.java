package com.billoscu.sfgpetclinic.services;

import java.util.Set;

import com.billoscu.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findByid(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
