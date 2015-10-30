package test;

import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class HelloServlet implements ServletContextListener {
  private static final Logger LOG = LoggerFactory.getLogger(HelloServlet.class);

  public void contextInitialized(final ServletContextEvent sce) {
    LOG.info("INFO SERVER INIT");
    final Map<String, String> env = System.getenv();
    for (final String key : env.keySet()) {
      LOG.info("ENV {} = {}", key, env.get(key));
    }

  }

  public void contextDestroyed(final ServletContextEvent sce) {
  }

}
