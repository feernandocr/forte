package mx.forteinnovation.permisos.controller;

import mx.forteinnovation.permisos.beans.PermisoRequest;
import mx.forteinnovation.permisos.model.entity.PermisoEntity;
import mx.forteinnovation.permisos.model.entity.TipoPermisoEntity;
import mx.forteinnovation.permisos.service.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permisos")
public class PermisosController {

    @Autowired
    PermisoService permisoService;

    @GetMapping(value = "/test")
    public String test(){
        return "Esto es una prueba test";
    }

    @GetMapping(value="/getLogs")
    public List<TipoPermisoEntity> getTiposPermiso() {
        return permisoService.getAllTipoPermisos();
    }

    @PostMapping(value = "/newPermiso")
    public PermisoEntity newPermiso(@RequestBody PermisoRequest permisoRequest){
        return permisoService.createPermiso(permisoRequest);
    }
}

