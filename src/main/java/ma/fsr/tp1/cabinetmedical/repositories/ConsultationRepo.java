package ma.fsr.tp1.cabinetmedical.repositories;

import ma.fsr.tp1.cabinetmedical.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepo extends JpaRepository<Consultation, Long> {
}
