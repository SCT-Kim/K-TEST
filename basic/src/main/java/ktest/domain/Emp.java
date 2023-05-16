package ktest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import ktest.BasicApplication;
import ktest.domain.EmpAdd;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Emp_table")
@Data
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    @Embedded
    private RankId rankId;

    @Embedded
    private DeptId deptId;

    @ElementCollection
    private List<EmpUser> empUser;

    @PostPersist
    public void onPostPersist() {
        EmpAdd empAdd = new EmpAdd(this);
        empAdd.publishAfterCommit();
    }

    public static EmpRepository repository() {
        EmpRepository empRepository = applicationContext()
            .getBean(EmpRepository.class);
        return empRepository;
    }

    public static ApplicationContext applicationContext() {
        return BasicApplication.applicationContext;
    }
}
