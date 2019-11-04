package weixin.popular.bean.invoice;

import weixin.popular.bean.BaseResult;

import java.util.List;

public class InvoiceListResult extends BaseResult {
    public List<InvoiceResult> getItem_list() {
        return item_list;
    }

    public void setItem_list(List<InvoiceResult> item_list) {
        this.item_list = item_list;
    }

    private List<InvoiceResult> item_list;
}
