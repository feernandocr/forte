package mx.forteinnovation.permisos.service;

import mx.forteinnovation.permisos.beans.PermisoRequest;
import mx.forteinnovation.permisos.model.dao.CrudPermiso;
import mx.forteinnovation.permisos.model.dao.CrudTipoPermiso;
import mx.forteinnovation.permisos.model.entity.PermisoEntity;
import mx.forteinnovation.permisos.model.entity.TipoPermisoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermisoServiceImpl implements PermisoService{

    @Autowired
    private CrudTipoPermiso crudTipoPermiso;

    @Autowired
    private CrudPermiso crudPermiso;

    @Override
    public List<TipoPermisoEntity> getAllTipoPermisos() {
        return (List<TipoPermisoEntity>) crudTipoPermiso.findAll();
    }

    @Override
    public PermisoEntity createPermiso(PermisoRequest permisoRequest) {

        PermisoEntity newRecord = null;
        newRecord = new PermisoEntity(permisoRequest.getNombreEmpleado(),
                                        permisoRequest.getApellidoEmpleado(),
                                            getTipoPermisoById(permisoRequest.getTipoPermiso()),
                                                permisoRequest.getFechaPermiso());

        return crudPermiso.save(newRecord);
    }

    @Override
    public PermisoEntity updatePermiso(PermisoRequest permisoRequest) {
        Optional<PermisoEntity> entity = crudPermiso.findById(permisoRequest.getIdPermiso());

        if (entity.isPresent()){
            PermisoEntity entityPivot = entity.get();
            entityPivot.setNombreEmpleado(permisoRequest.getNombreEmpleado());
            entityPivot.setApellidoEmpleado(permisoRequest.getApellidoEmpleado());
            entityPivot.setFechaPermiso(permisoRequest.getFechaPermiso());
            entityPivot.setTipoPermiso(getTipoPermisoById(permisoRequest.getTipoPermiso()));

            return crudPermiso.save(entityPivot);
        }
        return null;
    }

    @Override
    public List<PermisoEntity> getAllPermisos() {
        return (List<PermisoEntity>) crudPermiso.findAll();
    }

    @Override
    public Boolean deletePermiso(Integer idPermiso) {
        Optional<PermisoEntity> entity = crudPermiso.findById(idPermiso);

        if (entity.isPresent()){
            crudPermiso.deleteById(idPermiso);
            return true;
        }else {
            return false;
        }
    }


    public TipoPermisoEntity getTipoPermisoById(int idTipoPermiso)  {
        Optional<TipoPermisoEntity> tipoPermisoEntity = null;
        tipoPermisoEntity = crudTipoPermiso.findById(idTipoPermiso);

        if (tipoPermisoEntity.isPresent()){
            return tipoPermisoEntity.get();
        } else {
            return null;
        }
    }
}
