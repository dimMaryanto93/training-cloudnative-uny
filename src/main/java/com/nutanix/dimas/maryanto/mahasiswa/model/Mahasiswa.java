package com.nutanix.dimas.maryanto.mahasiswa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Mahasiswa {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 128)
    private String id;
    @Column(name = "nim", nullable = false, length = 15)
    private String nim;
    @Column(name = "name")
    private String nama;
    @Column(name = "smt")
    private Integer semeter;
    @Column(name = "kelas_id")
    private String kelasId;

}
