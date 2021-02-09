package lib.filter;

import lib.utils.jdbcUtils;

import javax.servlet.*;
import java.io.IOException;

/**
 * @user: Hasee
 * @date: 2021/2/7 16:24
 * @author: 1931559710@qq.com
 * ClassName: TransactionFilter
 * Description:
 */
public class TransactionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            filterChain.doFilter(servletRequest, servletResponse);
            jdbcUtils.commitAndClose(); //提交事务
        } catch (Exception e) {
            jdbcUtils.rollbackAndClose();   //提交事务
            e.printStackTrace();
            throw new RuntimeException(e);      //把异常抛给Tomcat管理展示有好的错误页面
        }
    }

    @Override
    public void destroy() {

    }
}
