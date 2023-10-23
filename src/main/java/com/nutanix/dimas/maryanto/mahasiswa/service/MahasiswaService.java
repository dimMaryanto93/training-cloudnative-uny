package com.nutanix.dimas.maryanto.mahasiswa.service;

import com.nutanix.dimas.maryanto.mahasiswa.model.Mahasiswa;
import com.nutanix.dimas.maryanto.mahasiswa.repository.MahasiswaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MahasiswaService {

    private MahasiswaRepository mahasiswaRepo;

    public MahasiswaService(MahasiswaRepository mahasiswaRepo) {
        this.mahasiswaRepo = mahasiswaRepo;
    }

    public Mahasiswa save(Mahasiswa data) {
        return this.mahasiswaRepo.save(data);
    }

    public Optional<Mahasiswa> findById(String id) {
        return this.mahasiswaRepo.findById(id);
    }

    public void deleteById(String id) {
        this.mahasiswaRepo.deleteById(id);
    }

    public List<Mahasiswa> findAll() {
        return this.mahasiswaRepo.findAll();
    }
}
