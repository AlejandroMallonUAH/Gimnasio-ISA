package gimnasio.app;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {
    public static ArrayList<Director> ldir = new ArrayList<Director>();
    public static List<Socio> lsocios = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);

        Director director = new Director("11292716J");
        director.setId(UUID.randomUUID());
        director.setNombre("admin");
        director.setContraseña("admin");
        ldir.add(director);
        Socio socio1 = new Socio("socio@gimnasio.com");
        socio1.setNombre("Ruben");
        socio1.setTelefono("633293847");
        socio1.setNumero_socio(UUID.randomUUID());
        lsocios.add(socio1);

        Socio socio2 = new Socio("socio2@gimnasio.com");
        socio2.setNombre("Javi");
        socio2.setTelefono("3374756373");
        socio2.setNumero_socio(UUID.randomUUID());
        lsocios.add(socio2);

        

        System.out.println("Id de director: " + director.getId());
        System.out.println("Numero de socio: " + socio1.getNumero_socio());
        ;
    }

}

// * Link tutorial: https://spring.io/guides/gs/serving-web-content/
