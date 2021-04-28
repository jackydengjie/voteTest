package entity;
/*
    记录MAC和IP地址
 */

public class address {
    private String macaddress;
    private String ipaddress;
    private String cname;

    public address() {
    }

    public address(String macaddress, String ipaddress, String cname) {
        this.macaddress = macaddress;
        this.ipaddress = ipaddress;
        this.cname = cname;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "address{" +
                "macaddress='" + macaddress + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}
