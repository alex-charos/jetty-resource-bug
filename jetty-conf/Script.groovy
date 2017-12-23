

@Grapes([
    @Grab(group='org.eclipse.jetty.aggregate', module='jetty-server', version='8.1.7.v20120910'),
    @Grab(group='org.eclipse.jetty.aggregate', module='jetty-servlet', version='8.1.7.v20120910'),
    @Grab(group='javax.servlet', module='javax.servlet-api', version='3.0.1')])

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.*
import groovy.servlet.*

def runServer() {
       def server = new Server(8080)
 
    def handler = new ServletContextHandler(ServletContextHandler.SESSIONS)
    handler.contextPath = '/'
    handler.resourceBase = '.'
    handler.addServlet(GroovyServlet, '/scripts/*')
    def filesHolder = handler.addServlet(DefaultServlet, '/')
    filesHolder.setInitParameter('resourceBase', './test')
 
    server.handler = handler
    server.start()
}

runServer()

