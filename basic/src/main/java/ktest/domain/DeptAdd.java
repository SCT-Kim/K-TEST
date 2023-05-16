package ktest.domain;

import java.util.*;
import ktest.domain.*;
import ktest.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class DeptAdd extends AbstractEvent {

    private Long id;
    private String name;

    public DeptAdd(Dept aggregate) {
        super(aggregate);
    }

    public DeptAdd() {
        super();
    }
}
