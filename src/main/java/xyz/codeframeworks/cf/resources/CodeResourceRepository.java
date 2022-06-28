package xyz.codeframeworks.cf.resources;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeResourceRepository extends CrudRepository<CodeResource, Long> {
    
}
