package inc.monster.common.services;

import inc.monster.common.domain.DomainObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class AbstractMapBasedCRUDService<T extends DomainObject> implements CRUDService<T> {

    private final Map<Integer, T> domainMap;

    protected AbstractMapBasedCRUDService() {
        domainMap = loadDomainObjects();
    }

    @Override
    public List<T> listAll() {
        return new ArrayList<>(domainMap.values());
    }

    @Override
    public T getById(Integer id) {
        return domainMap.get(id);
    }

    @Override
    public T saveOrUpdate(T domainObject) {
        Objects.requireNonNull(domainObject);
        if (domainObject.getId() == null) {
            domainObject.setId(getNextKey());
        }
        domainMap.put(domainObject.getId(), domainObject);
        return domainObject;
    }

    @Override
    public void delete(Integer id) {
        domainMap.remove(id);
    }

    private Integer getNextKey() {
        return Collections.max(domainMap.keySet()) + 1;
    }

    protected abstract Map<Integer, T> loadDomainObjects();
}
