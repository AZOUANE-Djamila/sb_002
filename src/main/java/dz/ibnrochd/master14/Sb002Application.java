package dz.ibnrochd.master14;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.dao.LigneConsultationRepository;
import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.dao.RendezVousRepository;

@SpringBootApplication
public class Sb002Application implements CommandLineRunner {
	
	@Autowired
	PatientRepository patientRepository;
	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	
	@Autowired
	private ConsultationRepository consultationRepository;
	
	@Autowired
	private LigneConsultationRepository ligneConsultationRepository;
	
	@Autowired
	private TraitementRepository traitementRepository;
	
	@Autowired
	private RendezVousRepository rendezVousRepository;

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/* récupérer la liste de tous les patients puis afficher leurs noms*/
		System.out.println("Récupérer la liste de tous les patients puis afficher leurs noms");
		patientRepository.findAll().forEach(pat -> System.out.println("Name: "+pat.getNom()+"\n"));
		
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
		System.out.println("Rechercher les patients ayant le nom \"Yahi\" puis leurs prénoms");
		patientRepository.findByNom("Yahi").forEach(pat -> System.out.println(pat.getNom()+" "+pat.getPrenom()+"\n"));
		
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
		System.out.println("Créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le");
		patientRepository.save(new Patient(11111,"AZOUANE","Djamila","f",new Date("25/06/1993"),"657777","Alger"));
		System.out.println("Le patient ajouté: ");
		patientRepository.findByNom("AZOUANE").forEach(pat -> System.out.println(pat.getNom()+" "+pat.getPrenom()+"\n"));
		// TODO : rechercher la consultation ayant id=3 
		System.out.println("Rechercher la consultation ayant id=3 ");
		/*Consultation consult;*/
		try {
			Consultation consult = ConsultationRepository.findById(3);
			System.out.println(consult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		
		//(consult -> System.out.println(consult.getNom()+" "+consult.getPrenom()+"\n"));

		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
		
	}

}
