package personal.common.api.framework.bean;


import java.util.HashMap;
import java.util.Map;
import personal.common.api.framework.util.JsonUtil;
import personal.common.api.framework.util.StringUtil;

/**
 * 分页参数对象
 *
 * @author anyone
 * @since 1.0.0
 */
public class PagingParam {

    private int offset;

    private int limit;

    private String search;

    private String sort;

    private String order;

    // ----------------------------------------------------------------------------------------------------

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    // ----------------------------------------------------------------------------------------------------

    public int getPagingNumber() {
        if (limit == 0) {
            return 1;
        }
        return offset / limit + 1;
    }

    public int getPageSize() {
        return limit;
    }

    public Map<String, Object> getWhereCondition() {
        if (this.search == null) {
            return new HashMap<>();
        }
        return JsonUtil.objectToMap(this.search);
    }

    public String getOrderBy() {
        if (StringUtil.isEmpty(sort) || StringUtil.isEmpty(order)) {
            return null;
        }
        return sort + " " + order.toUpperCase();
    }
}
