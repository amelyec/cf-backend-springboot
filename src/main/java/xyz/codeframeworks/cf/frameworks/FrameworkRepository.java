package xyz.codeframeworks.cf.frameworks;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrameworkRepository extends CrudRepository<Framework, Long> {
    
}
