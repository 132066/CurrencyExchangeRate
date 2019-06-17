package cn.edu.gdpt.currencyexchangerate.Tab;

import java.util.List;

public class Bank {

    /**
     * msg : success
     * result : [{"bank":"cmbchina","bankName":"招商银行","currencyCode":"USD","currencyName":"美元","date":"2019-06-12","fBuyPri":"690.2900","fSellPri":"693.2600","mBuyPri":"684.6100","mSellPri":"693.2600","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"EUR","currencyName":"欧元","date":"2019-06-12","fBuyPri":"780.4400","fSellPri":"786.7000","mBuyPri":"755.7500","mSellPri":"786.7000","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"HKD","currencyName":"港币","date":"2019-06-12","fBuyPri":"88.1900","fSellPri":"88.5500","mBuyPri":"87.5700","mSellPri":"88.5500","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"JPY","currencyName":"日元","date":"2019-06-12","fBuyPri":"6.3480","fSellPri":"6.3990","mBuyPri":"6.1472","mSellPri":"6.3990","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"GBP","currencyName":"英镑","date":"2019-06-12","fBuyPri":"875.9000","fSellPri":"882.9400","mBuyPri":"848.2000","mSellPri":"882.9400","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"AUD","currencyName":"澳大利亚元","date":"2019-06-12","fBuyPri":"478.7600","fSellPri":"482.6000","mBuyPri":"463.6200","mSellPri":"482.6000","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"CAD","currencyName":"加拿大元","date":"2019-06-12","fBuyPri":"518.3400","fSellPri":"522.5000","mBuyPri":"501.9500","mSellPri":"522.5000","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"SGD","currencyName":"新加坡元","date":"2019-06-12","fBuyPri":"504.8100","fSellPri":"508.8700","mBuyPri":"488.8500","mSellPri":"508.8700","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"NZD","currencyName":"新西兰元","date":"2019-06-12","fBuyPri":"452.5200","fSellPri":"456.1600","mBuyPri":"438.2100","mSellPri":"456.1600","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"CHF","currencyName":"瑞士法郎","date":"2019-06-12","fBuyPri":"694.1800","fSellPri":"699.7600","mBuyPri":"672.2300","mSellPri":"699.7600","time":"11:40:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"RMB","currencyName":"人民币","date":"2019-05-16","fBuyPri":"10.0000","fSellPri":"880.0800","mSellPri":"880.0800","time":"10:05:02"},{"bank":"cmbchina","bankName":"招商银行","currencyCode":"","currencyName":"","date":"2019-05-16","time":"10:05:02"}]
     * retCode : 200
     */

    private String msg;
    private String retCode;
    private List<ResultBean> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * bank : cmbchina
         * bankName : 招商银行
         * currencyCode : USD
         * currencyName : 美元
         * date : 2019-06-12
         * fBuyPri : 690.2900
         * fSellPri : 693.2600
         * mBuyPri : 684.6100
         * mSellPri : 693.2600
         * time : 11:40:02
         */

        private String bank;
        private String bankName;
        private String currencyCode;
        private String currencyName;
        private String date;
        private String fBuyPri;
        private String fSellPri;
        private String mBuyPri;
        private String mSellPri;
        private String time;

        public String getBank() {
            return bank;
        }

        public void setBank(String bank) {
            this.bank = bank;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public String getCurrencyName() {
            return currencyName;
        }

        public void setCurrencyName(String currencyName) {
            this.currencyName = currencyName;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getFBuyPri() {
            return fBuyPri;
        }

        public void setFBuyPri(String fBuyPri) {
            this.fBuyPri = fBuyPri;
        }

        public String getFSellPri() {
            return fSellPri;
        }

        public void setFSellPri(String fSellPri) {
            this.fSellPri = fSellPri;
        }

        public String getMBuyPri() {
            return mBuyPri;
        }

        public void setMBuyPri(String mBuyPri) {
            this.mBuyPri = mBuyPri;
        }

        public String getMSellPri() {
            return mSellPri;
        }

        public void setMSellPri(String mSellPri) {
            this.mSellPri = mSellPri;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
