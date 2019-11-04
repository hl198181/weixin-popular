package weixin.popular.bean.invoice;

import weixin.popular.bean.BaseResult;

public class InvoiceResult extends BaseResult {
    private String card_id;
    private int begin_time;
    private int end_time;
    private String openid;
    private String type;
    private String payee;
    private String detail;
    private String user_info;

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public int getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(int begin_time) {
        this.begin_time = begin_time;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int end_time) {
        this.end_time = end_time;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUser_info() {
        return user_info;
    }

    public void setUser_info(String user_info) {
        this.user_info = user_info;
    }
}
