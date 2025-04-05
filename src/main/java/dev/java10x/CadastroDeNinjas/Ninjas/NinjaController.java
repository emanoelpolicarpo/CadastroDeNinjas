package dev.java10x.CadastroDeNinjas.Ninjas;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("ninjas")
public class NinjaController {
    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar Ninjas (CREATE)
    @PostMapping("criar")
    public String CreateNinja() {
        return "Ninja criado!";
    }

    // Procurar todos os Ninjas (READ)
    @GetMapping("listar")
    public List<NinjaModel> GetNinjas() {
        return ninjaService.GetNinjas();
    }

    // Procurar Ninjas Por ID (READ)
    @GetMapping("listar/{id}")
    public Optional<NinjaModel> GetNinjaById(@PathVariable Long id) {
        return ninjaService.GetNinjaById(id);
    }

    // Alterar Ninja (UPDATE)
    @PatchMapping("alterar")
    public String UpdateNinja() {
        return "Alterando Ninja";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping()
    public String DeleteNinja() {
        return "Deletando Ninja";
    }
}
