package com.employeeAddress.Repo;

import com.employeeAddress.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Long> {

}
