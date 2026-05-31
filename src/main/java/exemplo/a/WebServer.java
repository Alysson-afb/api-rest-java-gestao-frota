package exemplo.a;

import exemplo.servlet.VeiculoServlet;
import java.awt.Desktop;
import java.net.URI;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class WebServer {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirectoriesListed(false);
        resourceHandler.setWelcomeFiles(new String[]{"index.html"});
        resourceHandler.setResourceBase("src/main/resources/web");

        ServletContextHandler servletContext =
                new ServletContextHandler(ServletContextHandler.NO_SESSIONS);

        servletContext.setContextPath("/");
        servletContext.addServlet(
                new ServletHolder(new VeiculoServlet()),
                "/veiculos/*"
        );

        HandlerList handlers = new HandlerList();
        handlers.addHandler(resourceHandler);
        handlers.addHandler(servletContext);

        server.setHandler(handlers);

        server.start();

        System.out.println("Frontend: http://localhost:8080/");
        System.out.println("API: http://localhost:8080/veiculos");

        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(
                    new URI("http://localhost:8080/")
            );
        }

        server.join();
    }
}