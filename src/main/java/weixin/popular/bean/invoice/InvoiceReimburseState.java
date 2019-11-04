package weixin.popular.bean.invoice;

public enum InvoiceReimburseState {
    INVOICE_REIMBURSE_INIT, //发票初始状态，未锁定
    INVOICE_REIMBURSE_LOCK, //发票已锁定
    INVOICE_REIMBURSE_CLOSURE,//发票已核销
    INVOICE_REIMBURSE_CANCEL//发票被冲红

}
