package personal.common.api.implement.controller;

import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import personal.common.api.framework.bean.PagingParam;
import personal.common.api.framework.bean.PagingResult;
import personal.common.api.framework.bean.Response;
import personal.common.api.framework.jdbc.paging.Paging;
import personal.common.api.implement.param.ResumeParam;
import personal.common.api.implement.result.ResumeResult;
import personal.common.api.implement.service.ResumeService;

/**
 * Created by isenhome on 2017/1/29.
 */
@RestController
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping(value = "/resume/list", method = RequestMethod.GET)
    public Response list(
            PagingParam pagingParam
    ) {
        int pageNumber = pagingParam.getPagingNumber();
        int pageSize = pagingParam.getPageSize();
        Map<String, Object> whereCondition = pagingParam.getWhereCondition();
        String orderBy = pagingParam.getOrderBy();
        Paging<ResumeResult> resumeResultPaging = resumeService.getPaging(pageNumber, pageSize, whereCondition, orderBy);
        return new Response().success(new PagingResult<>(resumeResultPaging));
    }

    @RequestMapping(value = "/resume/{id}", method = RequestMethod.GET)
    public Response get(
            @PathVariable("id") long id
    ) {
        ResumeResult resumeResult = resumeService.get(id);
        return new Response().success(resumeResult);
    }

    @RequestMapping(value = "/resume/{id}", method = RequestMethod.PUT)
    public Response update(
            @PathVariable("id") long id,
            @RequestBody @Valid ResumeParam resumeParam
    ) {
        String name = resumeParam.getName();

        ResumeResult resumeResult = new ResumeResult();
        resumeResult.setId(id);
        resumeResult.setName(name);
        resumeService.update(resumeResult);
        return new Response().success();
    }

    @RequestMapping(value = "/resume/{id}", method = RequestMethod.DELETE)
    public Response delete(
            @PathVariable("id") long id
    ) {
        resumeService.delete(id);
        return new Response().success();
    }

    @RequestMapping(value = "/resume", method = RequestMethod.POST)
    public Response create(
            @RequestBody @Valid ResumeParam resumeParam
    ) {
        String name = resumeParam.getName();
        ResumeResult resumeResult = new ResumeResult();
        resumeResult.setName(name);
        resumeService.create(resumeResult);
        return new Response().success();
    }

}
