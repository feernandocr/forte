package mx.forteinnovation.permisos.service;

import mx.forteinnovation.permisos.beans.PermisoRequest;
import mx.forteinnovation.permisos.model.entity.PermisoEntity;
import mx.forteinnovation.permisos.model.entity.TipoPermisoEntity;

import java.util.List;

public interface PermisoService {

    public List<TipoPermisoEntity> getAllTipoPermisos();

    public PermisoEntity createPermiso(PermisoRequest permisoRequest);

    public PermisoEntity updatePermiso(PermisoRequest permisoRequest);

    public List<PermisoEntity> getAllPermisos();

    public Boolean deletePermiso(Integer idPermiso);
}
