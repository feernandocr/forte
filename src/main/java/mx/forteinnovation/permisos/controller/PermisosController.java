package mx.forteinnovation.permisos.controller;

import mx.forteinnovation.permisos.beans.PermisoRequest;
import mx.forteinnovation.permisos.model.entity.PermisoEntity;
import mx.forteinnovation.permisos.model.entity.TipoPermisoEntity;
import mx.forteinnovation.permisos.service.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/permisos")
public class PermisosController {

    @Autowired
    PermisoService permisoService;

    @GetMapping(value = "/test")
    public String test(){
        return "Esto es una prueba test";
    }

    @GetMapping(value="/getTipoPermiso")
    public List<TipoPermisoEntity> getTiposPermiso() {
        return permisoService.getAllTipoPermisos();
    }

    @PostMapping(value = "/newPermiso")
    public PermisoEntity newPermiso(@RequestBody PermisoRequest permisoRequest){
        return permisoService.createPermiso(permisoRequest);
    }

    @PostMapping(value = "/updatePermiso")
    public PermisoEntity updatePermiso(@RequestBody PermisoRequest permisoRequest){
        return permisoService.updatePermiso(permisoRequest);
    }


    @GetMapping(value="/getAllPermisos")
    public List<PermisoEntity> getAllPermisos() {
        return permisoService.getAllPermisos();
    }

    @DeleteMapping(value = "/deletePermiso/{idPermiso}")
    public Map<String, Boolean> deletePermiso(@PathVariable(value = "idPermiso") Integer idPermiso){
        Map<String, Boolean> response = new HashMap<>();
        if (permisoService.deletePermiso(idPermiso)){
            response.put("DELETED", Boolean.TRUE);
        }else {
            response.put("ERROR", Boolean.FALSE);
        }
        return response;
    }
}

