package com.example.dwii_cl2_cesar_diaz.respository;

import com.example.dwii_cl2_cesar_diaz.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nombrerol);
}
