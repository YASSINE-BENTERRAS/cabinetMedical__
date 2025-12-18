package ma.fsr.tp1.cabinetmedical.services;

import jakarta.persistence.EntityNotFoundException;
import ma.fsr.tp1.cabinetmedical.entities.Medecin;
import ma.fsr.tp1.cabinetmedical.repositories.MedecinRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
public class MedecinService {

    private final MedecinRepo medecinRepo;

    public MedecinService(MedecinRepo medecinRepo) {
        this.medecinRepo = medecinRepo;
    }

    public Medecin getMedecinById(Long id) {
        return medecinRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Medecin avec id " + id + " n'existe pas"));
    }


    public List<Medecin> getMedecinsByNom(String nom) {
        return medecinRepo.findByNom(nom);
    }

    public Medecin addMedecin(Medecin medecin){
        return medecinRepo.save(medecin);
    }

    public void deleteMedecin(Medecin medecin){
        medecinRepo.delete(medecin);
    }
}
