FROM nginx

COPY nginx.conf /etc/nginx/nginx.conf
COPY jetty.conf /etc/nginx/conf.d/default.conf


ENTRYPOINT nginx -g "daemon off;"
