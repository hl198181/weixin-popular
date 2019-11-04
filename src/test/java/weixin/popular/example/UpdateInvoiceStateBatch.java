package weixin.popular.example;

import weixin.popular.api.InvoiceAPI;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.invoice.InvoiceReimburseState;
import weixin.popular.bean.invoice.InvoiceUpdateStateBatchRequest;
import weixin.popular.support.TokenManager;

import java.io.UnsupportedEncodingException;

public class UpdateInvoiceStateBatch {
    public static void main(String[] args) throws UnsupportedEncodingException {
        TokenManager.init("wx1c72fbda7681a333", "c7e6ec6f33aac6c9bcee54fa33be202e");
        String token = TokenManager.getToken("wx1c72fbda7681a333");
        System.out.println(token);

        InvoiceUpdateStateBatchRequest request = new InvoiceUpdateStateBatchRequest("ojUtPwmvx-9KG1O0A35OZLUzNKLA", InvoiceReimburseState.INVOICE_REIMBURSE_INIT)
                .add("pY8ML6Nb7CmCpHw7YbNe1FytVl6s", "O/mPnGTpBu22a1szmK2ogzhFPBh9eYzv2p70L8yzyynoQU+oRJwrjKsJ5bnEE/mAtmM8Ydv+r+JLW7WF/kcfKyPn/apleXk26/+J+cHFPcPvQPblTvlIZbVVBfIbPGnE")
                .add("pY8ML6Nb7CmCpHw7YbNe1FytVl6s", "O/mPnGTpBu22a1szmK2ogzhFPBh9eYzv2p70L8yzyynoQU+oRJwrjKsJ5bnEE/mAjI8HjU8dSV7C+66JqY37vxPF4gJ3QRRlLLMG3fnM+0LvQPblTvlIZbVVBfIbPGnE");

        BaseResult result = InvoiceAPI
                .updateInvoiceStatusBatch(token, request);

        System.out.println(result.getErrcode() + "-" + result.getErrmsg());
    }
}
