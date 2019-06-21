package khoapham.ptp.phamtanphat.apphoctienganh1005;

public class Word {
    private int id;
    private String en;
    private String vn;
    private boolean isMemorized;

    public Word(int id, String en, String vn, boolean isMemorized) {
        this.id = id;
        this.en = en;
        this.vn = vn;
        this.isMemorized = isMemorized;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public boolean isMemorized() {
        return isMemorized;
    }

    public void setMemorized(boolean memorized) {
        isMemorized = memorized;
    }
}
