package website.entities.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	/* Redirection sur les pages internets selon l'URL.
	 * Chaque URL à des fonctions différentes.
	 * /!\ Je dois encore travailler dessus.
	*/
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/index") //Affiche l'index du site
	public String index() {
		return "../static/index";
	}
	
	
	
	@GetMapping(path="/connection") /* Affiche la page connection. /!\ Je dois faire en sorte que lorsque l'utilisateur inscrit son adresse mail et son 
	mot de passe, le site le reconnait et le connecte.
	*/
	public String connection() {
		return "../static/connection";
	}
	@GetMapping(path="/template") // Affiche la template du site (Header et footer)
	public String template() {
		return "../templates/template";
	}
	
	
	@GetMapping(path="/inscription") /*/!\CENSER attribuer les valeurs entrées par l'utilisateur et de le mettre dans l'objet "compte"*/
	public String inscription(Model model) {
		model.addAttribute("user", new User());
		return "../static/inscription";
	}
	
	@PostMapping("/saveUser") //Permet d'enregistrer les données de l'objet "compte" dans la base de données.
	public String saveUser(User user) {
		
		
		
		 userRepository.save(user);
		 return "../static/index";
	}
		
	

}
