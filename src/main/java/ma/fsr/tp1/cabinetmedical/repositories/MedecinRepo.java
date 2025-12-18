package ma.fsr.tp1.cabinetmedical.repositories;

import ma.fsr.tp1.cabinetmedical.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface MedecinRepo extends JpaRepository<Medecin,Long> {
    List<Medecin> findByNom(String nom);
}
