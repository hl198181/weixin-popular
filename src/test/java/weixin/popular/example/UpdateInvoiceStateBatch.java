package weixin.popular.example;

import weixin.popular.api.InvoiceAPI;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.invoice.InvoiceReimburseState;
import weixin.popular.bean.invoice.InvoiceUpdateStateBatchRequest;
import weixin.popular.support.TokenManager;

import java.io.UnsupportedEncodingException;

public class UpdateInvoiceStateBatch {
    public static void main(String[] args) throws UnsupportedEncodingException {
        TokenManager.init("test", "test");
        String token = TokenManager.getToken("test");
        System.out.println(token);

        InvoiceUpdateStateBatchRequest request = new InvoiceUpdateStateBatchRequest("test", InvoiceReimburseState.INVOICE_REIMBURSE_INIT)
                .add("test", "test")
                .add("test", "test");

        BaseResult result = InvoiceAPI
                .updateInvoiceStatusBatch(token, request);

        System.out.println(result.getErrcode() + "-" + result.getErrmsg());
    }
}
