package com.nutanix.dimas.maryanto.mahasiswa;

import com.nutanix.dimas.maryanto.mahasiswa.model.Mahasiswa;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class MahasiswaApplicationTests {

	public void hasil(){
		Mahasiswa dimas01 = Mahasiswa.builder()
				.id("asdfi").build();
	}
}
