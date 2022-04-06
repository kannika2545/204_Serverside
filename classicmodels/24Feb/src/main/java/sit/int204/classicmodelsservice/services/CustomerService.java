package sit.int204.classicmodelsservice.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import sit.int204.classicmodelsservice.dtos.SimpleCustomerDTO;
import sit.int204.classicmodelsservice.entities.Customer;
import sit.int204.classicmodelsservice.repositories.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public SimpleCustomerDTO getSimpleCustomerById(Integer id) {
        Customer customer = repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Customer id "+ id +
                        "Does Not Exist !!!"
                ));
        return modelMapper.map(customer, SimpleCustomerDTO.class);
    }

//
//        return repository.findById(id).map(customer -> convertEntityToDto(customer))
//                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, id +" Does Not Exist !!!" ));
//    }
//    private SimpleCustomerDTO convertEntityToDto(Customer customer) {
//        SimpleCustomerDTO simpleCustomerDTO = new SimpleCustomerDTO();
//        simpleCustomerDTO.setCustomerName(customer.getCustomerName());
//        simpleCustomerDTO.setPhone(customer.getPhone());
//        simpleCustomerDTO.setCity(customer.getCity());
//        simpleCustomerDTO.setCountry(customer.getCountry());
//        simpleCustomerDTO.setSalesPerson(customer.getSalesRepEmployee().getFirstName()
//                + ' '+ customer.getSalesRepEmployee().getLastName());
//        return simpleCustomerDTO;
//    }

}