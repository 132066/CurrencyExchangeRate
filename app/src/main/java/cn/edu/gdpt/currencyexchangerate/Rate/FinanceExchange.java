package cn.edu.gdpt.currencyexchangerate.Rate;

import java.util.List;

public class FinanceExchange {

    /**
     * error_code : 0
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"data1":{"buyPic":"0.6878","closePri":"0.6878","code":"AUDUSD","color":"","currency":"澳元美元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"0.00030","diffPer":"0.0436%","highPic":"0.6886","lowPic":"0.6872","openPri":"0.6876","range":"0.2%","sellPic":"0.6879","yesPic":"0.6875"},"data2":{"buyPic":"97.6252","closePri":"97.6252","code":"DINIW","color":"","currency":"美元指数","datatime":"08:53:05","date":"2019-06-19","diffAmo":"-0.0183","diffPer":"-0.0187%","highPic":"97.6604","lowPic":"97.5918","openPri":"97.6393","range":"0.07%","sellPic":"97.6252","yesPic":"97.6435"},"data3":{"buyPic":"1.1199","closePri":"1.1199","code":"EURUSD","color":"","currency":"欧元美元","datatime":"08:53:02","date":"2019-06-19","diffAmo":"0.00050","diffPer":"0.0447%","highPic":"1.1202","lowPic":"1.1193","openPri":"1.1194","range":"0.08%","sellPic":"1.1200","yesPic":"1.1194"},"data4":{"buyPic":"1.2561","closePri":"1.2561","code":"GBPUSD","color":"","currency":"英镑美元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"0.00060","diffPer":"0.0478%","highPic":"1.2570","lowPic":"1.2553","openPri":"1.2553","range":"0.14%","sellPic":"1.2562","yesPic":"1.2555"},"data5":{"buyPic":"0.6531","closePri":"0.6531","code":"NZDUSD","color":"","currency":"新西兰元美元","datatime":"08:53:03","date":"2019-06-19","diffAmo":"0.00030","diffPer":"0.046%","highPic":"0.6539","lowPic":"0.6525","openPri":"0.6529","range":"0.21%","sellPic":"0.6531","yesPic":"0.6528"},"data6":{"buyPic":"1.3370","closePri":"1.3370","code":"USDCAD","color":"","currency":"美元加元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"-0.00060","diffPer":"-0.0449%","highPic":"1.3377","lowPic":"1.3363","openPri":"1.3375","range":"0.1%","sellPic":"1.3371","yesPic":"1.3376"},"data7":{"buyPic":"1.0009","closePri":"1.0009","code":"USDCHF","color":"","currency":"美元瑞郎","datatime":"08:53:03","date":"2019-06-19","diffAmo":"0.00090","diffPer":"0.09%","highPic":"1.0011","lowPic":"0.9999","openPri":"1.0001","range":"0.12%","sellPic":"1.0010","yesPic":"1.0000"},"data8":{"buyPic":"6.9032","closePri":"6.9035","code":"USDCNY","color":"","currency":"美元人民币","datatime":"23:29:00","date":"2019-06-18","diffAmo":"-0.0223","diffPer":"-0.322%","highPic":"6.9321","lowPic":"6.9022","openPri":"6.9256","range":"0.43%","sellPic":"6.9032","yesPic":"6.9258"},"data9":{"buyPic":"7.8314","closePri":"7.8314","code":"USDHKD","color":"","currency":"美元港元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"-0.00020","diffPer":"-0.0026%","highPic":"7.8327","lowPic":"7.8302","openPri":"7.8316","range":"0.03%","sellPic":"7.8315","yesPic":"7.8316"},"data10":{"buyPic":"108.55","closePri":"108.55","code":"USDJPY","color":"","currency":"美元日元","datatime":"08:53:05","date":"2019-06-19","diffAmo":"0.09","diffPer":"0.083%","highPic":"108.62","lowPic":"108.43","openPri":"108.46","range":"0.18%","sellPic":"108.59","yesPic":"108.46"},"data11":{"buyPic":"4.1730","closePri":"4.1730","code":"USDMYR","color":"","currency":"美元马币","datatime":"08:47:39","date":"2019-06-19","diffAmo":"-0.007","diffPer":"-0.1675%","highPic":"4.1730","lowPic":"4.1690","openPri":"4.1700","range":"0.1%","sellPic":"0.0000","yesPic":"4.1800"},"data12":{"buyPic":"1.3671","closePri":"1.3671","code":"USDSGD","color":"","currency":"美元新加坡元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"0.00030","diffPer":"0.0219%","highPic":"1.3673","lowPic":"1.3661","openPri":"1.3668","range":"0.09%","sellPic":"1.3672","yesPic":"1.3668"},"data13":{"buyPic":"31.2600","closePri":"31.2600","code":"USDTWD","color":"","currency":"美元台币","datatime":"08:52:45","date":"2019-06-19","diffAmo":"0.0","diffPer":"0.0%","highPic":"31.3300","lowPic":"31.2500","openPri":"31.2500","range":"0.26%","sellPic":"31.3600","yesPic":"31.2600"}}]
     */

    private int error_code;
    private String resultcode;
    private String reason;
    private List<ResultBean> result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data1 : {"buyPic":"0.6878","closePri":"0.6878","code":"AUDUSD","color":"","currency":"澳元美元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"0.00030","diffPer":"0.0436%","highPic":"0.6886","lowPic":"0.6872","openPri":"0.6876","range":"0.2%","sellPic":"0.6879","yesPic":"0.6875"}
         * data2 : {"buyPic":"97.6252","closePri":"97.6252","code":"DINIW","color":"","currency":"美元指数","datatime":"08:53:05","date":"2019-06-19","diffAmo":"-0.0183","diffPer":"-0.0187%","highPic":"97.6604","lowPic":"97.5918","openPri":"97.6393","range":"0.07%","sellPic":"97.6252","yesPic":"97.6435"}
         * data3 : {"buyPic":"1.1199","closePri":"1.1199","code":"EURUSD","color":"","currency":"欧元美元","datatime":"08:53:02","date":"2019-06-19","diffAmo":"0.00050","diffPer":"0.0447%","highPic":"1.1202","lowPic":"1.1193","openPri":"1.1194","range":"0.08%","sellPic":"1.1200","yesPic":"1.1194"}
         * data4 : {"buyPic":"1.2561","closePri":"1.2561","code":"GBPUSD","color":"","currency":"英镑美元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"0.00060","diffPer":"0.0478%","highPic":"1.2570","lowPic":"1.2553","openPri":"1.2553","range":"0.14%","sellPic":"1.2562","yesPic":"1.2555"}
         * data5 : {"buyPic":"0.6531","closePri":"0.6531","code":"NZDUSD","color":"","currency":"新西兰元美元","datatime":"08:53:03","date":"2019-06-19","diffAmo":"0.00030","diffPer":"0.046%","highPic":"0.6539","lowPic":"0.6525","openPri":"0.6529","range":"0.21%","sellPic":"0.6531","yesPic":"0.6528"}
         * data6 : {"buyPic":"1.3370","closePri":"1.3370","code":"USDCAD","color":"","currency":"美元加元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"-0.00060","diffPer":"-0.0449%","highPic":"1.3377","lowPic":"1.3363","openPri":"1.3375","range":"0.1%","sellPic":"1.3371","yesPic":"1.3376"}
         * data7 : {"buyPic":"1.0009","closePri":"1.0009","code":"USDCHF","color":"","currency":"美元瑞郎","datatime":"08:53:03","date":"2019-06-19","diffAmo":"0.00090","diffPer":"0.09%","highPic":"1.0011","lowPic":"0.9999","openPri":"1.0001","range":"0.12%","sellPic":"1.0010","yesPic":"1.0000"}
         * data8 : {"buyPic":"6.9032","closePri":"6.9035","code":"USDCNY","color":"","currency":"美元人民币","datatime":"23:29:00","date":"2019-06-18","diffAmo":"-0.0223","diffPer":"-0.322%","highPic":"6.9321","lowPic":"6.9022","openPri":"6.9256","range":"0.43%","sellPic":"6.9032","yesPic":"6.9258"}
         * data9 : {"buyPic":"7.8314","closePri":"7.8314","code":"USDHKD","color":"","currency":"美元港元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"-0.00020","diffPer":"-0.0026%","highPic":"7.8327","lowPic":"7.8302","openPri":"7.8316","range":"0.03%","sellPic":"7.8315","yesPic":"7.8316"}
         * data10 : {"buyPic":"108.55","closePri":"108.55","code":"USDJPY","color":"","currency":"美元日元","datatime":"08:53:05","date":"2019-06-19","diffAmo":"0.09","diffPer":"0.083%","highPic":"108.62","lowPic":"108.43","openPri":"108.46","range":"0.18%","sellPic":"108.59","yesPic":"108.46"}
         * data11 : {"buyPic":"4.1730","closePri":"4.1730","code":"USDMYR","color":"","currency":"美元马币","datatime":"08:47:39","date":"2019-06-19","diffAmo":"-0.007","diffPer":"-0.1675%","highPic":"4.1730","lowPic":"4.1690","openPri":"4.1700","range":"0.1%","sellPic":"0.0000","yesPic":"4.1800"}
         * data12 : {"buyPic":"1.3671","closePri":"1.3671","code":"USDSGD","color":"","currency":"美元新加坡元","datatime":"08:53:04","date":"2019-06-19","diffAmo":"0.00030","diffPer":"0.0219%","highPic":"1.3673","lowPic":"1.3661","openPri":"1.3668","range":"0.09%","sellPic":"1.3672","yesPic":"1.3668"}
         * data13 : {"buyPic":"31.2600","closePri":"31.2600","code":"USDTWD","color":"","currency":"美元台币","datatime":"08:52:45","date":"2019-06-19","diffAmo":"0.0","diffPer":"0.0%","highPic":"31.3300","lowPic":"31.2500","openPri":"31.2500","range":"0.26%","sellPic":"31.3600","yesPic":"31.2600"}
         */

        private Data1Bean data1;
        private Data2Bean data2;
        private Data3Bean data3;
        private Data4Bean data4;
        private Data5Bean data5;
        private Data6Bean data6;
        private Data7Bean data7;
        private Data8Bean data8;
        private Data9Bean data9;
        private Data10Bean data10;
        private Data11Bean data11;
        private Data12Bean data12;
        private Data13Bean data13;

        public Data1Bean getData1() {
            return data1;
        }

        public void setData1(Data1Bean data1) {
            this.data1 = data1;
        }

        public Data2Bean getData2() {
            return data2;
        }

        public void setData2(Data2Bean data2) {
            this.data2 = data2;
        }

        public Data3Bean getData3() {
            return data3;
        }

        public void setData3(Data3Bean data3) {
            this.data3 = data3;
        }

        public Data4Bean getData4() {
            return data4;
        }

        public void setData4(Data4Bean data4) {
            this.data4 = data4;
        }

        public Data5Bean getData5() {
            return data5;
        }

        public void setData5(Data5Bean data5) {
            this.data5 = data5;
        }

        public Data6Bean getData6() {
            return data6;
        }

        public void setData6(Data6Bean data6) {
            this.data6 = data6;
        }

        public Data7Bean getData7() {
            return data7;
        }

        public void setData7(Data7Bean data7) {
            this.data7 = data7;
        }

        public Data8Bean getData8() {
            return data8;
        }

        public void setData8(Data8Bean data8) {
            this.data8 = data8;
        }

        public Data9Bean getData9() {
            return data9;
        }

        public void setData9(Data9Bean data9) {
            this.data9 = data9;
        }

        public Data10Bean getData10() {
            return data10;
        }

        public void setData10(Data10Bean data10) {
            this.data10 = data10;
        }

        public Data11Bean getData11() {
            return data11;
        }

        public void setData11(Data11Bean data11) {
            this.data11 = data11;
        }

        public Data12Bean getData12() {
            return data12;
        }

        public void setData12(Data12Bean data12) {
            this.data12 = data12;
        }

        public Data13Bean getData13() {
            return data13;
        }

        public void setData13(Data13Bean data13) {
            this.data13 = data13;
        }

        public static class Data1Bean {
            /**
             * buyPic : 0.6878
             * closePri : 0.6878
             * code : AUDUSD
             * color :
             * currency : 澳元美元
             * datatime : 08:53:04
             * date : 2019-06-19
             * diffAmo : 0.00030
             * diffPer : 0.0436%
             * highPic : 0.6886
             * lowPic : 0.6872
             * openPri : 0.6876
             * range : 0.2%
             * sellPic : 0.6879
             * yesPic : 0.6875
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data2Bean {
            /**
             * buyPic : 97.6252
             * closePri : 97.6252
             * code : DINIW
             * color :
             * currency : 美元指数
             * datatime : 08:53:05
             * date : 2019-06-19
             * diffAmo : -0.0183
             * diffPer : -0.0187%
             * highPic : 97.6604
             * lowPic : 97.5918
             * openPri : 97.6393
             * range : 0.07%
             * sellPic : 97.6252
             * yesPic : 97.6435
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data3Bean {
            /**
             * buyPic : 1.1199
             * closePri : 1.1199
             * code : EURUSD
             * color :
             * currency : 欧元美元
             * datatime : 08:53:02
             * date : 2019-06-19
             * diffAmo : 0.00050
             * diffPer : 0.0447%
             * highPic : 1.1202
             * lowPic : 1.1193
             * openPri : 1.1194
             * range : 0.08%
             * sellPic : 1.1200
             * yesPic : 1.1194
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data4Bean {
            /**
             * buyPic : 1.2561
             * closePri : 1.2561
             * code : GBPUSD
             * color :
             * currency : 英镑美元
             * datatime : 08:53:04
             * date : 2019-06-19
             * diffAmo : 0.00060
             * diffPer : 0.0478%
             * highPic : 1.2570
             * lowPic : 1.2553
             * openPri : 1.2553
             * range : 0.14%
             * sellPic : 1.2562
             * yesPic : 1.2555
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data5Bean {
            /**
             * buyPic : 0.6531
             * closePri : 0.6531
             * code : NZDUSD
             * color :
             * currency : 新西兰元美元
             * datatime : 08:53:03
             * date : 2019-06-19
             * diffAmo : 0.00030
             * diffPer : 0.046%
             * highPic : 0.6539
             * lowPic : 0.6525
             * openPri : 0.6529
             * range : 0.21%
             * sellPic : 0.6531
             * yesPic : 0.6528
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data6Bean {
            /**
             * buyPic : 1.3370
             * closePri : 1.3370
             * code : USDCAD
             * color :
             * currency : 美元加元
             * datatime : 08:53:04
             * date : 2019-06-19
             * diffAmo : -0.00060
             * diffPer : -0.0449%
             * highPic : 1.3377
             * lowPic : 1.3363
             * openPri : 1.3375
             * range : 0.1%
             * sellPic : 1.3371
             * yesPic : 1.3376
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data7Bean {
            /**
             * buyPic : 1.0009
             * closePri : 1.0009
             * code : USDCHF
             * color :
             * currency : 美元瑞郎
             * datatime : 08:53:03
             * date : 2019-06-19
             * diffAmo : 0.00090
             * diffPer : 0.09%
             * highPic : 1.0011
             * lowPic : 0.9999
             * openPri : 1.0001
             * range : 0.12%
             * sellPic : 1.0010
             * yesPic : 1.0000
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data8Bean {
            /**
             * buyPic : 6.9032
             * closePri : 6.9035
             * code : USDCNY
             * color :
             * currency : 美元人民币
             * datatime : 23:29:00
             * date : 2019-06-18
             * diffAmo : -0.0223
             * diffPer : -0.322%
             * highPic : 6.9321
             * lowPic : 6.9022
             * openPri : 6.9256
             * range : 0.43%
             * sellPic : 6.9032
             * yesPic : 6.9258
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data9Bean {
            /**
             * buyPic : 7.8314
             * closePri : 7.8314
             * code : USDHKD
             * color :
             * currency : 美元港元
             * datatime : 08:53:04
             * date : 2019-06-19
             * diffAmo : -0.00020
             * diffPer : -0.0026%
             * highPic : 7.8327
             * lowPic : 7.8302
             * openPri : 7.8316
             * range : 0.03%
             * sellPic : 7.8315
             * yesPic : 7.8316
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data10Bean {
            /**
             * buyPic : 108.55
             * closePri : 108.55
             * code : USDJPY
             * color :
             * currency : 美元日元
             * datatime : 08:53:05
             * date : 2019-06-19
             * diffAmo : 0.09
             * diffPer : 0.083%
             * highPic : 108.62
             * lowPic : 108.43
             * openPri : 108.46
             * range : 0.18%
             * sellPic : 108.59
             * yesPic : 108.46
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data11Bean {
            /**
             * buyPic : 4.1730
             * closePri : 4.1730
             * code : USDMYR
             * color :
             * currency : 美元马币
             * datatime : 08:47:39
             * date : 2019-06-19
             * diffAmo : -0.007
             * diffPer : -0.1675%
             * highPic : 4.1730
             * lowPic : 4.1690
             * openPri : 4.1700
             * range : 0.1%
             * sellPic : 0.0000
             * yesPic : 4.1800
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data12Bean {
            /**
             * buyPic : 1.3671
             * closePri : 1.3671
             * code : USDSGD
             * color :
             * currency : 美元新加坡元
             * datatime : 08:53:04
             * date : 2019-06-19
             * diffAmo : 0.00030
             * diffPer : 0.0219%
             * highPic : 1.3673
             * lowPic : 1.3661
             * openPri : 1.3668
             * range : 0.09%
             * sellPic : 1.3672
             * yesPic : 1.3668
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }

        public static class Data13Bean {
            /**
             * buyPic : 31.2600
             * closePri : 31.2600
             * code : USDTWD
             * color :
             * currency : 美元台币
             * datatime : 08:52:45
             * date : 2019-06-19
             * diffAmo : 0.0
             * diffPer : 0.0%
             * highPic : 31.3300
             * lowPic : 31.2500
             * openPri : 31.2500
             * range : 0.26%
             * sellPic : 31.3600
             * yesPic : 31.2600
             */

            private String buyPic;
            private String closePri;
            private String code;
            private String color;
            private String currency;
            private String datatime;
            private String date;
            private String diffAmo;
            private String diffPer;
            private String highPic;
            private String lowPic;
            private String openPri;
            private String range;
            private String sellPic;
            private String yesPic;

            public String getBuyPic() {
                return buyPic;
            }

            public void setBuyPic(String buyPic) {
                this.buyPic = buyPic;
            }

            public String getClosePri() {
                return closePri;
            }

            public void setClosePri(String closePri) {
                this.closePri = closePri;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDiffAmo() {
                return diffAmo;
            }

            public void setDiffAmo(String diffAmo) {
                this.diffAmo = diffAmo;
            }

            public String getDiffPer() {
                return diffPer;
            }

            public void setDiffPer(String diffPer) {
                this.diffPer = diffPer;
            }

            public String getHighPic() {
                return highPic;
            }

            public void setHighPic(String highPic) {
                this.highPic = highPic;
            }

            public String getLowPic() {
                return lowPic;
            }

            public void setLowPic(String lowPic) {
                this.lowPic = lowPic;
            }

            public String getOpenPri() {
                return openPri;
            }

            public void setOpenPri(String openPri) {
                this.openPri = openPri;
            }

            public String getRange() {
                return range;
            }

            public void setRange(String range) {
                this.range = range;
            }

            public String getSellPic() {
                return sellPic;
            }

            public void setSellPic(String sellPic) {
                this.sellPic = sellPic;
            }

            public String getYesPic() {
                return yesPic;
            }

            public void setYesPic(String yesPic) {
                this.yesPic = yesPic;
            }
        }
    }
}
