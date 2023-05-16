package ktest.domain;

import java.util.List;
import ktest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "depts", path = "depts")
public interface DeptRepository extends PagingAndSortingRepository<Dept, Long> {
    List<Dept> findByName(String userId);
}
