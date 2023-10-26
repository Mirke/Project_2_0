package com.mirke.messagebroker;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfiguration {

    @Value("${spring.rabbitmq.host}") // Get the RabbitMQ host from application.properties or application.yml
    private String rabbitHost;

    @Value("${spring.rabbitmq.port}") // Get the RabbitMQ port
    private int rabbitPort;

    @Value("${spring.rabbitmq.username}") // Get the RabbitMQ username
    private String rabbitUsername;

    @Value("${spring.rabbitmq.password}") // Get the RabbitMQ password
    private String rabbitPassword;

    @Bean
    public Queue queue() {
        return new Queue("tut.rpc.requests");
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange("tut.rpc");
    }

    @Bean
    public Binding binding(DirectExchange exchange,
                           Queue queue) {
        return BindingBuilder.bind(queue)
                .to(exchange)
                .with("rpc");
    }

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses(rabbitHost + ":" + rabbitPort);
        connectionFactory.setUsername(rabbitUsername);
        connectionFactory.setPassword(rabbitPassword);

        // You can configure other connection properties if needed

        return connectionFactory;
    }
}
