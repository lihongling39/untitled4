package oop;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by 李红玲 on 2018/7/17.
 */
public class JBDCBook {

    private Connection getConnection() {
        //1.加载驱动器
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建数据库连接字符串
            String dbURL = "jdbc:mysql://127.0.0.1:3306/nbl11";
            //3.建立数据库连接
            try {
                Connection connection = DriverManager.getConnection(dbURL, "root", "root");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void testInsertDate(int id, String book_name, String book_publishers, String book_author) {
        Connection connection = null;
        Statement statement = null;
        try {
            //1.创建数据库连接
            connection = getConnection();
            //2.构建添加数据的sql语句
            String sql = "insert into jdbcbook  values(" + id + ",'" + book_name + "','" + book_publishers + "','" + book_author + "')";
            //3.执行sql语句
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            close(connection, statement, null);
        }

    }

    private void testUpdateDate(int id, String book_name, String book_publishers, String book_author) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            String sql = "Update jdbcbook set book_name='" + book_name + "',book_publishers='" + book_publishers + "',book_author='" + book_author + "',where id=" + id + "";
            statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);
            System.out.println("更新结果为:" + (rows > 0));
            //1.创建数据库连接
            //2.执行update语句
            //3.得到执行结果，确定是否成功
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            close(connection, statement, null);
        }

    }
    private  void  findAllData() {
        StringBuffer buffer = new StringBuffer();
        //4.遍厉结果集，输出每条记录的信息
        buffer.append("--------------------------------------------------------------------------");
        buffer.append("id +\t\t\tbook_name\t\t\tbook_publishers\t\t\t\t\t\tbook_author\t\t\t" + System.lineSeparator());
        buffer.append("---------------------------------------------------------------------------");
        System.out.println(buffer.toString());

    }

    private void findAccountDataById(int id) {

    }

    //模糊搜索数据，根据用户输入的关键词来模糊查询
    private void findAccountDataLikeKey(String keyWord) {
        Connection connection = null;
        Statement statement = null;
        connection = getConnection();
        String sql = "select book_name,book_publishers,book_author,id from jdbcbook" + "where book_name like %" + keyWord + "%' " +
                "or book_publishers like %" + keyWord + "%'book_author like %" + keyWord + "%'";
        try {
            statement = connection.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            close(connection, statement, null);
        }


    }

    private void close(Connection connection, Statement statement, ResultSet resultSet) {


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        select = scanner.nextInt();
        System.exit(-1);
}
    }