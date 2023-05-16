package ktest.infra;

import ktest.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class EmpHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Emp>> {

    @Override
    public EntityModel<Emp> process(EntityModel<Emp> model) {
        return model;
    }
}
