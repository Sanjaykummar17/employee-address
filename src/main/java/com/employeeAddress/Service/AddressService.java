package com.employeeAddress.Service;

import com.employeeAddress.Model.Address;
import com.employeeAddress.Model.Employee;
import com.employeeAddress.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(List<Address> addAdd) {
        iAddressRepo.saveAll(addAdd);
        return  "Address added Successfully!";
    }

    public List<Address> getAddress() {
        return iAddressRepo.findAll();
    }

    public Optional<Address> getAddById(Long id) {
        return iAddressRepo.findById(id);
    }

    public String updateAddress(Long id, String address) {
        Address add = iAddressRepo.findById(id).get();
        add.setCity(String.valueOf(address));
        iAddressRepo.save(add);
        return "City Name updated Successfully!";
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return "Address Deleted Successfully!";
    }


//    public String updateAdd(Address updateAdd) {
//
//        Address updateAddress = iAddressRepo.findById(updateAdd.getId()).orElse(null);
//
//        if (updateAddress != null) {
//            updateAddress.setStreet(updateAdd.getStreet());
//            updateAddress.setCity(updateAdd.getCity());
//            updateAddress.setState(updateAdd.getState());
//            updateAddress.setZipcode(updateAdd.getZipcode());
//
//            iAddressRepo.save(updateAddress);
//            return "Address Updated Successfully!!";
//        } else {
//            return "Address not found";
//        }
 //   }


}
