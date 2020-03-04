package com.billoscu.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.billoscu.sfgpetclinic.model.Owner;
import com.billoscu.sfgpetclinic.model.Vet;
import com.billoscu.sfgpetclinic.services.OwnerService;
import com.billoscu.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Owner owner1 = new Owner();

		owner1.setFirstName("Andres");
		owner1.setLastName("Cubillos");

		ownerService.save(owner1);

		Owner owner2 = new Owner();

		owner2.setFirstName("Felipe");
		owner2.setLastName("Estrada");

		ownerService.save(owner2);
		System.out.println("Created Owners.....");

		Vet vet1 = new Vet();

		vet1.setFirstName("LJF");
		vet1.setLastName("Franco");

		vetService.save(vet1);

		Vet vet2 = new Vet();

		vet2.setFirstName("LJF");
		vet2.setLastName("Gonzalez");

		vetService.save(vet2);

		System.out.println("Created Vets.....");

	}

}
