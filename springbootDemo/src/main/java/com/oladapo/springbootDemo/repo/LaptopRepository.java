package com.oladapo.springbootDemo.repo;
import com.oladapo.springbootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in database");
    }
}
