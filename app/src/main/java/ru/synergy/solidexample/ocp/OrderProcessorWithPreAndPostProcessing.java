package ru.synergy.solidexample.ocp;

import ru.synergy.solidexample.models.Order;
import ru.synergy.solidexample.srp.right.OrderProcessor; // импортируем класс удовлетворяющий SRP

public class OrderProcessorWithPreAndPostProcessing extends OrderProcessor {
    @Override
    public void process(Order order) {
        beforeProcessing();
        super.process(order);
        afterProcessing();
    }

    private void beforeProcessing() {
        // Осуществим некоторые действия перед обработкой заказа
    }

    private void afterProcessing() {
        // Осуществим некоторые действия после обработки заказа
    }

}
