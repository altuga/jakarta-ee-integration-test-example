FROM airhacks/glassfish
COPY ./target/airport.war ${DEPLOYMENT_DIR}
