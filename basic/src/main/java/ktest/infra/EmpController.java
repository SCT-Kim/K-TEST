package ktest.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import ktest.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/emps")
@Transactional
public class EmpController {

    @Autowired
    EmpRepository empRepository;

    @PutMapping("/emps/search/findByUserId")
    public Object findByUserId(@RequestBody EmpViewQuery query) {
        return empRepository.findByUserId(query.getUserId());
    }
}
