package inc.monster.common.services;

import inc.monster.common.domain.DomainObject;
import java.util.List;

public interface CRUDService<T extends DomainObject> {

    List<T> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);
}
