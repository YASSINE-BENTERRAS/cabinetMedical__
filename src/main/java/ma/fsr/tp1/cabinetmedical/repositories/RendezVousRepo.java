package ma.fsr.tp1.cabinetmedical.repositories;

import ma.fsr.tp1.cabinetmedical.entities.Medecin;
import ma.fsr.tp1.cabinetmedical.entities.Patient;
import ma.fsr.tp1.cabinetmedical.entities.RendezVous;
import ma.fsr.tp1.cabinetmedical.entities.Statu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RendezVousRepo extends JpaRepository<RendezVous,Long> {

    List<RendezVous> findRendezVousByPatient(Patient patient);
    List<RendezVous> findRendezVousByMedecin(Medecin medecin);
    List<RendezVous> findRendezVousByDateRdv(LocalDate dateRdv);
    List<RendezVous> findRendezVousByStatu(Statu statu);




}
