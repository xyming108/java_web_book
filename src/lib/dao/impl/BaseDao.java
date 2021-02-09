package lib.dao.impl;

import lib.utils.jdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @user: Hasee
 * @date: 2021/1/20 15:53
 * @author: 1931559710@qq.com
 * ClassName: BaseDao
 * Description:
 */
public abstract class BaseDao {

    //使用DbUtils操作数据库
    private QueryRunner queryRunner = new QueryRunner();

    //用来执行数据库增删改语句
    //如果返回-1.说明执行失败；返回其他表示影响的行数
    public int update(String sql, Object... args) {
        Connection connection = jdbcUtils.getConnection();
        try {
            return queryRunner.update(connection, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    //查询返回一个javaBean的sql语句
    //type：返回的对象类型
    //sql：执行的sql语句
    //args：sql对应的参数值
    //<T>：返回的类型的泛型
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        Connection con = jdbcUtils.getConnection();
        try {
            return queryRunner.query(con, sql, new BeanHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    //查询返回多个javaBean的sql语句
    //type：返回的对象类型
    //sql：执行的sql语句
    //args：sql对应的参数值
    //<T>：返回的类型的泛型
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        Connection con = jdbcUtils.getConnection();
        try {
            return queryRunner.query(con, sql, new BeanListHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    //执行返回一行一列的sql语句
    //sql：执行的sql语句
    //args：sql对应的参数值
    public Object queryForSingleValue(String sql, Object... args) {
        Connection connection = jdbcUtils.getConnection();
        try {
            return queryRunner.query(connection, sql, new ScalarHandler(), args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
