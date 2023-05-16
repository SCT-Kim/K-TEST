package ktest.domain;

import java.util.*;
import ktest.domain.*;
import ktest.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class RankAdd extends AbstractEvent {

    private Long id;
    private String name;

    public RankAdd(Rank aggregate) {
        super(aggregate);
    }

    public RankAdd() {
        super();
    }
}
