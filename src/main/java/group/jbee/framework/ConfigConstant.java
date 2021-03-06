package group.jbee.framework;

/**
 * 提供相关配置项常量
 * @author huangbaoyuan
 * @version 1.0.0
 */
public interface ConfigConstant {

    String CONFIG_FILE="jbee.properties";
    String JDBC_DRIVER="jbee.framework.jdbc.driver";
    String JDBC_URL="jbee.framework.jdbc.url";
    String JDBC_USERNAME="jbee.framework.jdbc.username";
    String JDBC_PASSWORD="jbee.framework.jdbc.password";
    String JDBC_MAXCNN="jbee.framework.jdbc.max";
    String JDBC_MINCNN="jbee.framework.jdbc.min";

    String APP_BASE_PACKAGE="jbee.framework.app.base_package";
    String APP_JSP_PATH="jbee.framework.app.jsp_path";
    String APP_STATIC_PATH="jbee.framework.app.static_path";
}
