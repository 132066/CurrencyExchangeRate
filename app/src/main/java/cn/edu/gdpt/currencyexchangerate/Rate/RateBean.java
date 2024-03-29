package cn.edu.gdpt.currencyexchangerate.Rate;

import java.util.List;

public class RateBean {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"data1":{"name":"英镑","fBuyPri":"1001.430","mBuyPri":"970.510","fSellPri":"1009.480","mSellPri":"1009.480","bankConversionPri":"1014.870","date":"2012-12-13","time":"16:25:49"},"data2":{"name":"港币","fBuyPri":"80.210","mBuyPri":"79.570","fSellPri":"80.520","mSellPri":"80.520","bankConversionPri":"81.140","date":"2012-12-13","time":"16:25:49"},"data3":{"name":"美元","fBuyPri":"621.650","mBuyPri":"616.670","fSellPri":"624.150","mSellPri":"624.150","bankConversionPri":"628.870","date":"2012-12-13","time":"16:25:49"},"data4":{"name":"瑞士法郎","fBuyPri":"670.310","mBuyPri":"649.620","fSellPri":"675.700","mSellPri":"675.700","bankConversionPri":"674.350","date":"2012-12-13","time":"16:25:49"},"data5":{"name":"新加坡元","fBuyPri":"508.300","mBuyPri":"492.610","fSellPri":"512.390","mSellPri":"512.390","bankConversionPri":"512.000","date":"2012-12-13","time":"16:25:49"},"data6":{"name":"瑞典克朗","fBuyPri":"93.340","mBuyPri":"90.450","fSellPri":"94.090","mSellPri":"94.090","bankConversionPri":"93.770","date":"2012-12-13","time":"16:25:49"},"data7":{"name":"丹麦克朗","fBuyPri":"108.920","mBuyPri":"105.550","fSellPri":"109.790","mSellPri":"109.790","bankConversionPri":"109.430","date":"2012-12-13","time":"16:25:49"},"data8":{"name":"挪威克朗","fBuyPri":"110.490","mBuyPri":"107.080","fSellPri":"111.380","mSellPri":"111.380","bankConversionPri":"111.060","date":"2012-12-13","time":"16:25:49"},"data9":{"name":"日元","fBuyPri":"7.431","mBuyPri":"7.201","fSellPri":"7.483","mSellPri":"7.483","bankConversionPri":"7.531","date":"2012-12-13","time":"16:25:49"},"data10":{"name":"加拿大元","fBuyPri":"630.950","mBuyPri":"611.470","fSellPri":"636.010","mSellPri":"636.010","bankConversionPri":"638.800","date":"2012-12-13","time":"16:25:49"},"data11":{"name":"澳大利亚元","fBuyPri":"654.900","mBuyPri":"634.680","fSellPri":"660.160","mSellPri":"660.160","bankConversionPri":"663.300","date":"2012-12-13","time":"16:25:49"},"data12":{"name":"欧元","fBuyPri":"812.520","mBuyPri":"787.430","fSellPri":"819.040","mSellPri":"819.040","bankConversionPri":"821.960","date":"2012-12-13","time":"16:25:49"},"data13":{"name":"澳门元","fBuyPri":"77.910","mBuyPri":"75.300","fSellPri":"78.210","mSellPri":"80.720","bankConversionPri":"78.320","date":"2012-12-13","time":"16:25:49"},"data14":{"name":"菲律宾比索","fBuyPri":"15.100","mBuyPri":"14.640","fSellPri":"15.220","mSellPri":"15.690","bankConversionPri":"15.220","date":"2012-12-13","time":"16:25:49"},"data15":{"name":"泰国铢","fBuyPri":"20.240","mBuyPri":"19.620","fSellPri":"20.400","mSellPri":"21.030","bankConversionPri":"20.390","date":"2012-12-13","time":"16:25:49"},"data16":{"name":"新西兰元","fBuyPri":"524.400","mBuyPri":"0.000","fSellPri":"528.610","mSellPri":"0.000","bankConversionPri":"526.770","date":"2012-12-13","time":"16:25:49"},"data17":{"name":"韩国元","fBuyPri":"0.000","mBuyPri":"0.560","fSellPri":"0.000","mSellPri":"0.608","bankConversionPri":"0.586","date":"2012-12-13","time":"16:25:49"}}]
     */

    private String resultcode;
    private String reason;
    private List<ResultBean> result;

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
         * data1 : {"name":"英镑","fBuyPri":"1001.430","mBuyPri":"970.510","fSellPri":"1009.480","mSellPri":"1009.480","bankConversionPri":"1014.870","date":"2012-12-13","time":"16:25:49"}
         * data2 : {"name":"港币","fBuyPri":"80.210","mBuyPri":"79.570","fSellPri":"80.520","mSellPri":"80.520","bankConversionPri":"81.140","date":"2012-12-13","time":"16:25:49"}
         * data3 : {"name":"美元","fBuyPri":"621.650","mBuyPri":"616.670","fSellPri":"624.150","mSellPri":"624.150","bankConversionPri":"628.870","date":"2012-12-13","time":"16:25:49"}
         * data4 : {"name":"瑞士法郎","fBuyPri":"670.310","mBuyPri":"649.620","fSellPri":"675.700","mSellPri":"675.700","bankConversionPri":"674.350","date":"2012-12-13","time":"16:25:49"}
         * data5 : {"name":"新加坡元","fBuyPri":"508.300","mBuyPri":"492.610","fSellPri":"512.390","mSellPri":"512.390","bankConversionPri":"512.000","date":"2012-12-13","time":"16:25:49"}
         * data6 : {"name":"瑞典克朗","fBuyPri":"93.340","mBuyPri":"90.450","fSellPri":"94.090","mSellPri":"94.090","bankConversionPri":"93.770","date":"2012-12-13","time":"16:25:49"}
         * data7 : {"name":"丹麦克朗","fBuyPri":"108.920","mBuyPri":"105.550","fSellPri":"109.790","mSellPri":"109.790","bankConversionPri":"109.430","date":"2012-12-13","time":"16:25:49"}
         * data8 : {"name":"挪威克朗","fBuyPri":"110.490","mBuyPri":"107.080","fSellPri":"111.380","mSellPri":"111.380","bankConversionPri":"111.060","date":"2012-12-13","time":"16:25:49"}
         * data9 : {"name":"日元","fBuyPri":"7.431","mBuyPri":"7.201","fSellPri":"7.483","mSellPri":"7.483","bankConversionPri":"7.531","date":"2012-12-13","time":"16:25:49"}
         * data10 : {"name":"加拿大元","fBuyPri":"630.950","mBuyPri":"611.470","fSellPri":"636.010","mSellPri":"636.010","bankConversionPri":"638.800","date":"2012-12-13","time":"16:25:49"}
         * data11 : {"name":"澳大利亚元","fBuyPri":"654.900","mBuyPri":"634.680","fSellPri":"660.160","mSellPri":"660.160","bankConversionPri":"663.300","date":"2012-12-13","time":"16:25:49"}
         * data12 : {"name":"欧元","fBuyPri":"812.520","mBuyPri":"787.430","fSellPri":"819.040","mSellPri":"819.040","bankConversionPri":"821.960","date":"2012-12-13","time":"16:25:49"}
         * data13 : {"name":"澳门元","fBuyPri":"77.910","mBuyPri":"75.300","fSellPri":"78.210","mSellPri":"80.720","bankConversionPri":"78.320","date":"2012-12-13","time":"16:25:49"}
         * data14 : {"name":"菲律宾比索","fBuyPri":"15.100","mBuyPri":"14.640","fSellPri":"15.220","mSellPri":"15.690","bankConversionPri":"15.220","date":"2012-12-13","time":"16:25:49"}
         * data15 : {"name":"泰国铢","fBuyPri":"20.240","mBuyPri":"19.620","fSellPri":"20.400","mSellPri":"21.030","bankConversionPri":"20.390","date":"2012-12-13","time":"16:25:49"}
         * data16 : {"name":"新西兰元","fBuyPri":"524.400","mBuyPri":"0.000","fSellPri":"528.610","mSellPri":"0.000","bankConversionPri":"526.770","date":"2012-12-13","time":"16:25:49"}
         * data17 : {"name":"韩国元","fBuyPri":"0.000","mBuyPri":"0.560","fSellPri":"0.000","mSellPri":"0.608","bankConversionPri":"0.586","date":"2012-12-13","time":"16:25:49"}
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
        private Data14Bean data14;
        private Data15Bean data15;
        private Data16Bean data16;
        private Data17Bean data17;

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

        public Data14Bean getData14() {
            return data14;
        }

        public void setData14(Data14Bean data14) {
            this.data14 = data14;
        }

        public Data15Bean getData15() {
            return data15;
        }

        public void setData15(Data15Bean data15) {
            this.data15 = data15;
        }

        public Data16Bean getData16() {
            return data16;
        }

        public void setData16(Data16Bean data16) {
            this.data16 = data16;
        }

        public Data17Bean getData17() {
            return data17;
        }

        public void setData17(Data17Bean data17) {
            this.data17 = data17;
        }

        public static class Data1Bean {
            /**
             * name : 英镑
             * fBuyPri : 1001.430
             * mBuyPri : 970.510
             * fSellPri : 1009.480
             * mSellPri : 1009.480
             * bankConversionPri : 1014.870
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data2Bean {
            /**
             * name : 港币
             * fBuyPri : 80.210
             * mBuyPri : 79.570
             * fSellPri : 80.520
             * mSellPri : 80.520
             * bankConversionPri : 81.140
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data3Bean {
            /**
             * name : 美元
             * fBuyPri : 621.650
             * mBuyPri : 616.670
             * fSellPri : 624.150
             * mSellPri : 624.150
             * bankConversionPri : 628.870
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data4Bean {
            /**
             * name : 瑞士法郎
             * fBuyPri : 670.310
             * mBuyPri : 649.620
             * fSellPri : 675.700
             * mSellPri : 675.700
             * bankConversionPri : 674.350
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data5Bean {
            /**
             * name : 新加坡元
             * fBuyPri : 508.300
             * mBuyPri : 492.610
             * fSellPri : 512.390
             * mSellPri : 512.390
             * bankConversionPri : 512.000
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data6Bean {
            /**
             * name : 瑞典克朗
             * fBuyPri : 93.340
             * mBuyPri : 90.450
             * fSellPri : 94.090
             * mSellPri : 94.090
             * bankConversionPri : 93.770
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data7Bean {
            /**
             * name : 丹麦克朗
             * fBuyPri : 108.920
             * mBuyPri : 105.550
             * fSellPri : 109.790
             * mSellPri : 109.790
             * bankConversionPri : 109.430
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data8Bean {
            /**
             * name : 挪威克朗
             * fBuyPri : 110.490
             * mBuyPri : 107.080
             * fSellPri : 111.380
             * mSellPri : 111.380
             * bankConversionPri : 111.060
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data9Bean {
            /**
             * name : 日元
             * fBuyPri : 7.431
             * mBuyPri : 7.201
             * fSellPri : 7.483
             * mSellPri : 7.483
             * bankConversionPri : 7.531
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data10Bean {
            /**
             * name : 加拿大元
             * fBuyPri : 630.950
             * mBuyPri : 611.470
             * fSellPri : 636.010
             * mSellPri : 636.010
             * bankConversionPri : 638.800
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data11Bean {
            /**
             * name : 澳大利亚元
             * fBuyPri : 654.900
             * mBuyPri : 634.680
             * fSellPri : 660.160
             * mSellPri : 660.160
             * bankConversionPri : 663.300
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data12Bean {
            /**
             * name : 欧元
             * fBuyPri : 812.520
             * mBuyPri : 787.430
             * fSellPri : 819.040
             * mSellPri : 819.040
             * bankConversionPri : 821.960
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data13Bean {
            /**
             * name : 澳门元
             * fBuyPri : 77.910
             * mBuyPri : 75.300
             * fSellPri : 78.210
             * mSellPri : 80.720
             * bankConversionPri : 78.320
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data14Bean {
            /**
             * name : 菲律宾比索
             * fBuyPri : 15.100
             * mBuyPri : 14.640
             * fSellPri : 15.220
             * mSellPri : 15.690
             * bankConversionPri : 15.220
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data15Bean {
            /**
             * name : 泰国铢
             * fBuyPri : 20.240
             * mBuyPri : 19.620
             * fSellPri : 20.400
             * mSellPri : 21.030
             * bankConversionPri : 20.390
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data16Bean {
            /**
             * name : 新西兰元
             * fBuyPri : 524.400
             * mBuyPri : 0.000
             * fSellPri : 528.610
             * mSellPri : 0.000
             * bankConversionPri : 526.770
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class Data17Bean {
            /**
             * name : 韩国元
             * fBuyPri : 0.000
             * mBuyPri : 0.560
             * fSellPri : 0.000
             * mSellPri : 0.608
             * bankConversionPri : 0.586
             * date : 2012-12-13
             * time : 16:25:49
             */

            private String name;
            private String fBuyPri;
            private String mBuyPri;
            private String fSellPri;
            private String mSellPri;
            private String bankConversionPri;
            private String date;
            private String time;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFBuyPri() {
                return fBuyPri;
            }

            public void setFBuyPri(String fBuyPri) {
                this.fBuyPri = fBuyPri;
            }

            public String getMBuyPri() {
                return mBuyPri;
            }

            public void setMBuyPri(String mBuyPri) {
                this.mBuyPri = mBuyPri;
            }

            public String getFSellPri() {
                return fSellPri;
            }

            public void setFSellPri(String fSellPri) {
                this.fSellPri = fSellPri;
            }

            public String getMSellPri() {
                return mSellPri;
            }

            public void setMSellPri(String mSellPri) {
                this.mSellPri = mSellPri;
            }

            public String getBankConversionPri() {
                return bankConversionPri;
            }

            public void setBankConversionPri(String bankConversionPri) {
                this.bankConversionPri = bankConversionPri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }
    }
}
