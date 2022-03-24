package mx.forteinnovation.permisos.model.dao;

import mx.forteinnovation.permisos.model.entity.PermisoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudPermiso extends CrudRepository<PermisoEntity,Integer> {
}
