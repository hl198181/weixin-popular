package weixin.popular.example;

import weixin.popular.api.InvoiceAPI;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.invoice.InvoiceReimburseState;
import weixin.popular.support.TokenManager;

public class UpdateInvoiceState {
    public static void main(String[] args) {
        TokenManager.init("wx1c72fbda7681a333", "c7e6ec6f33aac6c9bcee54fa33be202e");
        String token = TokenManager.getToken("wx1c72fbda7681a333");
        System.out.println(token);
        BaseResult result = InvoiceAPI
                .updateInvoiceStatus(token, "pY8ML6Nb7CmCpHw7YbNe1FytVl6s", "O/mPnGTpBu22a1szmK2ogzhFPBh9eYzv2p70L8yzyynoQU+oRJwrjKsJ5bnEE/mAtmM8Ydv+r+JLW7WF/kcfKyPn/apleXk26/+J+cHFPcPvQPblTvlIZbVVBfIbPGnE", InvoiceReimburseState.INVOICE_REIMBURSE_INIT);
        System.out.println(result);
    }
}
