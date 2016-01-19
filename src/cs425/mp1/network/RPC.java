package cs425.mp1.network;

/**
 */
public class RPC {
    public static int RPC_START = 100;

    public RPC() {
    }

    public RPC(String tag, String msg) {
        this.tag = tag;
        this.msg = msg;
        this.RPC_ID = ++RPC_START;
    }

    String tag;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;
    int RPC_ID;
}
