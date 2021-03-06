//import com.fast.config.FastDaoConfig;
//import com.fast.dao.mybatis.FastMyBatisImpl;
//import org.springframework.context.annotation.Bean;
//
//import java.util.concurrent.TimeUnit;
//
////@Component
//public class FastSetConfig {
//
//
//    @Bean
//    public void fastJdbcConfig() {
//
//        /**
//         * 配置创建
//         * 参数1: 使用的ORM实现, 框架自身可选值 1:SpringJDBCMySqlImpl.class:使用SpringJDBC实现, 2:FastMyBatisImpl.class: 使用MyBatis实现
//         * 参数2: 框架操作的主键字段名称
//         * 参数3: 框架操作的主键类型
//         */
//
//        /**
//         * 设置使用哪种方式执行Dao,默认SpringJDBCMySqlImpl.class
//         */
//        FastDaoConfig.daoActuator(FastMyBatisImpl.class);
//
//
//        /**
//         * 字段驼峰转换 例 user_name = userName
//         */
//        FastDaoConfig.openToCamelCase();
//        /**
//         * 框架使用的是INFO级别
//         * 参数1: 是否打印SQL日志
//         * 参数2: 是否打印SQL执行结果
//         */
//        FastDaoConfig.openSqlPrint(true, true);
//        /**
//         * 开启自动对数据 新增操作 进行创建时间设置
//         * 参数1: 需要设置创建时间的字段名
//         */
//        FastDaoConfig.openAutoSetCreateTime("create_time");
//        /**
//         * 开启自动对数据 更新操作|逻辑删除操作 进行更新时间设置
//         * 参数1: 需要设置更新时间的字段名
//         */
//        FastDaoConfig.openAutoSetUpdateTime("update_time");
//
//        /**
//         * 开启逻辑删除功能,开启后会对逻辑删除标记的数据在 更新|删除|查询 时进行保护,可通过模板进行单次操作逻辑删除保护的关闭
//         * 参数1:  逻辑删除字段名
//         * 参数2:  逻辑删除标记默认值
//         */
//        FastDaoConfig.openLogicDelete("deleted", Boolean.TRUE);
//
//        /**
//         * 开启缓存功能,三种缓存模式<本地缓存，Redis缓存，本地和Redis结合缓存>,支持缓存的自动刷新<更新,删除,新增>后会自动刷新缓存的数据
//         * 参数1:  默认缓存时间
//         * 参数2:  默认缓存时间类型
//         */
//        FastDaoConfig.openCache(10L, TimeUnit.SECONDS);
//
//    }
//
//}
