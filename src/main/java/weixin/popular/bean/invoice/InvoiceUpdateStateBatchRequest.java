package weixin.popular.bean.invoice;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class InvoiceUpdateStateBatchRequest {
    private String openid;
    private InvoiceReimburseState reimburse_status;
    private List<InvoiceRequestItem> invoice_list;

    public InvoiceUpdateStateBatchRequest(String openid, InvoiceReimburseState reimburse_status) {
        this.openid = openid;
        this.reimburse_status = reimburse_status;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public InvoiceReimburseState getReimburse_status() {
        return reimburse_status;
    }

    public void setReimburse_status(InvoiceReimburseState reimburse_status) {
        this.reimburse_status = reimburse_status;
    }

    public List<InvoiceRequestItem> getInvoice_list() {
        return invoice_list;
    }

    public void setInvoice_list(List<InvoiceRequestItem> invoice_list) {
        this.invoice_list = invoice_list;
    }


    public String toJson() {
        return JSONObject.toJSONString(this);
    }

    public InvoiceUpdateStateBatchRequest add(String codeId, String encryptCode) {
        if (invoice_list == null) this.invoice_list = new ArrayList<>();
        invoice_list.add(new InvoiceRequestItem(codeId, encryptCode));
        return this;
    }
}
