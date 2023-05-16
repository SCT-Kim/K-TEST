package ktest.domain;

import java.util.*;
import ktest.domain.*;
import ktest.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class EmpAdd extends AbstractEvent {

    private Long id;
    private String userId;
    private RankId rankId;
    private DeptId deptId;
    private List<EmpUser> empUser;

    public EmpAdd(Emp aggregate) {
        super(aggregate);
    }

    public EmpAdd() {
        super();
    }
}
