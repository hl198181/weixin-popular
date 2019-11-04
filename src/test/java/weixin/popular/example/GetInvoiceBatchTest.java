package weixin.popular.example;

import weixin.popular.api.InvoiceAPI;
import weixin.popular.bean.invoice.GetInvoiceBatchRequest;
import weixin.popular.bean.invoice.InvoiceListResult;
import weixin.popular.support.TokenManager;

public class GetInvoiceBatchTest {
    public static void main(String[] args) {
        TokenManager.init("test", "test");
        String token = TokenManager.getToken("test");
        System.out.println(token);
        GetInvoiceBatchRequest request = new GetInvoiceBatchRequest()
                .add("test", "test")
                .add("test", "test");
        InvoiceListResult invoiceListResult = InvoiceAPI.getInvoiceBatch(token, request);
        System.out.println(invoiceListResult);
    }
}
