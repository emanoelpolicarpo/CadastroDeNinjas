package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os ninjas
    public List<NinjaModel> GetNinjas(){
        return ninjaRepository.findAll();
    }

    // Listar por Id
    public Optional<NinjaModel> GetNinjaById(long id){
        return ninjaRepository.findById(id);
    }
}
