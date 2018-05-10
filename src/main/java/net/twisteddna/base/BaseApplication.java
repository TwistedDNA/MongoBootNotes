package net.twisteddna.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseApplication implements CommandLineRunner {

	@Autowired
	private NotesRepository notesRepository;

	public static void main(String[] args){
		SpringApplication.run(BaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Note myRecepie = new Note();
		myRecepie.setText("What a nice cake!");
		notesRepository.save(myRecepie);

		notesRepository.findAll().stream().forEach(n -> System.out.println(n));
	}
}
