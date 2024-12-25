import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args) {
        // 数据库连接URL，根据你的数据库配置进行调整
        String url = "jdbc:mysql://localhost:3306/cinema";
        // 数据库用户名
        String user = "root";
        // 数据库密码
        String password = "123156ss";

        try {
            // 加载JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 获取数据库连接
            Connection conn = DriverManager.getConnection(url, user, password);
            // 创建Statement对象
            Statement stmt = conn.createStatement();
            // 执行查询
            ResultSet rs = stmt.executeQuery("SELECT 1");
            // 处理查询结果
            if (rs.next()) {
                System.out.println("成功连接到数据库！");
            }
            // 关闭资源
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC驱动未找到: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("数据库连接错误: " + e.getMessage());
        }
    }
}
