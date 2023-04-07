package website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import website.entities.user.User;
import website.entities.user.UserRepository;

@SpringBootApplication
public class WebSiteApplication implements CommandLineRunner {
	
	/* Ce programme se lancera systématiquement au début du démarrage. /!\Il n'y a rien encore.
	 * 
	 */
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebSiteApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		/*
		CompteSite compte1 = new CompteSite();
		compte1.setId(null);
		compte1.setNom("Sun");
		compte1.setPrenom("Alex");
		compte1.setCivilite("Homme");
		compte1.setPays("France");
		compte1.setAdresseMail("alexandre@gmail.com");
		compte1.setMotDePasse("Cornichon");
		compte1.setDateDeNaissance("23/06/2004");
		
		compteRepository.save(compte1);
		*/

		
	}

}
