package ru.synergy.solidexample.lsp;

import ru.synergy.solidexample.models.Item;
import ru.synergy.solidexample.models.Order;

public class OrderStockValidator {

    public boolean isValid(Order order) {
        for (Item item : order.getItems()) {
            if (! item.isInStock()) {
                return false;
            }
        }

        return true;
    }
}

