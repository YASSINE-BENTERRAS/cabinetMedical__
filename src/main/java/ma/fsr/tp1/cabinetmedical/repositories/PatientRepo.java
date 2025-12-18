package ma.fsr.tp1.cabinetmedical.repositories;

import ma.fsr.tp1.cabinetmedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    List<Patient> findByName(String nom);
}
