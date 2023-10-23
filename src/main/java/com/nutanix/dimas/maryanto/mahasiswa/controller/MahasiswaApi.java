package com.nutanix.dimas.maryanto.mahasiswa.controller;

import com.nutanix.dimas.maryanto.mahasiswa.model.Mahasiswa;
import com.nutanix.dimas.maryanto.mahasiswa.service.MahasiswaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mahasiswa")
public class MahasiswaApi {

    private MahasiswaService serviceMahasiswa;

    public MahasiswaApi(MahasiswaService serviceMahasiswa) {
        this.serviceMahasiswa = serviceMahasiswa;
    }

    @GetMapping("/list")
    public List<Mahasiswa> findAll() {
        return this.serviceMahasiswa.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Mahasiswa mahasiswa) {
        mahasiswa = this.serviceMahasiswa.save(mahasiswa);
        return ResponseEntity.ok(mahasiswa);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Mahasiswa> findById(@PathVariable("id") String id) {
        Optional<Mahasiswa> optional = this.serviceMahasiswa.findById(id);
        if (optional.isPresent()) return ResponseEntity.ok(optional.get());
        else return ResponseEntity.noContent().build();
    }
}
