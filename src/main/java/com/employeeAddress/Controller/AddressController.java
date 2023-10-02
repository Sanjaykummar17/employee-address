package com.employeeAddress.Controller;

import com.employeeAddress.Model.Address;
import com.employeeAddress.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

//    GET /addresses - get all addresses
//    GET /addresses/{id} - get an address by id
//    POST /addresses - create a new address
//    PUT /addresses/{id} - update an address by id
//    DELETE /addresses/{id} - delete an address by id

    @PostMapping("addAddress")
    public String addAddress(@RequestBody List<Address> addAdd){
        return addressService.addAddress(addAdd);
    }

    @GetMapping("allAddress")
    public List<Address> getAddress(){
        return addressService.getAddress();
    }

    @GetMapping("address/id/{id}")
    public Optional<Address> getAddById(@PathVariable Long id){
        return addressService.getAddById(id);
    }

    @PutMapping("updateAddress/id/{id}")
    public String updateAddress(@PathVariable Long id,  @RequestParam String address){
        return addressService.updateAddress(id,address);
    }

    @DeleteMapping("deleteAddress/id/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }
//    @PutMapping("updateById/{id}")
//    public String updateAdd(@PathVariable Long id, @RequestBody Address updateAdd){
//        return addressService.updateAdd(updateAdd);
//    }

}
