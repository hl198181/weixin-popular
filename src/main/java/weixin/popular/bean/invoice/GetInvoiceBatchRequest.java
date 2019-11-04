package weixin.popular.bean.invoice;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class GetInvoiceBatchRequest {
    private List<InvoiceRequestItem> item_list;

    public List<InvoiceRequestItem> getItem_list() {
        return item_list;
    }

    public void setItem_list(List<InvoiceRequestItem> item_list) {
        this.item_list = item_list;
    }

    public GetInvoiceBatchRequest add(String codeId, String encryptCode) {
        if (item_list == null) this.item_list = new ArrayList<>();
        item_list.add(new InvoiceRequestItem(codeId, encryptCode));
        return this;
    }

    public String toJson() {
        return JSONObject.toJSONString(this);
    }
}
