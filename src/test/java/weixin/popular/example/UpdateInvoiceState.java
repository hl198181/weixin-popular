package weixin.popular.example;

import weixin.popular.api.InvoiceAPI;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.invoice.InvoiceReimburseState;
import weixin.popular.support.TokenManager;

public class UpdateInvoiceState {
    public static void main(String[] args) {
        TokenManager.init("test", "test");
        String token = TokenManager.getToken("test");
        System.out.println(token);
        BaseResult result = InvoiceAPI
                .updateInvoiceStatus(token, "test", "test", InvoiceReimburseState.INVOICE_REIMBURSE_INIT);
        System.out.println(result);
    }
}
