package PrimeraPruebaGit.demo;


import jakarta.annotation.PostConstruct;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Getter
@Setter
@Component
@AllArgsConstructor
@NoArgsConstructor


public class TusMuertos {

    String hola;

    @PostConstruct
    public void log(){
        log.info("Hola cabrones :D");
    }

}
