package entity;
/*
    优秀团队表
 */

import org.omg.CORBA.PUBLIC_MEMBER;

public class team {
    public int  FinancialAffairs;
    public int  AHR;
    public int  SALES1;
    public int  SALES2;
    public int  SALES6;
    public int  SALES7;
    public int  PM1;
    public int  PM2;
    public int  ProductMarketing;
    public int  shipping;
    public int  QC;
    public int  NingboBranch;

    public team() {
    }

    public team(int financialAffairs, int AHR, int SALES1, int SALES2, int SALES6, int SALES7, int PM1, int PM2, int productMarketing, int shipping, int QC, int ningboBranch) {
        FinancialAffairs = financialAffairs;
        this.AHR = AHR;
        this.SALES1 = SALES1;
        this.SALES2 = SALES2;
        this.SALES6 = SALES6;
        this.SALES7 = SALES7;
        this.PM1 = PM1;
        this.PM2 = PM2;
        ProductMarketing = productMarketing;
        this.shipping = shipping;
        this.QC = QC;
        NingboBranch = ningboBranch;
    }

    public int getFinancialAffairs() {
        return FinancialAffairs;
    }

    public void setFinancialAffairs(int financialAffairs) {
        FinancialAffairs = financialAffairs;
    }

    public int getAHR() {
        return AHR;
    }

    public void setAHR(int AHR) {
        this.AHR = AHR;
    }

    public int getSALES1() {
        return SALES1;
    }

    public void setSALES1(int SALES1) {
        this.SALES1 = SALES1;
    }

    public int getSALES2() {
        return SALES2;
    }

    public void setSALES2(int SALES2) {
        this.SALES2 = SALES2;
    }

    public int getSALES6() {
        return SALES6;
    }

    public void setSALES6(int SALES6) {
        this.SALES6 = SALES6;
    }

    public int getSALES7() {
        return SALES7;
    }

    public void setSALES7(int SALES7) {
        this.SALES7 = SALES7;
    }

    public int getPM1() {
        return PM1;
    }

    public void setPM1(int PM1) {
        this.PM1 = PM1;
    }

    public int getPM2() {
        return PM2;
    }

    public void setPM2(int PM2) {
        this.PM2 = PM2;
    }

    public int getProductMarketing() {
        return ProductMarketing;
    }

    public void setProductMarketing(int productMarketing) {
        ProductMarketing = productMarketing;
    }

    public int getShipping() {
        return shipping;
    }

    public void setShipping(int shipping) {
        this.shipping = shipping;
    }

    public int getQC() {
        return QC;
    }

    public void setQC(int QC) {
        this.QC = QC;
    }

    public int getNingboBranch() {
        return NingboBranch;
    }

    public void setNingboBranch(int ningboBranch) {
        NingboBranch = ningboBranch;
    }

    @Override
    public String toString() {
        return "team{" +
                "FinancialAffairs=" + FinancialAffairs +
                ", AHR=" + AHR +
                ", SALES1=" + SALES1 +
                ", SALES2=" + SALES2 +
                ", SALES6=" + SALES6 +
                ", SALES7=" + SALES7 +
                ", PM1=" + PM1 +
                ", PM2=" + PM2 +
                ", ProductMarketing=" + ProductMarketing +
                ", shipping=" + shipping +
                ", QC=" + QC +
                ", NingboBranch=" + NingboBranch +
                '}';
    }
}
