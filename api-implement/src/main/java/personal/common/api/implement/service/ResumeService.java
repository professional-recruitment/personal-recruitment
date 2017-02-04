package personal.common.api.implement.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import personal.common.api.framework.jdbc.ServiceException;
import personal.common.api.framework.jdbc.dao.DataAccessor;
import personal.common.api.framework.jdbc.paging.Paging;
import personal.common.api.implement.constant.Message;
import personal.common.api.implement.result.ResumeResult;

/**
 * Created by isenhome on 2017/1/29.
 */
@Service
public class ResumeService {

    @Autowired
    private DataAccessor dataAccessor;

    public Paging<ResumeResult> getPaging(int pageNumber, int pageSize, Map<String, Object> whereCondition, String orderBy) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("orderBy", orderBy);
        paramMap.putAll(whereCondition);
        return dataAccessor.selectPaging("ResumeMapper.selectPaging", paramMap, pageNumber, pageSize);
    }

    public ResumeResult get(long id) {
        ResumeResult result = dataAccessor.selectOne("ResumeMapper.selectById", id);
        if (result == null) {
            throw new ServiceException(Message.QUERY_FAILURE);
        }
        return result;
    }

    @Transactional
    public void update(ResumeResult resumeResult) {
        dataAccessor.update("ResumeMapper.update", resumeResult);
    }

    @Transactional
    public void delete(long id) {
        dataAccessor.update("ResumeMapper.delete", id);
    }

    @Transactional
    public void create(ResumeResult resumeResult) {
        dataAccessor.insert("ResumeMapper.insert", resumeResult);
    }

}
