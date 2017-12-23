A demonstration that Jetty's absolute resource handling will fail in nested directories if proxied behind a proxy.


docker-compose up.

http://localhost:8080 is the location served directly from Jetty.

http://localhost/jetty is the same location, proxied by nginx.
