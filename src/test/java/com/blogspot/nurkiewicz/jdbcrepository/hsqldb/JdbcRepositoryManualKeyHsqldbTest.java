package com.blogspot.nurkiewicz.jdbcrepository.hsqldb;

import com.blogspot.nurkiewicz.jdbcrepository.JdbcRepositoryManualKeyTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author Tomasz Nurkiewicz
 * @since 1/9/13, 10:19 PM
 */
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = JdbcRepositoryTestHsqldbConfig.class)
public class JdbcRepositoryManualKeyHsqldbTest extends JdbcRepositoryManualKeyTest {
}
