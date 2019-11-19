package com.billoscu.sfgpetclinic.services;

import java.util.Set;

import com.billoscu.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findByid(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();

}
