package com.nutanix.dimas.maryanto.mahasiswa.repository;

import com.nutanix.dimas.maryanto.mahasiswa.model.Mahasiswa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, String> {

    List<Mahasiswa> findAll();
}
