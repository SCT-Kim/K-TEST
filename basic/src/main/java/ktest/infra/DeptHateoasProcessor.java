package ktest.infra;

import ktest.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DeptHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Dept>> {

    @Override
    public EntityModel<Dept> process(EntityModel<Dept> model) {
        return model;
    }
}
