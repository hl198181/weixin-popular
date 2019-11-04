package weixin.popular.example;

import weixin.popular.api.InvoiceAPI;
import weixin.popular.bean.invoice.InvoiceResult;
import weixin.popular.support.TokenManager;

public class GetInvoiceTest {
    public static void main(String[] args) {
        TokenManager.init("test", "test");
        String token = TokenManager.getToken("test");
        System.out.println(token);
        InvoiceResult invoiceResult = InvoiceAPI.getInvoice(token, "test", "test");
        System.out.println(invoiceResult);

    }
}
