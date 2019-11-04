package weixin.popular.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.invoice.*;
import weixin.popular.client.LocalHttpClient;

import java.nio.charset.StandardCharsets;

public class InvoiceAPI extends BaseAPI {
    public static InvoiceResult getInvoice(String access_token, String cardId, String encryptCode) {
        String json = String.format("{\"card_id\":\"%s\",\"encrypt_code\":\"%s\"}", cardId, encryptCode);
        HttpUriRequest httpUriRequest = RequestBuilder.post()
                .setHeader(jsonHeader)
                .setUri(BASE_URI + "/card/invoice/reimburse/getinvoiceinfo")
                .addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
                .setEntity(new StringEntity(json, StandardCharsets.UTF_8))
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest, InvoiceResult.class);
    }

    public static InvoiceListResult getInvoiceBatch(String access_token, GetInvoiceBatchRequest request) {
        String json = request.toJson();
        HttpUriRequest httpUriRequest = RequestBuilder.post()
                .setHeader(jsonHeader)
                .setUri(BASE_URI + "/card/invoice/reimburse/getinvoicebatch")
                .addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
                .setEntity(new StringEntity(json, StandardCharsets.UTF_8))
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest, InvoiceListResult.class);
    }

    public static BaseResult updateInvoiceStatus(String access_token, String cardId, String encryptCode, InvoiceReimburseState state) {
        String json = String.format("{\"card_id\":\"%s\",\"encrypt_code\":\"%s\",\"reimburse_status\":\"%s\"}", cardId, encryptCode, state.name());
        HttpUriRequest httpUriRequest = RequestBuilder.post()
                .setHeader(jsonHeader)
                .setUri(BASE_URI + "/card/invoice/reimburse/updateinvoicestatus")
                .addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
                .setEntity(new StringEntity(json, StandardCharsets.UTF_8))
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest, BaseResult.class);
    }

    //状态周期
    //INIT -> LOCK(可以回退到INIT) -> CLOSURE or CANCEL
    public static BaseResult updateInvoiceStatusBatch(String access_token, InvoiceUpdateStateBatchRequest request) {
        String json = request.toJson();
        HttpUriRequest httpUriRequest = RequestBuilder.post()
                .setHeader(jsonHeader)
                .setUri(BASE_URI + "/card/invoice/reimburse/updatestatusbatch")
                .addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
                .setEntity(new StringEntity(json, StandardCharsets.UTF_8))
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest, BaseResult.class);
    }
}
