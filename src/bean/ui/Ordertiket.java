package bean.ui;

public class Ordertiket {
    private String id;
    private float JPJG;//及票价格
    private float airtax;//机票税；
    private float ranyou;//燃油
    private float baoxian;//保险
    private float jptgx;//季票退改险
    private float yhq;//优惠券
    private float hszj;//含税总价

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJPJG() {
        return JPJG;
    }

    public void setJPJG(float JPJG) {
        this.JPJG = JPJG;
    }

    public float getAirtax() {
        return airtax;
    }

    public void setAirtax(float airtax) {
        this.airtax = airtax;
    }

    public float getRanyou() {
        return ranyou;
    }

    public void setRanyou(float ranyou) {
        this.ranyou = ranyou;
    }

    public float getBaoxian() {
        return baoxian;
    }

    public void setBaoxian(float baoxian) {
        this.baoxian = baoxian;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }
}
