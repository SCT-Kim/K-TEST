package ktest.domain;

import java.util.List;
import ktest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "emps", path = "emps")
public interface EmpRepository extends PagingAndSortingRepository<Emp, Long> {
    List<Emp> findByUserId(String userId);
}
