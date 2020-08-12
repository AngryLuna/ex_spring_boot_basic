package sample;

public class TomcatApplication {
//    public static void main(final String[] args) throws LifecycleException {
//        final Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
//
//        final Context context = tomcat.addContext("/", new File(".").getAbsolutePath());
//
//        final HttpServlet servlet = new HttpServlet() {
//            @Override
//            protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
//                final PrintWriter writer = response.getWriter();
//
//                writer.println("<html>");
//                writer.println("<head>");
//                writer.println("<title>Hey, Tomcat</title>");
//                writer.println("</head>");
//                writer.println("<body>");
//                writer.println("<h1>Hello, Tomcat</h1>");
//                writer.println("</body>");
//                writer.println("</html>");
//            }
//        };
//
//        final String servletName = "helloServlet";
//        tomcat.addServlet("/", servletName, servlet);
//        context.addServletMappingDecoded("/hello", servletName);
//
//        tomcat.start();
//        tomcat.getServer().await();
//    }
}
