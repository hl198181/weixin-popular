package weixin.popular.example;

import weixin.popular.api.InvoiceAPI;
import weixin.popular.bean.invoice.GetInvoiceBatchRequest;
import weixin.popular.bean.invoice.InvoiceListResult;
import weixin.popular.support.TokenManager;

public class GetInvoiceBatchTest {
    public static void main(String[] args) {
        TokenManager.init("wx1c72fbda7681a333", "c7e6ec6f33aac6c9bcee54fa33be202e");
        String token = TokenManager.getToken("wx1c72fbda7681a333");
        System.out.println(token);
        GetInvoiceBatchRequest request = new GetInvoiceBatchRequest()
                .add("pY8ML6Nb7CmCpHw7YbNe1FytVl6s", "O/mPnGTpBu22a1szmK2ogzhFPBh9eYzv2p70L8yzyynoQU+oRJwrjKsJ5bnEE/mAtmM8Ydv+r+JLW7WF/kcfKyPn/apleXk26/+J+cHFPcPvQPblTvlIZbVVBfIbPGnE")
                .add("pY8ML6Nb7CmCpHw7YbNe1FytVl6s", "O/mPnGTpBu22a1szmK2ogzhFPBh9eYzv2p70L8yzyynoQU+oRJwrjKsJ5bnEE/mAjI8HjU8dSV7C+66JqY37vxPF4gJ3QRRlLLMG3fnM+0LvQPblTvlIZbVVBfIbPGnE");
        InvoiceListResult invoiceListResult = InvoiceAPI.getInvoiceBatch(token, request);
        System.out.println(invoiceListResult);
    }
}
