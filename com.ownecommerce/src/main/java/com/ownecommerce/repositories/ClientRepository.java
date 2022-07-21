package com.ownecommerce.repositories;

import com.ownecommerce.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
	//Marker Interface, doesn't need to have anything inside of it.
	//You just have to change the parameters inside JpaRepositoy< (name of your class) , (type of your tracking Id)>.
}
