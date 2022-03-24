package mx.forteinnovation.permisos.model.dao;

import mx.forteinnovation.permisos.model.entity.TipoPermisoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudTipoPermiso extends CrudRepository<TipoPermisoEntity,Integer> {
}
