
# Subscriptions Movilgate Adapter

This project implements the adapter for the integration with Movilgate for subscriptions. <br/>

## Modules
- **Subscriptions Movilgate Adapter API**: Dropwizard API for Subscriptions Movilgate Adapter, contains all the model classes.
- **Subscriptions Movilgate Adapter Config**: This module makes available a class to obtain the start configuration for Movilgate according to the type of configuration.
- **Subscriptions Movilgate Adapter Service**: RESTful service implementation for Subscriptions Movilgate Adapter.

## EndPoints
- **Web flow**: Resource for resend pin and confirm pin in web flow.
- **Get status**: Resource to obtain the status of a Movilgate subscription in the internal database.

## Comments
- For send and confirm pin of a subscription the field IdTranExtPartner that is sent to Movilgate API is conformed by `[clickId]`.

## Build
> ### Do:
> `mvn clean install -P [maven_pom_profile]`
>
> ### Example in production server:
> `mvn clean install -DskipTests -P env-prod`  
<br/>
> **Note:** The `-DskipTests` property is for technical debt in the unit tests.  
<br/>

## Deployment

To run the microservice, execute the next command:

>   `java -jar subs-movilgate-adapter-service-${VERSION}.jar server configuration.yaml`

> ### For example :
>   `java -jar subs-movilgate-adapter-service-1.0.0.jar server configuration.yml`
  

## Installation

> **Server**: RACK-AMK

> ##### Node 1
> **Installation directory**: `/tank/sva/subscriptions/integrations/movilgate/subs-movilgate-adapter-node1`

> **Logs directory**: `/tank/sva/subscriptions/integrations/movilgate/subs-movilgate-adapter-node1/logs`