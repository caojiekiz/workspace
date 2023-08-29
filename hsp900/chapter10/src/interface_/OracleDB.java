package interface_;

public class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接oracle数据库");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle数据库");
    }
}
