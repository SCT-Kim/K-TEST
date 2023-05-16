package ktest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import ktest.BasicApplication;
import ktest.domain.DeptAdd;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Dept_table")
@Data
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        DeptAdd deptAdd = new DeptAdd(this);
        deptAdd.publishAfterCommit();
    }

    public static DeptRepository repository() {
        DeptRepository deptRepository = applicationContext()
            .getBean(DeptRepository.class);
        return deptRepository;
    }

    public static ApplicationContext applicationContext() {
        return BasicApplication.applicationContext;
    }
}
