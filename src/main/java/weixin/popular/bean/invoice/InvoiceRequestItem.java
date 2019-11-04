package weixin.popular.bean.invoice;

public class InvoiceRequestItem {
    public InvoiceRequestItem(String card_id, String encrypt_code) {
        this.card_id = card_id;
        this.encrypt_code = encrypt_code;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getEncrypt_code() {
        return encrypt_code;
    }

    public void setEncrypt_code(String encrypt_code) {
        this.encrypt_code = encrypt_code;
    }

    private String card_id;
    private String encrypt_code;
}
