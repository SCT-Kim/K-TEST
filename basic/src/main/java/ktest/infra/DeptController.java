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
// @RequestMapping(value="/depts")
@Transactional
public class DeptController {

    @Autowired
    DeptRepository deptRepository;

    @PutMapping("/depts/search/findByName")
    public Object findByName(@RequestBody DeptViewQuery query) {
        return deptRepository.findByName(query.getUserId());
    }
}
